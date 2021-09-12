package stepDefinitions;

import Utils.CommonMethods;
import Utils.Constants;
import Utils.ExcelUtility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

public class AddEmployeeStepDefinition extends CommonMethods {


    @Then("^navigate to add employee page$")
    public void navigate_to_add_employee_page() {
        click(dash.pimButton);
        click(pimPage.pimAddEmp);
    }

    @Then("^click on save Button$")
    public void click_on_save_button(){
        click(addEmp.saveButton_field);

    }

    @And("^enter first and last name$")
    public void enter_first_and_last_name() {
        sendText(addEmp.firstName_field,"Demo");
        sendText(addEmp.lastName_field,"Bado");

    }

    @And("^verify the employee is added successfully$")
    public void verify_the_employee_is_added_successfully() {

        Assert.assertTrue(persDetails.profilePicture.isDisplayed());


    }

    @When("enter first name as {string} middle name as {string} and last name as {string}")
    public void enter_first_name_as_middle_name_as_and_last_name_as(String firstName, String middleName, String lastName) {
        sendText(addEmp.firstName_field,firstName);
        sendText(addEmp.middleName_field,middleName);
        sendText(addEmp.lastName_field,lastName);
    }
    @Then("verify that {string} is added successfully")
    public void verify_that_is_added_successfully(String fullName) {

        Assert.assertTrue(persDetails.profileName.getText().equals(fullName));

    }

    @When("enter employee {string}, {string} and {string}")
    public void enter_employee_and(String firstName, String middleName, String lastName) {
        sendText(addEmp.firstName_field,firstName);
        sendText(addEmp.middleName_field,middleName);
        sendText(addEmp.lastName_field,lastName);

    }
    @Then("verify that {string}, {string} and {string} is successfully added")
    public void verify_that_and_is_successfully_added(String fName, String mName, String lName) {

        String fullName= fName + " " + mName + " "+ lName;
        String fullprofileName= persDetails.profileName.getText();

        Assert.assertEquals(fullprofileName,fullName);

    }

    @When("add multiple employees and verify they are added")
    public void add_multiple_employees_and_verify_they_are_added(DataTable employees) {
        List<Map<String,String>> employeeNames= employees.asMaps();

        for (Map<String ,String> employeeName: employeeNames){
            click(pimPage.pimAddEmp);
            String firstName=employeeName.get("First Name");
            String middleName=employeeName.get("Middle Name");
            String lastName=employeeName.get("Last Name");

            sendText(addEmp.firstName_field,firstName);
            sendText(addEmp.middleName_field,middleName);
            sendText(addEmp.lastName_field,lastName);
            click(addEmp.saveButton_field);

            Assert.assertTrue(driver.findElement(By.xpath("(//h1)[1]")).getText().equals(firstName+" "+middleName+" "+lastName));
        }

    }

    @When("add multiple employees from {string} verify they are added succesfully")
    public void add_multiple_employees_from_verify_they_are_added_succesfully(String sheetName) {

        List<Map<String , String>> excelDATA=  ExcelUtility.excelToMap(Constants.TESTDATA_FILEPATH,sheetName);

        for(Map<String , String> Excelemployeename: excelDATA){
            String firstnane =Excelemployeename.get("FirstName");
            String middlenane = Excelemployeename.get("MiddleName");
            String lastnane = Excelemployeename.get("LastName");


            sendText(addEmp.firstName_field, firstnane);
            sendText(addEmp.middleName_field, middlenane);
            sendText(addEmp.lastName_field, lastnane);

            click(addEmp.saveButton_field);
            click(pimPage.pimAddEmp);

        }


        }
}

package Pages;

import TestBase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePageElements extends BaseClass {
    @FindBy(id ="firstName" )
    public WebElement firstName_field;
    @FindBy(id ="middleName" )
    public WebElement middleName_field;
    @FindBy(id ="lastName" )
    public WebElement lastName_field;
    @FindBy(id ="employeeId" )
    public WebElement employeeId_field;
    @FindBy(id ="photofile" )
    public WebElement photograph_field;
    @FindBy(id ="btnSave" )
    public WebElement saveButton_field;
    @FindBy(id ="chkLogin" )
    public WebElement createLogin_checkBox;
    @FindBy(xpath = "(//span[@class='validation-error'])[1]")
    public WebElement firstNameRequired_error;
    @FindBy(xpath = "(//span[@class='validation-error'])[2]")
    public WebElement lastNameRequired_error;
    @FindBy(xpath = "//input[@name='user_name']")
    public WebElement userName_CreateLogin;
    @FindBy(xpath = "//input[@name='user_password']")
    public WebElement password_CreateLogin;
    @FindBy(xpath = "//input[@name='re_password']")
    public WebElement confirmPassword;

    public AddEmployeePageElements(){
        PageFactory.initElements(driver,this);
    }
}

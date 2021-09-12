package Pages;

import TestBase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetailsPageElements extends BaseClass {

    @FindBy(id = "empPic")
    public WebElement profilePicture;

    @FindBy(id = "profile-pic")
    public WebElement profileName;

    @FindBy(linkText = "Emergency Contacts")
    public WebElement emergencyContactsButton;

    @FindBy(linkText = "Qualifications")
    public WebElement QualificationsButton;

    @FindBy (id = "btnSave")
    public WebElement editButton;

    @FindBy (xpath = "//a[text()= 'Dependents']")
    public WebElement dependentsButton;

    @FindBy (id = "btnSave")
    public WebElement saveButton;

    @FindBy(linkText = "Salary")
    public WebElement salaryButton;

    @FindBy(linkText = "Contact Details")
    public WebElement contactDetailsButton;

   public PersonalDetailsPageElements(){
       PageFactory.initElements(driver,this);
   }

}

package Pages;

import TestBase.PageInitializer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElements extends PageInitializer {


    @FindBy(id = "txtUsername")
    public WebElement userNameTextBox;

    @FindBy(id = "txtPassword")
    public WebElement passwordTextBox;

    @FindBy(id = "btnLogin")
    public WebElement loginButton;

    @FindBy(id = "divLogo")
    public WebElement syntaxLogo;

    @FindBy(xpath = "//div[@id = 'logInPanelHeading']")
    public WebElement loginPanelHeading;


    @FindBy(id = "spanMessage1")
    public WebElement spanMsg;

    public void loginOrange(String username, String password) {
        login.userNameTextBox.sendKeys(username);
        login.passwordTextBox.sendKeys(password);
        login.loginButton.click();
    }
    public LoginPageElements(){
        PageFactory.initElements(driver,this);
    }

}

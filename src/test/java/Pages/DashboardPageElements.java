package Pages;

import TestBase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPageElements extends BaseClass {

    @FindBy(id = "welcome")
    public WebElement Db_welcomeSign;

    @FindBy(partialLinkText = "Logout")
    public WebElement Db_welcome_logout;

    @FindBy(partialLinkText = "Support")
    public WebElement DB_welcome_support;

    @FindBy(id="notification")
    public WebElement Db_notifications;

    @FindBy(id="MP_link")
    public WebElement Db_marketplace;

    @FindBy(xpath = "//span[text()='Assign Leave']")
    public WebElement Db_AssignLeave;

    @FindBy(id = "menu_pim_viewPimModule")
    public WebElement pimButton;

    @FindBy(xpath = "//div[@id='mainMenu']/ul/li")
    public List<WebElement> dashTabs;


   public DashboardPageElements(){
       PageFactory.initElements(driver,this);
   }
}

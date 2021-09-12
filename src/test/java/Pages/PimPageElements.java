package Pages;

import TestBase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPageElements extends BaseClass {
    @FindBy(id = "menu_pim_Configuration")
    public WebElement pimConfig;
    @FindBy(id = "menu_pim_viewEmployeeList")
    public WebElement empListButton;
    @FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
    public WebElement pimAddEmp;
    @FindBy(id = "menu_core_viewDefinedPredefinedReports")
    public WebElement pimReports;
    public PimPageElements(){
        PageFactory.initElements(driver,this);
    }
}



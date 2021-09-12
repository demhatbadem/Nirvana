package Utils;

import TestBase.PageInitializer;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public class  CommonMethods extends PageInitializer {

    /**
     * Method that sends text to any given element
     */

    public static void sendText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    /**
     * Method return Object of JavaScript Executor type
     *
     * @return
     */
    public static JavascriptExecutor getJSExecutor() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js;
    }
    public static void jsClick(WebElement element) {
        getJSExecutor().executeScript("arguments[0].click();", element);
    }
    public static void scrollUpp(int pixel) {
        getJSExecutor().executeScript("window.scrollBy(0,-" + pixel + ")");
    }
    public static void scrollDown(int pixel) {
        getJSExecutor().executeScript("window.scrollBy(0," + pixel + ")");
    }
    public static WebDriverWait getWaitObject() {

        return new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIME);
    }
    public static void waitForClickAbility(WebElement element) {

        getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitForVisibility(WebElement element) {
        getWaitObject().until(ExpectedConditions.visibilityOf(element));
    }

    public static void click(WebElement element) {
        waitForClickAbility(element);
        element.click();
    }

    public static void Login(){
        sendText(login.userNameTextBox, ConfigsReader.getPropertiesValue("username"));
        sendText(login.passwordTextBox, ConfigsReader.getPropertiesValue("password"));
        click(login.loginButton);
    }
    public static byte[] takeScreen(String fileName)  {
        TakesScreenshot ts =(TakesScreenshot) driver;
        byte[] bytes=ts.getScreenshotAs(OutputType.BYTES);
        File src=ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src,new File(Constants.SCREENSHOT_FILEPATH+fileName + LocalDate.now() + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bytes;
    }
}
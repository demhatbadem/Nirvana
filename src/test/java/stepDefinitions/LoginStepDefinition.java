package stepDefinitions;

import Utils.CommonMethods;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginStepDefinition extends CommonMethods{
        @When("^login with valid credentials$")
        public void login_with_valid_credentials() {
            Login();
        }
        @Then("^verify the dashboard logo is displayed$")
        public void verify_the_dashboard_logo_is_displayed() {
            Assert.assertTrue(dash.Db_welcomeSign.isDisplayed());
        }
        @When("^login with invalid credentials$")
        public void login_with_invalid_credentials(){
            login.loginOrange("demo","atsiz");
        }
        @Then("^verify the error message$")
        public void verify_the_error_message(){
            Assert.assertTrue(login.spanMsg.isDisplayed());
        }
    }


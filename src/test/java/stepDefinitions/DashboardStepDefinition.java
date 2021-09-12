package stepDefinitions;

import Utils.CommonMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DashboardStepDefinition extends CommonMethods {

    @Then("verify the following dashboard tabs")
    public void verify_the_following_dashboard_tabs(DataTable dashBoardTabs) {

            List<String> expectedDashTab=dashBoardTabs.asList();

            List<String> actualDashTabs=new ArrayList<>();

            for (WebElement dashTab: dash.dashTabs) {
                actualDashTabs.add(dashTab.getText());
            }
            System.out.println(actualDashTabs);
            System.out.println(expectedDashTab);

            Assert.assertTrue(expectedDashTab.equals(actualDashTabs));
            Assert.assertEquals(expectedDashTab,actualDashTabs);


        }
    }


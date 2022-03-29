package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US4_user_able_to_access_all_File_modules {
DashboardPage dashboardPage= new DashboardPage();


    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
       dashboardPage.login();
    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
      dashboardPage.filesModule.click();
    }
    @Then("verify the page title is {string}")
    public void verifyThePageTitleIs(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @And("user click the top-left checkbox of the table")
    public void userClickTheTopLeftCheckboxOfTheTable() {
        dashboardPage.checkboxFiles.click();
        BrowserUtils.sleep(2);
    }

    @Then("verify all the files are selected")
    public void verifyAllTheFilesAreSelected() {
        //list-container  has-controls multiselect
//        String actual = dashboardPage.getCheckboxFiles2.getText();
//        String expected = "list-container  has-controls multiselect";
//        System.out.println(actual);
    }


}

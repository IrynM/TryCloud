package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US1_User_should_be_able_to_login {
    DashboardPage dashboardPage = new DashboardPage();


    @Given("user on the login page {string}")
    public void user_on_the_login_page(String string) {
        Driver.getDriver().get(string);
    }

    @When("user use username {string} and passcode {string}")
    public void userUseUsernameAndPasscode(String userName, String password) {
        dashboardPage.username.sendKeys(userName);
        dashboardPage.password.sendKeys(password);

    }

    @When("user click the login button")
    public void user_click_the_login_button() {
        dashboardPage.logInButton.click();

    }

    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {
        //BrowserUtils.waitForVisibility(dashboardPage.dashboardIcon, 3);
        BrowserUtils.verifyTitle("Dashboard - Trycloud QA");
        Driver.closeDriver();

    }


}

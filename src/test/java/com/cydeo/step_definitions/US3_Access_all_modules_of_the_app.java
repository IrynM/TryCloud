package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US3_Access_all_modules_of_the_app {


DashboardPage dashboardPage= new DashboardPage();
    @Given("user on the login page")
    public void userOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("the users log in with valid credentials")
    public void theUsersLogInWithValidCredentials() {
        dashboardPage.username.sendKeys(ConfigurationReader.getProperty("user"));
        dashboardPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        dashboardPage.logInButton.click();
    }

    @Then("Verify the user see the following:")
    public void verifyTheUserSeeTheFollowing(List<String> expectedModule ) {


        for (int i = 0; i <= 8; i++) {
            String tab = Driver.getDriver().findElement(By.xpath("(//ul[@id='appmenu'])/li[(" + (i + 1) + ")]/a")).getAttribute("aria-label");
            Assert.assertEquals(expectedModule.get(i), tab);
        }
    }

}

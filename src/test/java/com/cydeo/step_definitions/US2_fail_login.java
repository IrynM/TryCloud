package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US2_fail_login {

DashboardPage dashboardPage= new DashboardPage();

    @When("user enter invalid {string} and {string}")
    public void user_enter_invalid_and(String string, String string2) {
       dashboardPage.username.sendKeys(string);
       dashboardPage.password.sendKeys(string);
       dashboardPage.logInButton.click();
    }
    @Then("verify {string} message should be displayed")
    public void verify_message_should_be_displayed(String expectedMessage) {
        String actualMessage = dashboardPage.wrongEmailOrPassMessage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
        System.out.println("expectedMessage = " + expectedMessage);
        System.out.println("actualMessage = " + actualMessage);

    }

}

package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.FilesPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.List;

public class US4_user_able_to_access_all_File_modules {
DashboardPage dashboardPage= new DashboardPage();
BasePage basePage=new BasePage();
FilesPage filesPage= new FilesPage();



    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
       dashboardPage.login();
    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
      //dashboardPage.filesModule.click();
        basePage.navigateToModule(string);
    }
    @Then("verify the page title is {string}")
    public void verifyThePageTitleIs(String expectedTitle) {
//        String actualTitle = Driver.getDriver().getTitle();
//        Assert.assertEquals(expectedTitle, actualTitle);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));

    }

    @And("user click the top-left checkbox of the table")
    public void user_click_the_top_left_checkbox_of_the_table() {
        BrowserUtils.waitForClickablility(filesPage.firstCheckBox,5);
        filesPage.firstCheckBox.click();

    }
    @Then("verify all the files are selected")
    public void verify_all_the_files_are_selected() {
        filesPage.allCheckBoxes.forEach(p->Assert.assertTrue(p.getAttribute("class").contains("selected")));
    }



}

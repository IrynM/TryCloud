package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

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
        BrowserUtils.waitForVisibility(dashboardPage.checkboxFiles, 5);
        dashboardPage.checkboxFiles.click();
        BrowserUtils.sleep(2);
    }

    @Then("verify all the files are selected")
    public void verifyAllTheFilesAreSelected() {
        System.out.println("dashboardPage.checkboxFiles.isSelected() = " + dashboardPage.checkboxFiles.isSelected());
//        String actual = dashboardPage.getCheckboxFiles2.getText();
//        String expected = "list-container  has-controls multiselect";
//        System.out.println(actual);
//        Assert.assertTrue(actual.);
        /**
         * check all checkboxes by clicking check all button
         * @return true if all checked, false if not
         */
//    public static boolean checkAll(){
//        Driver.getDriver().findElement(By.linkText("Check All")).click();
//
//        List<WebElement> allCheckboxes =
//                Driver.getDriver().findElements(By.cssSelector("input[id$='OrderSelector'][type='checkbox']"));
//
//        boolean result = true;
//        // as long as one of them is not checked, return false
//        for(WebElement eachCheckbox : allCheckboxes ){
//            if(! eachCheckbox.isSelected()){
//                result = false;
//            }
//        }
//        return result;
//    }


    }



}

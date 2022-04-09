package com.cydeo.step_definitions;

import com.cydeo.pages.FilesPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US5_user_add_files_to_favorite {
    FilesPage filesModule= new FilesPage();
    String chosenFileText;

    @When("the user clicks action-icon from any file on the page")
    public void theUserClicksActionIconFromAnyFileOnThePage() {
        BrowserUtils.waitForVisibility(filesModule.first3dots, 3);
filesModule.first3dots.click();

    }

    @And("user choose the {string} option")
    public void userChooseTheOption(String addToFavorite) {
if(filesModule.addToFavorites.getText().equals("Add to favorites")){
    BrowserUtils.waitForVisibility(filesModule.addToFavorites, 5);
    filesModule.addToFavorites.click();
}else {
    filesModule.addToFavorites.click();
    BrowserUtils.waitForClickablility(filesModule.first3dots,3);
    filesModule.first3dots.click();
    filesModule.addToFavorites.click();
    chosenFileText=filesModule.choosenFavOption.getText();
}
    }

    @And("user click the {string} sub-module on the left side")
    public void userClickTheSubModuleOnTheLeftSide(String arg0) {
        filesModule.FavoritesModule.click();
        BrowserUtils.waitFor(3);
    }

    @Then("Verify the chosen file is listed on the table")
    public void verifyTheChosenFileIsListedOnTheTable() {
        String chosenFileInListTest=filesModule.chosenFavOptionInList.getText();
        Assert.assertEquals(chosenFileText,chosenFileInListTest);
    }


}

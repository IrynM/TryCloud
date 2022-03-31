package com.cydeo.step_definitions;

import com.cydeo.pages.FilesModule;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US5_user_add_files_to_favorite {
    FilesModule filesModule= new FilesModule();


    @When("the user clicks action-icon from any file on the page")
    public void theUserClicksActionIconFromAnyFileOnThePage() {
filesModule.actionsButtons.click();

    }

    @And("user choose the {string} option")
    public void userChooseTheOption(String addToFavorite) {

    }

    @And("user click the {string} sub-module on the left side")
    public void userClickTheSubModuleOnTheLeftSide(String arg0) {

    }

    @Then("Verify the chosen file is listed on the table")
    public void verifyTheChosenFileIsListedOnTheTable() {
    }
}

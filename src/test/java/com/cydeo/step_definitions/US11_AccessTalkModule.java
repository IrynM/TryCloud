package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.messages.types.Background;
import org.codehaus.plexus.util.dag.DAG;

public class US11_AccessTalkModule {
    DashboardPage dashboardPage= new DashboardPage();

    @And("user search user {string} from the search box")
    public void userSearchUserFromTheSearchBox(String arg0) {

    }

    @And("user write {string} message")
    public void userWriteMessage(String arg0) {
    }

    @And("user clicks to submit button")
    public void userClicksToSubmitButton() {
    }

    @Then("the user should be able to see the {string} message is displayed on the conversation log")
    public void theUserShouldBeAbleToSeeTheMessageIsDisplayedOnTheConversationLog(String arg0) {
    }
}

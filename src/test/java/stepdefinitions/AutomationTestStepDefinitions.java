package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AutomationTestStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than Jaime wants to create an account on utest\\.com, he needs to click on the button \"([^\"]*)\"$")
    public void thanJaimeWantsToCreateAnAccountOnUtestComHeNeedsToClickOnTheButton(String arg1) {
    }

    @When("^he watch the register form to create an account$")
    public void heWatchTheRegisterFormToCreateAnAccount() {
    }

    @Then("^he can fill out the form and after register, he redirects to welcome page$")
    public void heCanFillOutTheFormAndAfterRegisterHeRedirectsToWelcomePage() {
    }
}

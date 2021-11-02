package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.FillOutForm;
import tasks.FillOutFormLocation;
import tasks.OpenUp;

public class AutomationTestStepDefinitions {

    @Before
    public void setStage (){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^than Jaime wants to create an account on utestcom, he needs to click on the button Join Today$")
    public void thanJaimeWantsToCreateAnAccountOnUtestcomHeNeedsToClickOnTheButtonJoinToday() {
        OnStage.theActorCalled("Jaime").wasAbleTo(OpenUp.thePage(), (OpenUp.clickJoinToday()));
    }

    @When("^he watch the register form to create an account$")
    public void heWatchTheRegisterFormToCreateAnAccount(Object obj) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillOutForm.theFormOne(obj),
                (FillOutFormLocation.TheFormTwo(obj)));
    }

    @Then("^he can fill out the form and after register, he redirects to welcome page$")
    public void heCanFillOutTheFormAndAfterRegisterHeRedirectsToWelcomePage() {
    }
}

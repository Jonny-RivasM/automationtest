package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.UtestData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.*;

import java.util.List;

public class AutomationTestStepDefinitions {

    @Before
    public void setStage (){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^than Jaime wants to create an account on utestcom, he needs to click on the button Join Today$")
    public void thanJaimeWantsToCreateAnAccountOnUtestcomHeNeedsToClickOnTheButtonJoinToday() {
        OnStage.theActorCalled("Jaime").wasAbleTo(OpenUp.thePage(), (OpenUp.clickJoinToday()));
    }

    @When("^he watch the register form to create an account$")
    public void heWatchTheRegisterFormToCreateAnAccount(List<UtestData> utestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillOutForm.theFormOne(utestData.get(0).getStrFirstName(),
                utestData.get(0).getStrLastName(), utestData.get(0).getStrEmail(), utestData.get(0).getStrBirthMonth(),
                utestData.get(0).getStrBirthDay(), utestData.get(0).getStrBirthYear(),utestData.get(0).getStrLanguages()));

        OnStage.theActorInTheSpotlight().attemptsTo(FillOutFormLocation.TheFormTwo(utestData.get(0).getStrCity(),
                utestData.get(0).getStrZip(), utestData.get(0).getStrCountry()));

        OnStage.theActorInTheSpotlight().attemptsTo(FillOutFormDevices.TheFromTree(utestData.get(0).getStrComputer(),
                utestData.get(0).getStrVersion(), utestData.get(0).getStrLanguageComputer()));

        OnStage.theActorInTheSpotlight().attemptsTo(FillOutFormComplete.TheFormFour(utestData.get(0).getStrPassword(),
                utestData.get(0).getStrConfirmPassword()));
    }

    @Then("^he can fill out the form and after register, he redirects to (.*) page$")
    public void heCanFillOutTheFormAndAfterRegisterHeRedirectsToWelcomePage(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}

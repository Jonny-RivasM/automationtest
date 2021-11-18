package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.SecondForm;

public class FillOutFormLocation implements Task {

    private String strCity;
    private String strZip;
    private String strCountry;

    public FillOutFormLocation(String strCity, String strZip, String strCountry) {
        this.strCity = strCity;
        this.strZip = strZip;
        this.strCountry = strCountry;
    }
    public static FillOutFormLocation TheFormTwo( String strCity, String strZip,
                                                   String strCountry)
    {return Tasks.instrumented(FillOutFormLocation.class, strCity, strZip, strCountry);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strCity).into(SecondForm.CITY),
                Enter.theValue(strZip).into(SecondForm.ZIP),
                Click.on(SecondForm.COUNTRYCLICK));
        actor.attemptsTo(Enter.theValue(strCountry).into(SecondForm.COUNTRY));
        actor.attemptsTo(Click.on(SecondForm.BUTTON_NEXT_DEVICES));
    }
}

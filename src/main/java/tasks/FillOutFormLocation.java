package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.SecondForm;

public class FillOutFormLocation implements Task {
    private Object obj;

    public FillOutFormLocation(Object obj) { this.obj = obj; }

    public static FillOutFormLocation TheFormTwo(Object obj) {return Tasks.instrumented(FillOutFormLocation.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("IngreseSuCiudad").into(SecondForm.CITY),
                Enter.theValue("IngreseCodigoPostal").into(SecondForm.ZIP),
                Enter.theValue("IngreseSuCiudad").into(SecondForm.COUNTRY),
                Click.on(SecondForm.BUTTON_NEXT_DEVICES));
    }
}

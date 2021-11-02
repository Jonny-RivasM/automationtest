package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.FirstForm;

public class FillOutForm implements Task{
    private Object obj;

    public FillOutForm(Object obj) { this.obj = obj; }

    public static FillOutForm theFormOne(Object obj) { return Tasks.instrumented(FillOutForm.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("IngresaTuNombre").into(FirstForm.FIRSTNAME),
                Enter.theValue("IngresaTuApellido").into(FirstForm.LASTNAME),
                Enter.theValue("IngresaTuEmail").into(FirstForm.EMAIL),
                Enter.theValue("IngresaTuMesDeNacimiento").into(FirstForm.BIRTHMONTH),
                Enter.theValue("IngresaTudíaDeNacimiento").into(FirstForm.BIRTHDAY),
                Enter.theValue("IngresaTuAñosDeNacimiento").into(FirstForm.BIRTHYEAR),
                Enter.theValue("IngreseLosIdiomasQueConoces").into(FirstForm.LANGUAGES),
                Click.on(FirstForm.NEXT_LOCATION));
    }

}
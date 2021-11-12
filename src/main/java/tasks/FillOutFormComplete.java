package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.FourForm;

public class FillOutFormComplete implements Task {

    private String strPassword;
    private String strConfirmPassword;


    public FillOutFormComplete(String strPassword, String strConfirmPassword)
    {
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;

    }

    public static FillOutFormComplete TheFormFour(String strPassword, String strConfirmPassword)
    {return Tasks.instrumented(FillOutFormComplete.class, strPassword, strConfirmPassword);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FourForm.PASSWORDCLICK),
                Enter.theValue(strPassword).into(FourForm.PASSWORD),
                Click.on(FourForm.CONFIRMPASSWORDCLICK),
                Enter.theValue(strPassword).into(FourForm.CONFIRMPASSWORD),
                Click.on(FourForm.CHECKBOXSTAYINFO),
                Click.on(FourForm.CHECKBOXCONDUCT),
                Click.on(FourForm.CheCKBOXPSP));
    }
}

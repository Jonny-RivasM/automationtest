package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ThreeForm;

public class FillOutFormDevices implements Task {
    private String strComputer;
    private String strVersion;
    private String strLanguageComputer;

    public FillOutFormDevices(String strComputer, String strVersion, String strLanguageComputer) {
        this.strComputer = strComputer;
        this.strVersion = strVersion;
        this.strLanguageComputer = strLanguageComputer;
    }
    public static FillOutFormDevices TheFromTree(String strComputer, String strVersion, String strLanguageComputer)
    {
        return Tasks.instrumented(FillOutFormDevices.class, strComputer, strVersion, strLanguageComputer);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ThreeForm.SELECTOSCLICK),
                Enter.theValue(strComputer).into(ThreeForm.SELECTOS),
                Click.on(ThreeForm.SELECTVERSIONCLICK),
                Enter.theValue(strVersion).into(ThreeForm.SELECTVERSION),
                Click.on(ThreeForm.SELECTOSLANGUAGECLICK),
                Enter.theValue(strLanguageComputer).into(ThreeForm.SELECTOSLANGUAGE),
                Click.on(ThreeForm.NEXT_LAST_STEP));
    }
}

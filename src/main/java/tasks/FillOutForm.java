package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.FirstForm;
import userinterface.SecondForm;

public class FillOutForm implements Task{
    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strBirthMonth;
    private String strBirthDay;
    private String strBirthYear;
    private String strLanguages;


    public FillOutForm(String strFirstName, String strLastName, String strEmail,
                       String strBirthMonth, String strBirthDay, String strBirthYear,
                       String strLanguages) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strBirthMonth = strBirthMonth;
        this.strBirthDay = strBirthDay;
        this.strBirthYear = strBirthYear;
        this.strLanguages = strLanguages;
    }

    public static FillOutForm theFormOne(String strFirstName, String strLastName, String strEmail,
                                         String strBirthMonth, String strBirthDay, String strBirthYear,
                                         String strLanguages)
    { return Tasks.instrumented(FillOutForm.class, strFirstName, strLastName, strEmail, strBirthMonth,
            strBirthDay, strBirthYear, strLanguages);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strFirstName).into(FirstForm.FIRSTNAME),
                Enter.theValue(strLastName).into(FirstForm.LASTNAME),
                Enter.theValue(strEmail).into(FirstForm.EMAIL),
                SelectFromOptions.byVisibleText(strBirthMonth).from(FirstForm.BIRTHMONTH),
                SelectFromOptions.byVisibleText(strBirthDay).from(FirstForm.BIRTHDAY),
                SelectFromOptions.byVisibleText(strBirthYear).from(FirstForm.BIRTHYEAR));
                //Enter.theValue(strLanguages).into(FirstForm.LANGUAGES));

        actor.attemptsTo(Click.on(FirstForm.NEXT_LOCATION));
    }

}
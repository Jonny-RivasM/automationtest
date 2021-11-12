package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FourForm extends PageObject {

    public static final Target PASSWORDCLICK = Target.the("")
            .located(By.id("password"));
    public static final Target PASSWORD = Target.the("")
            .located(By.id("password"));
    public static final Target CONFIRMPASSWORDCLICK = Target.the("")
            .located(By.id("confirmPassword"));
    public static final Target CONFIRMPASSWORD = Target.the("")
            .located(By.id("confirmPassword"));
    public static final Target CHECKBOXSTAYINFO = Target.the("")
            .located(By.name("newsletterOptIn"));
    public static final Target CHECKBOXCONDUCT = Target.the("")
            .located(By.name("termOfUse"));
    public static Target CheCKBOXPSP = Target.the("")
            .located(By.name("privacySetting"));
}

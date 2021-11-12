package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FirstForm extends PageObject {
    public static final Target FIRSTNAME = Target
            .the("Where do we write the first name").located(By.id("firstName"));
    public static final Target LASTNAME = Target
            .the("Where do we write the last name").located(By.id("lastName"));
    public static final Target EMAIL = Target
            .the("Where do we write the email").located(By.id("email"));
    public static final Target BIRTHMONTH = Target
            .the("What month were you born").located(By.id("birthMonth"));
    public static final Target BIRTHDAY = Target
            .the("What bay were you born").located(By.id("birthDay"));
    public static final Target BIRTHYEAR = Target
            .the("What year were you born").located(By.id("birthYear"));
    public static final Target LANGUAGESCLICK = Target
            .the("What year were you born")
            .located(By.id("languages"));
    public static final Target LANGUAGES = Target
            .the("What year were you born")
            .located(By.xpath("//input[@aria-label='Select box']"));
    public static final Target NEXT_LOCATION = Target
            .the("Go to location")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
//
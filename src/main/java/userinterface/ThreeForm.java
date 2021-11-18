package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ThreeForm extends PageObject {

    public static final Target SELECTOSCLICK = Target.the("Where do we write the first name")
            .located(By.xpath("//span[@aria-label='Select OS']"));
    public static final Target SELECTOS = Target.the("")
            .located(By.xpath("//input[@placeholder='Select OS']"));
    public static final Target SELECTVERSIONCLICK = Target.the("")
            .located(By.xpath("//span[@aria-label='Select a Version']"));
    public static final Target SELECTVERSION = Target.the("")
            .located(By.xpath("//input[@placeholder='Select a Version']"));
    public static final Target SELECTOSLANGUAGECLICK = Target.the("")
            .located(By.xpath("//span[@aria-label='Select OS language']"));
    public static final Target SELECTOSLANGUAGE = Target.the("")
            .located(By.xpath("//input[@placeholder='Select OS language']"));
    public static final Target NEXT_LAST_STEP = Target.the("")
            .located(By.xpath("//a[@aria-label='Next - final step']"));
}

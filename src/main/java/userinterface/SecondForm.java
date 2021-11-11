package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SecondForm extends PageObject {
    public static final Target CITY = Target
            .the("Where do we write the city").located(By.id("city"));
    public static final Target ZIP = Target
            .the("Where do we write the zip").located(By.id("zip"));
    public static final Target COUNTRYCLICK = Target
            .the("Where do we write the country")
            .located(By.xpath("//span[@class='ui-select-match-text pull-left']"));
    public static final Target COUNTRY = Target
            .the("Where do we write the country")
            .located(By.xpath("//div[@class='ui-select-container ui-select-bootstrap dropdown ng-not-empty ng-valid ng-valid-required auto-detected open direction-up']"));
    public static final Target BUTTON_NEXT_DEVICES = Target.the("Go to devices")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}

package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AutomationTestClickJoinToday extends PageObject {
    public static final Target CLICK_JOIN_TODAY = Target.the("button that show us the from to user create").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}

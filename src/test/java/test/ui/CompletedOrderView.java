package test.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompletedOrderView {
    public static Target completeOrderTitle = Target
            .the("completeOrderTitle")
            .located(By.xpath("//android.widget.ScrollView[@content-desc=\"test-CHECKOUT: COMPLETE!\"]/android.view.ViewGroup/android.widget.TextView[1]"));
    public static Target backHomeButton = Target
            .the("backHomeButton")
            .located(AppiumBy.accessibilityId("test-BACK HOME"));
}

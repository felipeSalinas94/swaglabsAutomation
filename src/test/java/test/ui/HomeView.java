package test.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeView {

    public static Target mainTitle = Target
            .the("SWAGLABS Title")
            .located(By.xpath("//android.widget.ScrollView[@content-desc=\"test-Login\"]/android.view.ViewGroup/android.widget.ImageView[1]"));
    public static Target username = Target
            .the("username")
            .located(AppiumBy.accessibilityId("test-Username"));
    public static Target password = Target
            .the("password")
            .located(AppiumBy.accessibilityId("test-Password"));

    public static Target loginButton = Target
            .the("loginButton")
            .located(AppiumBy.accessibilityId("test-LOGIN"));


}

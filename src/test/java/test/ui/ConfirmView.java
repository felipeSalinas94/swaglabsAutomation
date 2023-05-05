package test.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class ConfirmView {
    public static Target cancelButton = Target
            .the("cancelButton")
            .located(AppiumBy.accessibilityId("test-CANCEL"));
    public static Target finishButton = Target
            .the("finishButton")
            .located(AppiumBy.accessibilityId("test-FINISH"));
}

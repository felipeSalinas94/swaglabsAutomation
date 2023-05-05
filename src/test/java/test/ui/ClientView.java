package test.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class ClientView {
    public static Target firstNameField = Target
            .the("firstNameField")
            .located(AppiumBy.accessibilityId("test-First Name"));
    public static Target lastNameField = Target
            .the("lastNameField")
            .located(AppiumBy.accessibilityId("test-Last Name"));
    public static Target postalCodeField = Target
            .the("postalCodeField")
            .located(AppiumBy.accessibilityId("test-Zip/Postal Code"));
    public static Target cancelButton = Target
            .the("cancelButton")
            .located(AppiumBy.accessibilityId("test-CANCEL"));
    public static Target continueButton = Target
            .the("continueButton")
            .located(AppiumBy.accessibilityId("test-CONTINUE"));
}

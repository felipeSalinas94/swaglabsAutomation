package test.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutView {
    public static Target removeButton = Target
            .the("removeButton")
            .located(AppiumBy.accessibilityId("test-REMOVE"));
    public static Target continueShoppingButton = Target
            .the("continueShoppingButton")
            .located(AppiumBy.accessibilityId("test-CONTINUE SHOPPING"));
    public static Target checkoutButton = Target
            .the("checkoutButton")
            .located(AppiumBy.accessibilityId("test-CHECKOUT"));
}

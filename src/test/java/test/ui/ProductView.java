package test.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductView {

    public static Target productSelector1 = Target
            .the("productSelector1")
            .located(By.xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]"));
    public static Target productSelector2 = Target
            .the("productSelector2")
            .located(By.xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[2]"));
    public static Target productSelector3 = Target
            .the("productSelector3")
            .located(By.xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[3]"));
    public static Target productSelector4 = Target
            .the("productSelector4")
            .located(By.xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[4]"));
    public static Target productSelector5 = Target
            .the("productSelector5")
            .located(By.xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[5]"));
    public static Target productSelector6 = Target
            .the("productSelector6")
            .located(By.xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[6]"));

    public static Target shoppingCartButton = Target
            .the("shoppingCartButton")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView"));
}

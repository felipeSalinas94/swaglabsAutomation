package test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.conditions.Check;
import org.openqa.selenium.support.ui.Wait;
import test.ui.ProductView;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class ProductSelect1 implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(ProductView.productSelector1.isVisibleFor(actor))
                        .andIfSo(Click.on(ProductView.productSelector1)),
                Check.whether(ProductView.shoppingCartButton.isVisibleFor(actor))
                        .andIfSo(Click.on(ProductView.shoppingCartButton)));
    }
}



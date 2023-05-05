package test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import test.ui.ProductView;

public class ProductSelect2 implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(ProductView.productSelector2.isVisibleFor(actor))
                        .andIfSo(Click.on(ProductView.productSelector2)),
                Check.whether(ProductView.shoppingCartButton.isVisibleFor(actor))
                        .andIfSo(Click.on(ProductView.shoppingCartButton)));
    }
}



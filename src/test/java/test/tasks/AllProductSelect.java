package test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import test.ui.ProductView;

public class AllProductSelect implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(ProductView.productSelector1.isVisibleFor(actor))
                        .andIfSo(Click.on(ProductView.productSelector1)),
                Check.whether(ProductView.productSelector2.isVisibleFor(actor))
                        .andIfSo(Click.on(ProductView.productSelector2)),
                Check.whether(ProductView.productSelector3.isVisibleFor(actor))
                        .andIfSo(Click.on(ProductView.productSelector3)),
                Check.whether(ProductView.productSelector4.isVisibleFor(actor))
                        .andIfSo(Click.on(ProductView.productSelector4)),
                Check.whether(ProductView.productSelector5.isVisibleFor(actor))
                        .andIfSo(Click.on(ProductView.productSelector5)),
                Check.whether(ProductView.productSelector6.isVisibleFor(actor))
                        .andIfSo(Click.on(ProductView.productSelector6)),
                Check.whether(ProductView.shoppingCartButton.isVisibleFor(actor))
                        .andIfSo(Click.on(ProductView.shoppingCartButton)));
    }
}



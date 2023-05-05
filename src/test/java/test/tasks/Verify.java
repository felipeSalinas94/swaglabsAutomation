package test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import test.ui.CompletedOrderView;

public class Verify implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(CompletedOrderView.completeOrderTitle.isVisibleFor(actor))
                        .andIfSo(Click.on(CompletedOrderView.completeOrderTitle)),
                Check.whether(CompletedOrderView.backHomeButton.isVisibleFor(actor))
                        .andIfSo(Click.on(CompletedOrderView.backHomeButton)));
    }
}

package test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.conditions.Check;
import test.ui.CheckoutView;
import test.ui.ClientView;
import test.ui.ConfirmView;

public class Checkout implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Check.whether(CheckoutView.checkoutButton.isVisibleFor(actor))
                    .andIfSo(Click.on(CheckoutView.checkoutButton)),
            Check.whether(ClientView.firstNameField.isVisibleFor(actor))
                    .andIfSo(SendKeys.of("Andres").into(ClientView.firstNameField)),
            Check.whether(ClientView.lastNameField.isVisibleFor(actor))
                    .andIfSo(SendKeys.of("Salinas").into(ClientView.lastNameField)),
            Check.whether(ClientView.postalCodeField.isVisibleFor(actor))
                    .andIfSo(SendKeys.of("250020").into(ClientView.postalCodeField)),
            Check.whether(CheckoutView.checkoutButton.isVisibleFor(actor))
                    .andIfSo(Click.on(CheckoutView.checkoutButton)),
                Check.whether(ConfirmView.finishButton.isVisibleFor(actor))
                        .andIfSo(Click.on(ConfirmView.finishButton)));
    }
}

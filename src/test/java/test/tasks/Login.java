package test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.conditions.Check;
import test.ui.HomeView;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(HomeView.username.isVisibleFor(actor))
                        .andIfSo(SendKeys.of("standard_user").into(HomeView.username)),
                Check.whether(HomeView.password.isVisibleFor(actor))
                        .andIfSo(SendKeys.of("secret_sauce").into(HomeView.password)),
                Check.whether(HomeView.loginButton.isVisibleFor(actor))
                        .andIfSo(Click.on(HomeView.loginButton)));

    }
}

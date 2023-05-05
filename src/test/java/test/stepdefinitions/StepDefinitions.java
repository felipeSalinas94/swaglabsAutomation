package test.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import test.tasks.*;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinitions {


    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("Buyer log in app SWAG LABS")
    public void Buyer_wants_to_login() {
        theActorCalled("Buyer")
                .attemptsTo(new Login());
    }

    @When("Buyer selects a product named {string}")
    public void buyerSelectsAProductNamed(String productName) {
        switch (productName){
            case "Sauce Labs BackPack":
                theActorInTheSpotlight().attemptsTo(new ProductSelect1());
            case "Sauce Labs Bike Light":
                theActorInTheSpotlight().attemptsTo(new ProductSelect2());
            case "Sauce Labs Bolt T-Shirt":
                theActorInTheSpotlight().attemptsTo(new ProductSelect3());
            case "Sauce Labs Fleece Jacket":
                theActorInTheSpotlight().attemptsTo(new ProductSelect4());
            case "Sauce Labs Onesie|":
                theActorInTheSpotlight().attemptsTo(new ProductSelect5());
            case "T-Shirt (Red)":
                theActorInTheSpotlight().attemptsTo(new ProductSelect6());
        }
    }

    @When("Buyer selects all available products")
    public void buyerSelectsAllAvailableProducts() {
        theActorInTheSpotlight().attemptsTo(new AllProductSelect());
    }

    @And("fills the client information and confirm the checkout")
    public void confirmsTheCheckout() {
        theActorInTheSpotlight().attemptsTo(new Checkout());
    }

    @Then("verifies order was successfully")
    public void verifiesOrderWasSuccessfully() {
        theActorInTheSpotlight().attemptsTo(new Verify());
    }
}

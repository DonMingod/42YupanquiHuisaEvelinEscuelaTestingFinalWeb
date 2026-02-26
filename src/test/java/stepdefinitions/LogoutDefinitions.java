package stepdefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Steps;
import steps.LogoutSteps;

public class LogoutDefinitions {

    @Steps
    LogoutSteps logoutSteps;

    @When("el usuario abre el menú lateral")
    public void abrirMenu() {
        logoutSteps.abrirMenu();
    }

    @When("hace clic en Logout")
    public void hacerLogout() {
        logoutSteps.hacerLogout();
    }

    @Then("debe regresar a la pantalla de login")
    public void validarLogin() {
        logoutSteps.validarLogin();
    }
}
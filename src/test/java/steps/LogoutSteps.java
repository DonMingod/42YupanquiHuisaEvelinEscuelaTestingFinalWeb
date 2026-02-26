package steps;

import net.serenitybdd.annotations.Step;
import page.LogoutPage;

import static org.junit.Assert.assertTrue;

public class LogoutSteps {

    LogoutPage logoutPage;

    @Step("Abrir menú lateral")
    public void abrirMenu() {
        logoutPage.abrirMenu();
    }

    @Step("Hacer clic en Logout")
    public void hacerLogout() {
        logoutPage.clickLogout();
    }

    @Step("Validar regreso a login")
    public void validarLogin() {
        assertTrue(logoutPage.estaEnLogin());
    }
}
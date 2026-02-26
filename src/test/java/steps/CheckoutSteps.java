package steps;

import net.serenitybdd.annotations.Step;
import page.CheckoutPage;

import static org.junit.Assert.*;

public class CheckoutSteps {

    CheckoutPage checkoutPage;

    @Step("Hacer clic en Checkout")
    public void hacerClickCheckout() {
        checkoutPage.clickCheckout();
    }

    @Step("Completar formulario con datos válidos")
    public void completarFormularioValido() {
        checkoutPage.completarFormulario("Juan", "Perez", "12345");
    }

    @Step("Dejar First Name vacío")
    public void firstNameVacio() {
        checkoutPage.completarFormulario("", "Perez", "12345");
    }

    @Step("Dejar Postal Code vacío")
    public void postalCodeVacio() {
        checkoutPage.completarFormulario("Juan", "Perez", "");
    }

    @Step("Completar First y Last Name")
    public void completarNombreApellido() {
        checkoutPage.completarFormulario("Juan", "Perez", "");
    }

    @Step("Completar Last Name y Postal Code")
    public void completarApellidoZip() {
        checkoutPage.completarFormulario("", "Perez", "12345");
    }

    @Step("Click Continue")
    public void clickContinue() {
        checkoutPage.clickContinue();
    }

    @Step("Click Finish")
    public void clickFinish() {
        checkoutPage.clickFinish();
    }

    @Step("Validar compra exitosa")
    public void validarCompraExitosa() {
        assertTrue(checkoutPage.obtenerMensajeExito().contains("Thank you"));
    }

    @Step("Validar mensaje de error")
    public void validarMensajeError() {
        assertTrue(checkoutPage.obtenerMensajeError().contains("Error"));
    }
}
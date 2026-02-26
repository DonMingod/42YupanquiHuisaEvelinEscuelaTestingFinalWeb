package stepdefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Steps;
import steps.CheckoutSteps;

public class CheckoutStepDefinitions {

    @Steps
    CheckoutSteps checkoutSteps;

    @When("el usuario hace clic en Checkout")
    public void clickCheckout() {
        checkoutSteps.hacerClickCheckout();
    }

    @When("el usuario completa el formulario con datos válidos")
    public void completarFormularioValido() {
        checkoutSteps.completarFormularioValido();
    }

    @When("el usuario deja el campo First Name vacío")
    public void firstNameVacio() {
        checkoutSteps.firstNameVacio();
    }

    @When("completa Last Name y Postal Code")
    public void completarApellidoZip() {
        checkoutSteps.completarApellidoZip();
    }

    @When("el usuario completa First Name y Last Name")
    public void completarNombreApellido() {
        checkoutSteps.completarNombreApellido();
    }

    @When("deja el campo Postal Code vacío")
    public void postalCodeVacio() {
        checkoutSteps.postalCodeVacio();
    }

    @When("hace clic en Continue")
    public void clickContinue() {
        checkoutSteps.clickContinue();
    }

    @When("hace clic en Finish")
    public void clickFinish() {
        checkoutSteps.clickFinish();
    }

    @Then("debe visualizar el mensaje de compra exitosa")
    public void validarCompraExitosa() {
        checkoutSteps.validarCompraExitosa();
    }

    @Then("debe visualizar un mensaje de error de datos obligatorios")
    public void validarError() {
        checkoutSteps.validarMensajeError();
    }
}
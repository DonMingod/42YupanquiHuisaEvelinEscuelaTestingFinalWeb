package stepdefinitions;

import io.cucumber.java.en.*;

import net.serenitybdd.annotations.Steps;
import steps.LoginSteps;


public class LoginStepDefinitions {

    @Steps
    LoginSteps loginSteps;

    @Given("el usuario navega a la página principal de SauceDemo")
    public void navegarPagina() {
        loginSteps.abrirPagina();
    }

    @When("el usuario ingresa credenciales válidas")
    public void ingresarCredencialesValidas() {
        loginSteps.ingresarCredencialesValidas();
    }

    @When("el usuario ingresa un usuario válido y contraseña incorrecta")
    public void ingresarPasswordIncorrecto() {
        loginSteps.ingresarPasswordIncorrecto();
    }

    @When("el usuario ingresa credenciales de usuario bloqueado")
    public void ingresarUsuarioBloqueado() {
        loginSteps.ingresarUsuarioBloqueado();
    }

    @And("hace clic en el botón Login")
    public void hacerClickLogin() {
        loginSteps.hacerClickLogin();
    }

    @Then("debe visualizar la página de inventario")
    public void validarInventario() {
        loginSteps.validarIngresoInventario();
    }

    @Then("debe visualizar un mensaje de error de credenciales inválidas")
    public void validarErrorCredenciales() {
        loginSteps.validarMensajeError("Username and password do not match");
    }

    @Then("debe visualizar un mensaje indicando que el usuario está bloqueado")
    public void validarUsuarioBloqueado() {
        loginSteps.validarMensajeError("Sorry, this user has been locked out");
    }
    @When("el usuario deja el campo usuario vacío")
    public void dejarUsuarioVacio() {
        loginSteps.dejarUsuarioVacio();
    }

    @When("ingresa una contraseña válida")
    public void ingresarPasswordValida() {
        loginSteps.ingresarPasswordValido();
    }

    @When("el usuario ingresa un usuario válido")
    public void ingresarUsuarioValido() {
        loginSteps.ingresarUsuarioValido();
    }

    @When("deja el campo contraseña vacío")
    public void dejarPasswordVacio() {
        loginSteps.dejarPasswordVacio();
    }

    @Then("debe visualizar un mensaje de error indicando que el usuario es requerido")
    public void validarUsuarioRequerido() {
        loginSteps.validarMensajeError("Username is required");
    }

    @Then("debe visualizar un mensaje de error indicando que la contraseña es requerida")
    public void validarPasswordRequerido() {
        loginSteps.validarMensajeError("Password is required");
    }

}
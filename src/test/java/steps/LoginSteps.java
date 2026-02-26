package steps;

import net.serenitybdd.annotations.Step;
import net.thucydides.model.util.EnvironmentVariables;
import page.LoginPage;



import static org.junit.Assert.assertTrue;

public class LoginSteps {

    LoginPage loginPage;

    EnvironmentVariables environmentVariables;

    @Step("Abrir página principal")
    public void abrirPagina() {
        loginPage.open();
    }

    @Step("Ingresar credenciales válidas")
    public void ingresarCredencialesValidas() {

        String user = environmentVariables.getProperty("saucedemo.user");
        String pass = environmentVariables.getProperty("saucedemo.password");

        loginPage.ingresarUsuario(user);
        loginPage.ingresarPassword(pass);
    }

    @Step("Ingresar credenciales incorrectas")
    public void ingresarPasswordIncorrecto() {
        loginPage.ingresarUsuario("standard_user");
        loginPage.ingresarPassword("wrong_password");
    }

    @Step("Login con usuario bloqueado")
    public void ingresarUsuarioBloqueado() {
        loginPage.ingresarUsuario("locked_out_user");
        loginPage.ingresarPassword("secret_sauce");
    }

    @Step("Click en login")
    public void hacerClickLogin() {
        loginPage.clickLogin();
    }

    @Step("Validar ingreso a inventario")
    public void validarIngresoInventario() {
        assertTrue(loginPage.estaEnPaginaInventario());
    }

    @Step("Validar mensaje de error")
    public void validarMensajeError(String mensajeEsperado) {
        assertTrue(loginPage.obtenerMensajeError().contains(mensajeEsperado));
    }
    @Step("Dejar usuario vacío")
    public void dejarUsuarioVacio() {
        loginPage.ingresarUsuario("");
    }

    @Step("Ingresar contraseña válida")
    public void ingresarPasswordValido() {
        loginPage.ingresarPassword("secret_sauce");
    }

    @Step("Ingresar usuario válido")
    public void ingresarUsuarioValido() {
        loginPage.ingresarUsuario("standard_user");
    }

    @Step("Dejar contraseña vacía")
    public void dejarPasswordVacio() {
        loginPage.ingresarPassword("");
    }
}
package page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.annotations.DefaultUrl;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {

    @FindBy(id = "user-name")
    private WebElementFacade txtUsername;

    @FindBy(id = "password")
    private WebElementFacade txtPassword;

    @FindBy(id = "login-button")
    private WebElementFacade btnLogin;

    @FindBy(css = "[data-test='error']")
    private WebElementFacade lblError;

    public void ingresarUsuario(String usuario) {
        txtUsername.type(usuario);
    }

    public void ingresarPassword(String password) {
        txtPassword.type(password);
    }

    public void clickLogin() {
        btnLogin.click();
    }

    public String obtenerMensajeError() {
        return lblError.getText();
    }

    public boolean estaEnPaginaInventario() {
        return getDriver().getCurrentUrl().contains("inventory");
    }
}
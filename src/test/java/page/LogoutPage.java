package page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends PageObject {

    @FindBy(id = "react-burger-menu-btn")
    private WebElementFacade btnMenu;

    @FindBy(id = "logout_sidebar_link")
    private WebElementFacade btnLogout;

    @FindBy(id = "login-button")
    private WebElementFacade btnLogin;

    public void abrirMenu() {
        btnMenu.click();
    }

    public void clickLogout() {
        btnLogout.click();
    }

    public boolean estaEnLogin() {
        return btnLogin.isPresent();
    }
}
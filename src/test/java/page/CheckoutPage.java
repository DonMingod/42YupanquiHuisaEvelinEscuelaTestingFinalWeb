package page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageObject {

    @FindBy(id = "checkout")
    private WebElementFacade btnCheckout;

    @FindBy(id = "first-name")
    private WebElementFacade txtFirstName;

    @FindBy(id = "last-name")
    private WebElementFacade txtLastName;

    @FindBy(id = "postal-code")
    private WebElementFacade txtPostalCode;

    @FindBy(id = "continue")
    private WebElementFacade btnContinue;

    @FindBy(id = "finish")
    private WebElementFacade btnFinish;

    @FindBy(className = "complete-header")
    private WebElementFacade lblCompleteMessage;

    @FindBy(css = "[data-test='error']")
    private WebElementFacade lblError;

    public void clickCheckout() {
        btnCheckout.click();
    }

    public void completarFormulario(String first, String last, String zip) {
        txtFirstName.type(first);
        txtLastName.type(last);
        txtPostalCode.type(zip);
    }

    public void clickContinue() {
        btnContinue.click();
    }

    public void clickFinish() {
        btnFinish.click();
    }

    public String obtenerMensajeExito() {
        return lblCompleteMessage.getText();
    }

    public String obtenerMensajeError() {
        return lblError.getText();
    }
}
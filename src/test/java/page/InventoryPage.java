package page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends PageObject {

    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']/ancestor::div[@class='inventory_item']//button")
    private WebElementFacade btnBackpack;

    @FindBy(className = "shopping_cart_badge")
    private WebElementFacade cartBadge;

    public void clickBotonBackpack() {
        btnBackpack.click();
    }

    public String obtenerCantidadCarrito() {
        if (cartBadge.isPresent()) {
            return cartBadge.getText();
        } else {
            return "0";
        }
    }

    public String obtenerTextoBoton() {
        return btnBackpack.getText();
    }
}
package page;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageObject {

    @FindBy(className = "shopping_cart_link")
    private WebElementFacade btnCarrito;

    @FindBy(className = "inventory_item_name")
    private WebElementFacade lblNombreProducto;

    @FindBy(id = "continue-shopping")
    private WebElementFacade btnContinueShopping;

    @FindBy(className = "cart_item")
    private WebElementFacade itemCarrito;

    public void abrirCarrito() {
        btnCarrito.click();
    }

    public boolean productoVisible() {
        return lblNombreProducto.isPresent();
    }

    public void continuarComprando() {
        btnContinueShopping.click();
    }

    public boolean carritoTieneProductos() {
        return itemCarrito.isPresent();
    }
}
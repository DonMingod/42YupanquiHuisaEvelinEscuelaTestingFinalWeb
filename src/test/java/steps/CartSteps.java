package steps;

import net.serenitybdd.annotations.Step;
import page.CartPage;

import static org.junit.Assert.*;

public class CartSteps {

    CartPage cartPage;

    @Step("Abrir carrito")
    public void abrirCarrito() {
        cartPage.abrirCarrito();
    }

    @Step("Validar producto visible en carrito")
    public void validarProductoVisible() {
        assertTrue(cartPage.productoVisible());
    }

    @Step("Continuar comprando")
    public void continuarComprando() {
        cartPage.continuarComprando();
    }

    @Step("Validar regreso a inventario")
    public void validarRegresoInventario() {
        assertTrue(cartPage.getDriver().getCurrentUrl().contains("inventory"));
    }

    @Step("Validar carrito vacío")
    public void validarCarritoVacio() {
        assertFalse(cartPage.carritoTieneProductos());
    }
}
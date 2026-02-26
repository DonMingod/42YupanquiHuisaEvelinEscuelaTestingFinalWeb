package stepdefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Steps;
import steps.CartSteps;
import steps.InventorySteps;

public class CartStepDefinitions {

    @Steps
    CartSteps cartSteps;

    @Steps
    InventorySteps inventorySteps;

    @When("el usuario navega al carrito")
    public void navegarCarrito() {
        cartSteps.abrirCarrito();
    }

    @Then("debe visualizar el producto en el carrito")
    public void validarProductoCarrito() {
        cartSteps.validarProductoVisible();
    }

    @When("el usuario hace clic en Continue Shopping")
    public void continuarComprando() {
        cartSteps.continuarComprando();
    }

    @Then("debe regresar a la página de inventario")
    public void validarInventario() {
        cartSteps.validarRegresoInventario();
    }

    @When("el usuario navega al carrito sin agregar productos")
    public void carritoSinProductos() {
        cartSteps.abrirCarrito();
    }

    @Then("el carrito no debe mostrar productos")
    public void validarCarritoVacio() {
        cartSteps.validarCarritoVacio();
    }
}
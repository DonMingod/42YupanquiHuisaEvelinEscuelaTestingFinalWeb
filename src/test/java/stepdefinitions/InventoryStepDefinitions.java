package stepdefinitions;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Steps;
import steps.InventorySteps;

public class InventoryStepDefinitions {

    @Steps
    InventorySteps inventorySteps;

    @When("el usuario agrega el producto {string} al carrito")
    public void agregarProducto(String producto) {
        inventorySteps.agregarProducto();
    }

    @Then("el carrito debe mostrar {int} producto")
    public void validarCarrito(int cantidad) {
        inventorySteps.validarCantidadCarrito(String.valueOf(cantidad));
    }

    @When("intenta agregar nuevamente el mismo producto")
    public void intentaAgregarNuevamente() {
        inventorySteps.intentarAgregarNuevamente();
    }

    @Then("el botón del producto debe mostrar {string}")
    public void validarTextoBoton(String texto) {
        inventorySteps.validarTextoBoton(texto);
    }

    @When("el usuario remueve el producto del carrito")
    public void removerProducto() {
        inventorySteps.removerProducto();
    }
}
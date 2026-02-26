package steps;


import net.serenitybdd.annotations.Step;
import page.InventoryPage;

import static org.junit.Assert.assertEquals;

public class InventorySteps {

    InventoryPage inventoryPage;

    @Step("Agregar producto al carrito")
    public void agregarProducto() {
        inventoryPage.clickBotonBackpack();
    }

    @Step("Validar cantidad en carrito")
    public void validarCantidadCarrito(String cantidadEsperada) {
        assertEquals(cantidadEsperada, inventoryPage.obtenerCantidadCarrito());
    }

    @Step("Intentar agregar el mismo producto nuevamente")
    public void intentarAgregarNuevamente() {
    }

    @Step("Validar texto del botón")
    public void validarTextoBoton(String textoEsperado) {
        assertEquals(textoEsperado, inventoryPage.obtenerTextoBoton());
    }

    @Step("Remover producto del carrito")
    public void removerProducto() {
        inventoryPage.clickBotonBackpack();
    }

}
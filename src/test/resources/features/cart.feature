@web @cart
Feature: Gestión del carrito

  Background:
    Given el usuario navega a la página principal de SauceDemo
    And el usuario ingresa credenciales válidas
    And hace clic en el botón Login

  @happy
  Scenario: Visualizar producto agregado en el carrito
    When el usuario agrega el producto "Sauce Labs Backpack" al carrito
    And el usuario navega al carrito
    Then debe visualizar el producto en el carrito

  @happy
  Scenario: Continuar comprando desde el carrito
    When el usuario agrega el producto "Sauce Labs Backpack" al carrito
    And el usuario navega al carrito
    And el usuario hace clic en Continue Shopping
    Then debe regresar a la página de inventario

  @unhappy
  Scenario: Visualizar carrito vacío
    When el usuario navega al carrito sin agregar productos
    Then el carrito no debe mostrar productos
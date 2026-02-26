@web @inventory
Feature: Agregar productos al carrito

  Background:
    Given el usuario navega a la página principal de SauceDemo
    And el usuario ingresa credenciales válidas
    And hace clic en el botón Login

  @happy
  Scenario: Agregar producto al carrito correctamente
    When el usuario agrega el producto "Sauce Labs Backpack" al carrito
    Then el carrito debe mostrar 1 producto
  @happy
  Scenario: Remover producto del carrito correctamente
    When el usuario agrega el producto "Sauce Labs Backpack" al carrito
    And el usuario remueve el producto del carrito
    Then el carrito debe mostrar 0 producto

  @unhappy
  Scenario: Intentar agregar el mismo producto dos veces
    When el usuario agrega el producto "Sauce Labs Backpack" al carrito
    And intenta agregar nuevamente el mismo producto
    Then el botón del producto debe mostrar "Remove"
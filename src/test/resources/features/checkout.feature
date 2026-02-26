@web @checkout
Feature: Proceso de compra

  Background:
    Given el usuario navega a la página principal de SauceDemo
    And el usuario ingresa credenciales válidas
    And hace clic en el botón Login
    And el usuario agrega el producto "Sauce Labs Backpack" al carrito
    And el usuario navega al carrito
    And el usuario hace clic en Checkout

  @happy
  Scenario: Compra exitosa de producto
    When el usuario completa el formulario con datos válidos
    And hace clic en Continue
    And hace clic en Finish
    Then debe visualizar el mensaje de compra exitosa

  @unhappy
  Scenario: Checkout con First Name vacío
    When el usuario deja el campo First Name vacío
    And completa Last Name y Postal Code
    And hace clic en Continue
    Then debe visualizar un mensaje de error de datos obligatorios

  @unhappy
  Scenario: Checkout con Postal Code vacío
    When el usuario completa First Name y Last Name
    And deja el campo Postal Code vacío
    And hace clic en Continue
    Then debe visualizar un mensaje de error de datos obligatorios
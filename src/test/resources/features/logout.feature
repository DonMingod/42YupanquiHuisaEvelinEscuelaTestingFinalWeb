@web @logout
Feature: Cerrar sesión

  Background:
    Given el usuario navega a la página principal de SauceDemo
    And el usuario ingresa credenciales válidas
    And hace clic en el botón Login

  @happy
  Scenario: Cerrar sesión correctamente
    When el usuario abre el menú lateral
    And hace clic en Logout
    Then debe regresar a la pantalla de login
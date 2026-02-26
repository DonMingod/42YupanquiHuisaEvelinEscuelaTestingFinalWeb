@web @login
Feature: Login en SauceDemo

  Como usuario de la aplicación
  Quiero iniciar sesión
  Para acceder al inventario de productos

  Background:
    Given el usuario navega a la página principal de SauceDemo

  @happy
  Scenario: Login exitoso con credenciales válidas
    When el usuario ingresa credenciales válidas
    And hace clic en el botón Login
    Then debe visualizar la página de inventario

  @unhappy
  Scenario: Login con contraseña incorrecta
    When el usuario ingresa un usuario válido y contraseña incorrecta
    And hace clic en el botón Login
    Then debe visualizar un mensaje de error de credenciales inválidas

  @unhappy
  Scenario: Login con usuario vacío
    When el usuario deja el campo usuario vacío
    And ingresa una contraseña válida
    And hace clic en el botón Login
    Then debe visualizar un mensaje de error indicando que el usuario es requerido

  @unhappy
  Scenario: Login con contraseña vacía
    When el usuario ingresa un usuario válido
    And deja el campo contraseña vacío
    And hace clic en el botón Login
    Then debe visualizar un mensaje de error indicando que la contraseña es requerida

  @unhappy
  Scenario: Login con usuario bloqueado
    When el usuario ingresa credenciales de usuario bloqueado
    And hace clic en el botón Login
    Then debe visualizar un mensaje indicando que el usuario está bloqueado
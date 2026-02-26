# SauceDemo — Automatización con Serenity BDD

Proyecto de automatización de pruebas funcionales para la aplicación SauceDemo, desarrollado con Serenity BDD y Cucumber bajo el enfoque BDD (Behavior Driven Development).

El objetivo principal es validar los flujos críticos de la aplicación web mediante pruebas automatizadas organizadas, mantenibles y orientadas a negocio.

---

## Objetivo del proyecto

Este proyecto implementa pruebas automatizadas para:

- Validar el proceso de autenticación (login).
- Verificar la gestión de productos en el inventario.
- Confirmar el correcto funcionamiento del carrito de compras.
- Ejecutar flujos positivos (happy path) y negativos (unhappy path).

Se aplican buenas prácticas como separación por capas (Page, Steps, StepDefinitions) y el patrón Page Object Model para mejorar la mantenibilidad del código.

---

## Tecnologías

- Java 17
- Maven
- Serenity BDD
- Cucumber
- Selenium WebDriver
- JUnit
- Page Object Model (POM)
- BDD (Behavior Driven Development)

---

## Tipos de pruebas implementadas

### Happy Path
Escenarios donde el usuario realiza acciones válidas y el sistema responde correctamente.

Ejemplos:
- Login con credenciales válidas.
- Agregar productos al carrito.
- Completar un flujo básico de compra.

### Unhappy Path
Escenarios donde el usuario realiza acciones inválidas o incompletas y el sistema debe mostrar mensajes de validación adecuados.

Ejemplos:
- Login con campos vacíos.
- Credenciales incorrectas.
- Intentar realizar acciones duplicadas en el carrito.

---

## Reportes

Después de la ejecución, Serenity genera automáticamente un reporte HTML detallado que incluye:

- Evidencia paso a paso.
- Capturas de pantalla.
- Resultado de cada escenario.
- Trazabilidad entre features y pasos automatizados.

Ubicación del reporte:

- `target/site/serenity/index.html`


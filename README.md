
# Automatización Web SauceDemo - Proyecto Final

Este repositorio contiene el proyecto final para la **Escuela de Testing NTT DATA**. Consiste en la automatización de pruebas End-to-End (E2E) para la tienda virtual [SauceDemo](https://www.saucedemo.com/), abarcando diversos módulos y aplicando validaciones tanto para flujos exitosos (*Happy Paths*) como para flujos alternativos y de error (*Unhappy Paths*).

## Tecnologías y Herramientas Utilizadas
* **Lenguaje:** Java 11+
* **Framework BDD:** Cucumber (Gherkin)
* **Framework de Automatización:** Serenity BDD
* **Gestor de Dependencias:** Maven
* **Patrón de Diseño:** Page Object Model (POM)

## Módulos y Casos de Prueba Automatizados
El proyecto cubre los flujos más críticos de la tienda virtual, agrupados bajo la etiqueta `@Regression`. A continuación, se detallan los escenarios específicos evaluados por cada módulo:

### 1. Módulo de Login (`@login`)
* **[Happy Path] Inicio de sesión exitoso:** Validación del acceso correcto utilizando credenciales válidas (`standard_user`).
* **[Happy Path] Cierre de sesión (Logout):** Validación de la correcta finalización de la sesión a través del menú principal, retornando a la vista de login.
* **[Unhappy Path] Usuario bloqueado:** Verificación de la restricción de acceso y el mensaje de error correspondiente para el usuario `locked_out_user`.
* **[Unhappy Path] Credenciales inválidas:** Validación de seguridad al intentar ingresar con un usuario y contraseña inexistentes.
* **[Unhappy Path] Validación de campos vacíos:** Uso de un *Esquema de Escenario* (Data-Driven) para iterar y validar dinámicamente los distintos mensajes de error cuando se omite el usuario, la contraseña o ambos.

### 2. Módulo de Catálogo (`@Catalogo`)
* **[Happy Path] Filtrar precio ascendente:** Verificación de que la opción "Price (low to high)" ordena correctamente los productos de menor a mayor precio.
* **[Happy Path] Filtrar precio descendente:** Verificación de que la opción "Price (high to low)" ordena correctamente los productos de mayor a menor precio.

### Módulo de Carrito de Compras (`@Carrito`)
* **[Happy Path] Agregar producto:** Validación de que al agregar un artículo, el contador del carrito se actualiza a "1" y el producto se muestra en la página de resumen del carrito.
* **[Happy Path] Remover producto desde el catálogo:** Validación de que un producto agregado puede ser removido directamente utilizando el botón dinámico en la vista principal, limpiando el contador del carrito.
* **[Happy Path] Remover producto desde el carrito:** Verificación del flujo de eliminación ingresando a la página del carrito y removiendo el artículo desde allí.

### 4. Módulo de Checkout - Proceso de Pago (`@Checkout`)
* **[Happy Path] Compra exitosa:** Validación del flujo *End-to-End* de pago, llenando los datos obligatorios (Nombre, Apellido, Código Postal) y comprobando el mensaje final ("Thank you for your order!").
* **[Unhappy Path] Validación secuencial de campos vacíos:** Comprobación del formulario de envío paso a paso, verificando que el sistema arroje el error correcto de forma secuencial si falta el *First Name*, luego si falta el *Last Name*, y finalmente si falta el *Postal Code*.
* 
## Pre-requisitos
Para ejecutar este proyecto de manera local, asegúrate de tener instalado:
1. [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) - Versión 11 o superior.
2. [Apache Maven](https://maven.apache.org/download.cgi) - Configurado en las variables de entorno.
3. Git.
4. Un IDE de tu preferencia (IntelliJ IDEA, Eclipse, etc.) con los plugins de Cucumber for Java y Gherkin instalados.

## Clonación y Configuración del Proyecto
Para obtener una copia local y ejecutar las pruebas, sigue estos pasos:

1. Abre tu terminal o Git Bash.
2. Clona este repositorio ejecutando el siguiente comando:
   ```bash 
   git clone https://github.com/MBGG8/34GutierrezGomezMiguelBenjaminEscuelaTestingFinalWeb.git
   ```
## Ejecución de las Pruebas

El proyecto está diseñado para ser altamente flexible, permitiendo ejecutar las pruebas de manera global o aislando funcionalidades específicas según la necesidad.

### 1. Ejecución Completa (Master Runner)
El proyecto incluye la clase `MasterRunner`, la cual orquesta la ejecución principal. Está configurada para buscar y ejecutar automáticamente todos los escenarios que contengan el tag **`@Regression`**. 

También contamos con `CarritoRunner` , `CatálogoRunner` , `CheckoutRunner`, `LoginRunner`cada una ejecuta todos los casos de pruebas de su módulo.
   

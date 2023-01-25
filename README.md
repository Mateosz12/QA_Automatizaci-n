### RETO TÉCNICO

Con este proyecto se evidencia la solución al reto tecnico de la empresa T-evolvers, esta consta de dos pruebas como tal:
1. Automatizar API restful-booker.
2.Automatización Web Demoblaze.


#### Clonar el proyecto:

Para clonar este repositorio se debe ejecutar el siguiente comando:

```bash
    git clone https://github.com/Mateosz12/QA_Automatizaci-n.git
```

### AUTOMATIZACIÓN API

### restful-booker
Restful-booker es una API web Create Read Update Delete que viene con funciones de autenticación y cargada con un montón de errores.

#### Herramientas utilizadas:

- **IDE de IntelliJ IDEA**
- **Karate BDD** - Marco de pruebas
- **Gradle** - Gestor de dependencias
- **Cucumber** - Reportes
- **Gherkin** - Lenguaje Específico de Dominio (DSL)


**Patrones de desarrollo:**


#### Contenido de la automatización:

**Crear una reserva:**
- Crear correctamente una nueva reserva en la API


**Obtener una reserva por ID:**
- Obtener la reserva por ID con éxito


**Crear Token de autenticación:** crea un nuevo token de autenticación que se utilizará para acceder a la función actualizar

- Crear con éxito un nuevo token de autenticación
- Crear un token de autenticación con datos incorrectos

**Actualizar una reserva:**
- Actualizar correctamente una reserva por id


### Ejecución del proyecto


**Ejecutar en paralelo todas las pruebas y generar el reporte de Cucumber:**

    gradle test --tests karate.ManagementTest

Para visualizar el reporte que se genera se debe ingresar a **RETO-KARATE\build\cucumber-html-reports\overview-features.html**

**Ejecutar la prueba de creación de reserva:**

    gradle test --tests karate.createBooking.RunnerCreate

**Ejecutar la prueba de busqueda de reserva por ID:**

    gradle test --tests karate.getBooking.RunnerGet

**Ejecutar la prueba de creación para token de autenticación:**

    gradle test --tests karate.auth.TokenRunner

**Ejecutar la prueba de actualización de reserva por ID:**

    gradle test --tests karate.putBooking.RunnerPut



###  AUTOMATIZACIÓN WEB:

### demoblaze

Demoblaze es una página de una tienda virtual, la cual permite elegir productos por diferentes categorías y añadirlos al carrito y simular una compra.

#### Herramientas utilizadas:

- **BDD** - Estrategia de desarrollo
- **ScreenPlay** - Patrón de diseño
- **Gradle** - Gestor de dependencias
- **Cucumber** - Framework para automatizar pruebas BDD
- **Gherkin** - Lenguaje Específico de Dominio (DSL)
- **Java**
- **Selenium Web Driver** - Herramienta para automatizar acciones en navegadores web
- **Serenity BDD** - Biblioteca de código abierto para la generación de reportes


#### Contenido de la automatización:

**Carrito de compras:**
- **Buscar y añadir productos al carrito de compra:

1. Se añaden 2 productos de cada categoría de la tienda y se verifica el precio total de los productos.

### Ejecución del proyecto


Para ejecutar la prueba y generar el reporte:

    gradle clean build aggregate



Para visualizar el reporte que se genera se debe ingresar a **demoblaze/target/site/serenity/index.html**



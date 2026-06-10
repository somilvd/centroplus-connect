# CentroPlus Connect

Proyecto intermodular — 1º DAM  
Aplicación desarrollada con JavaFX.

![Logo del sistema](/img/logo.png)

---

# CentroPlus Connect

## Descripción del proyecto

**CentroPlus Connect** es una aplicación de escritorio desarrollada en **Java** utilizando **JavaFX**, creada como proyecto académico para el ciclo de **Desarrollo de Aplicaciones Multiplataforma (DAM)**.

La aplicación permite gestionar de forma sencilla las actividades de un centro deportivo y académico mediante una interfaz moderna e intuitiva. El usuario puede consultar actividades disponibles, realizar reservas, cancelar reservas y gestionar incidencias desde la propia aplicación.

El proyecto aplica conceptos fundamentales de programación orientada a objetos, arquitectura MVC y diseño de interfaces gráficas.

---

# Funcionalidades principales

## Inicio

La pantalla principal muestra un resumen general del sistema:

- Número total de actividades disponibles.
- Número de reservas activas.
- Navegación rápida mediante pestañas inferiores.
- Interfaz visual moderna y responsive.

---

## Gestión de actividades

Desde el apartado de actividades el usuario puede:

- Consultar todas las actividades disponibles.
- Ver el nombre de la actividad.
- Consultar las plazas libres disponibles.
- Ver el precio de cada actividad.
- Realizar múltiples reservas.
- Actualización automática de plazas ocupadas.

### Actividades incluidas

- Fútbol
- Boxeo
- Programación

---

## Gestión de reservas

La aplicación permite gestionar reservas de actividades de forma dinámica.

Cada reserva muestra:

- ID de reserva.
- Nombre de la actividad reservada.
- Estado de la reserva.

Funciones disponibles:

- Crear reservas.
- Cancelar reservas.
- Actualización automática de plazas.
- Soporte para múltiples reservas simultáneas.

---

## Gestión de incidencias

La aplicación incluye un sistema completo de incidencias.

El usuario puede:

- Crear incidencias.
- Añadir asunto y descripción.
- Consultar incidencias registradas.
- Ver detalles completos de una incidencia.
- Eliminar incidencias seleccionadas.

Cada incidencia contiene:

- ID
- Usuario asociado
- Asunto
- Descripción
- Fecha
- Estado

---

# Diseño e interfaz

La interfaz ha sido desarrollada utilizando:

- JavaFX
- FXML
- CSS personalizado

Características visuales implementadas:

- Diseño moderno tipo app móvil.
- Botones personalizados.
- Sistema de pestañas inferior.
- Botones de acción diferenciados por color.
- Botón de eliminación en rojo
- Listas modernas estilizadas.

---

## Modelo (Models)

Contienen las entidades principales del sistema:

- Actividad
- Reserva
- Incidencia
- Usuario

---

## Vista (Views)

Gestionan toda la interfaz gráfica:

- MainView.fxml
- styles.css

---

## Controlador (Controllers)

Gestionan la comunicación entre interfaz y lógica:

- MainController

---

## Services

Implementan toda la lógica de negocio:

- ActividadService
- ReservaService
- IncidenciaService

---

## Repository

Gestionan los datos almacenados en memoria:

- ActividadRepository
- ReservaRepository
- IncidenciaRepository

---

# Tecnologías utilizadas

- Java 21
- JavaFX
- Maven
- CSS
- FXML
- Arquitectura MVC
- Programación Orientada a Objetos

---

# Instalación y ejecución

## Requisitos previos

Antes de ejecutar el proyecto es necesario tener instalado:

- Java JDK 21
- Maven
- JavaFX

---

## Configuración del pom.xml

Es importante configurar correctamente la versión de Java en el archivo `pom.xml`.

Debes comprobar tu version de Java y si tienes una diferente, cambiarla en las siguientes líneas:

```xml
<maven.compiler.source>21</maven.compiler.source>
<maven.compiler.target>21</maven.compiler.target>
```

Esto garantiza que el proyecto compile utilizando tu version de Java.

---

## Clonar el repositorio

Todo el proyecto se encuentra disponible en GitHub.

Clona el repositorio utilizando:

```bash
git clone https://github.com/somilvd/centroplus-connect.git
```

---

## Estructura del proyecto

```text
CENTROPLUS-CONNECT/
│
├── .vscode
├── backend-api
├── database
├── docs
├── img
├── mobile-app
│   └── mobile-app
├── web-html
├── LICENSE
└── README.md
```

---

## Ejecutar la aplicación

Una vez descargado el proyecto:

1. Entra en la carpeta principal del proyecto.
2. Accede a:

```bash
cd mobile-app/mobile-app
```

3. Ejecuta el siguiente comando:

```bash
mvn clean javafx:run
```

La aplicación JavaFX se iniciará automáticamente.

---

# Objetivos académicos

Con este proyecto se han trabajado los siguientes conceptos:

- Programación Orientada a Objetos (POO)
- Arquitectura MVC
- Interfaces gráficas con JavaFX
- Gestión de eventos
- Manejo de colecciones
- Programación modular
- Separación de responsabilidades
- Diseño visual mediante CSS
- Gestión de datos en memoria

---

# Posibles mejoras futuras

- Persistencia con base de datos MySQL.
- Inicio de sesión y autenticación.
- Gestión de usuarios y roles.
- Panel de administración.
- Exportación de informes PDF.
- Notificaciones automáticas.
- Persistencia de incidencias.
- Responsive design avanzado.
- Integración con API REST.

---

# Conclusión

**CentroPlus Connect** ha permitido desarrollar una aplicación funcional y moderna aplicando los conocimientos adquiridos durante el curso de DAM.

El proyecto combina lógica de negocio, diseño visual e interacción gráfica utilizando Java y JavaFX, ofreciendo una experiencia completa de gestión de actividades, reservas e incidencias dentro de una misma aplicación.
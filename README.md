#  Examen de Programación Java

## 👤 Datos del Estudiante
* **Nombre:** [Joaquín Fernández García]
* **Github:** [https://github.com/joaq240606fer-collab]
* **Fecha:** 15 de junio de 2026
* **Asignatura:** [Programacion y Contornos  ]

---

##  Estructura del Proyecto
Este proyecto ha sido inicializado con **Gradle 8.5 (Groovy DSL)** siguiendo una estructura limpia sin submódulos intermedios.

* **Paquete Base:** `edu.teamrocket`
* **Clase Principal:** `edu.teamrocket.App`
* **Clase de Pruebas:** `edu.teamrocket.AppTest`

---

##  Instrucciones de Ejecución (Comandos)

A continuación se detallan los comandos necesarios para evaluar el proyecto desde la terminal utilizando el Gradle Wrapper.

### 1. Limpiar y Compilar el Proyecto
Para eliminar residuos de compilaciones previas y compilar el código desde cero:
```bash
./gradlew clean build
```

### 2. Ejecutar las Pruebas Unitarias
Para verificar que todos los casos de prueba y aserciones diseñadas pasan correctamente:
```bash
./gradlew test
```
> *El reporte visual de las pruebas se genera automáticamente en:* `build/reports/tests/test/index.html`

### 3. Ejecutar la Aplicación en Desarrollo
Para poner en marcha la aplicación directamente en la consola sin generar el binario:
```bash
./gradlew run
```

### 4. Generar y Ejecutar el Archivo JAR
Para empaquetar la aplicación en un archivo ejecutable independiente:
```bash
./gradlew jar
```
Una vez generado, se puede ejecutar el binario final con el comando nativo de Java:
```bash
java -jar build/libs/mi-proyecto.jar
```

---

##  Enunciado y Requisitos del Examen
*Ejemplo de cómo estructurar lo que pide el ejercicio (puedes marcar con una [x] lo completado):*
- [X] **REQ-1:** Crear la estructura de paquetes `edu.teamrocket`.
- [X] **REQ-2:** Implementar la lógica del problema solicitado.
- [X] **REQ-3:** Añadir cobertura de pruebas unitarias mínimas con JUnit Jupiter.

## Notas del Autor / Justificación Técnica
*(Usa este espacio para explicarle brevemente al profesor tus decisiones de diseño o si dejaste algo pendiente por falta de tiempo)*
* Se optó por una arquitectura...
* Las pruebas cubren los casos límite de...


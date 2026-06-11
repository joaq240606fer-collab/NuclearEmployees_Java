# NuclearEmployees_Java
NuclearEmployees_Java 

## Compilación y Limpieza. ##

./gradlew build : Compila el código fuente del proyecto y ejecuta las pruebas.
./gradlew clean : Elimina el directorio build/ y limpia el proyecto de compilaciones anteriores.
./gradlew assemble : Compila el código, pero no ejecuta las pruebas (genera los binarios como .apk, .jar o .aab).

## Pruebas y Análisis ##

./gradlew test : Ejecuta todas las pruebas unitarias.
./gradlew check : Ejecuta todas las comprobaciones de calidad del código, incluidas las pruebas y el lint.

## Dependencias ##

./gradlew dependencies : Muestra un árbol con todas las dependencias del proyecto.
./gradlew buildEnvironment : Muestra información sobre las dependencias del entorno de compilación.
./gradlew --refresh-dependencies : Fuerza a Gradle a ignorar la caché e intentar descargar de nuevo todas las dependencias remotas.

Administración y Utilidades

./gradlew tasks : Lista todas las tareas disponibles que se pueden ejecutar en tu proyecto.
./gradlew projects : Muestra la estructura jerárquica del proyecto y sus submódulos
.gradle --stop : Detiene de manera ordenada todos los demonios (daemons) de Gradle activos de la misma versión.

gradle init --type java-application --dsl groovy --package edu.teamrocket --project-name mi-proyecto --test-framework junit-jupiter --no-split-project

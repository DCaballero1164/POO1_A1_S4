# 🧠 Sumativa 1 - Semana 4 – Desarrollo Orientado a Objetos I

👤 Autor del proyecto

Nombre completo: Daniel Francisco Caballero Salas

Sección: Programacion Orientada a Objetos I

Carrera: Analista Programador Computacional

Sede: Campus Virtual

📘 Descripción general del sistema

Este proyecto corresponde a la Actividad de la Semana 4 de la asignatura Desarrollo Orientado a Objetos I.
El objetivo central del trabajo es leer, procesar y gestionar información almacenada en archivos .txt, aplicando correctamente los principios básicos de la programación orientada a objetos.

Durante el desarrollo del proyecto se implementó:

- Un conjunto de clases de dominio que representan las entidades definidas en el caso entregado.

- Un módulo GestorDatos, encargado de cargar y transformar la información de los archivos .txt en objetos Java.

- Lectura de archivos mediante FileReader y BufferedReader, trabajando con datos separados por ;.

- Almacenamiento de los objetos resultantes en ArrayList, evitando el uso de interfaces genéricas como List.

- Organización modular del código siguiendo buenas prácticas y estructuras de paquetes.

La actividad se centra principalmente en la carga y manipulación de datos externos, fortaleciendo el uso de POO en conjunto con técnicas de entrada/salida de archivos y validación básica.

'''
📁 src/
├── app/         # Clase principal con el método main
├── model/       # Clases de dominio utilizadas para representar los datos
├── data/        # GestorDatos y clases responsables de leer .txt
├── utils/       # Métodos auxiliares o validaciones
└── interfaces/  # Interfaces implementadas por las clases

📁 resources/
└── *.txt        # Archivos de datos utilizados por GestorDatos
'''

⚙️ Instrucciones para clonar y ejecutar el proyecto

Clona el repositorio desde GitHub:

git clone https://github.com/usuario/repositorio-evaluacion-final.git


Abre el proyecto en IntelliJ IDEA.

Verifica que el archivo .txt esté ubicado en /resources/.
Esta carpeta debe estar paralela a src/ para permitir acceder a los datos mediante rutas relativas o lectura directa con FileReader.

Ejecuta el archivo Main.java desde el paquete app/.

Observa en consola la carga de datos y el comportamiento del sistema.

🔗 Repositorio GitHub

https://github.com/DCaballero1164/POO1_A1_S4

📅 Fecha de entrega

[17/11/2025]

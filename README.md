# PROYECTO: TAREAS DE PROGRAMACIÓN ORIENTADA A OBJETOS

Autor: Erick Patiño

========================================================
TAREA 1: SISTEMA DE FIGURAS GEOMÉTRICAS
========================================================

En esta tarea se desarrolló un sistema de figuras geométricas
utilizando una clase abstracta llamada Figura.
Las clases Circulo, Rectangulo y TrianguloRectangulo
heredan de Figura e implementan sus propios métodos
para calcular área y perímetro usando @Override.
También se utilizó polimorfismo mediante un arreglo Figura[]
para recorrer todas las figuras y mostrar su información.
El proyecto fue organizado en diferentes archivos Java
para mantener un código limpio, claro y reutilizable.

========================================================
TAREA 2: SISTEMA DE EMPLEADOS CON JERARQUÍA
========================================================

En esta tarea se implementó una jerarquía de empleados
utilizando una clase abstracta llamada Empleado.
Las clases EmpleadoPorHora, EmpleadoFijo y EmpleadoComision
sobrescriben el método calcularSalario() dependiendo
del tipo de contrato de cada empleado.
Además, se creó la interfaz Bonificable para calcular bonos.
EmpleadoFijo y EmpleadoComision implementan esta interfaz
porque son los empleados que reciben bonificaciones.
También se utilizó instanceof para identificar objetos
Bonificables dentro de un arreglo Empleado[] aplicando
polimorfismo y reutilización de código.

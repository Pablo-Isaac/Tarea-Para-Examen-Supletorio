# Tutorial de Programación en Java

## Introducción

Este proyecto fue desarrollado como material de apoyo para estudiantes que están aprendiendo programación en Java.

El objetivo es explicar de forma sencilla algunos conceptos fundamentales que se utilizan frecuentemente al desarrollar programas.

Los temas incluidos son:

- Ciclos (Bucles)
- Métodos (Funciones)
- Vectores y Matrices
- Listas (ArrayList)
- Manejo de Archivos

---

# Ciclos (Bucles)

## ¿Qué es un ciclo?

Un ciclo es una estructura que permite repetir un bloque de instrucciones varias veces sin necesidad de escribir el mismo código repetidamente.

Los ciclos son muy útiles cuando se necesita procesar grandes cantidades de datos o realizar tareas repetitivas.

---

## Ciclo For

Se utiliza cuando conocemos la cantidad de repeticiones que se van a realizar.

### Sintaxis

```java
for(inicializacion; condicion; incremento){
    instrucciones;
}
```

### Ejemplo

```java
for(int i = 1; i <= 10; i++){
    System.out.println(i);
}
```

Código completo:

[EjemploFor.java](./codigo/ciclos/EjemploFor.java)

---

## Ciclo While

Se utiliza cuando no conocemos exactamente cuántas veces se repetirá el ciclo.

### Sintaxis

```java
while(condicion){
    instrucciones;
}
```

Código completo:

[EjemploWhile.java](./codigo/ciclos/EjemploWhile.java)

---

## Ciclo Do While

La diferencia principal es que siempre ejecuta el bloque al menos una vez.

### Sintaxis

```java
do{
    instrucciones;
}while(condicion);
```

Código completo:

[EjemploDoWhile.java](./codigo/ciclos/EjemploDoWhile.java)

---

## Ejercicios

### Ejercicio 1

Mostrar los números del 1 al 20.

### Solución

Utilizar un ciclo for.

### Ejercicio 2

Mostrar los números pares del 1 al 100.

### Solución

Utilizar un ciclo for aumentando de 2 en 2.

### Ejercicio 3

Mostrar una tabla de multiplicar del 5.

### Solución

Utilizar un ciclo for desde 1 hasta 10.

---

# Métodos (Funciones)

## ¿Qué es un método?

Un método es un bloque de código que realiza una tarea específica.

Permite reutilizar código y organizar mejor los programas.

---

## Ventajas

- Reutilización de código.
- Mejor organización.
- Facilita el mantenimiento.

---

## Método sin parámetros

Código completo:

[MetodoSaludar.java](./codigo/metodos/MetodoSaludar.java)

---

## Método con parámetros

Código completo:

[MetodoSuma.java](./codigo/metodos/MetodoSuma.java)

---

## Método con retorno

Código completo:

[MetodoRetorno.java](./codigo/metodos/MetodoRetorno.java)

---

## Ejercicios

### Ejercicio 1

Crear un método que muestre un mensaje de bienvenida.

### Ejercicio 2

Crear un método que reciba dos números y los multiplique.

### Ejercicio 3

Crear un método que retorne el cuadrado de un número.

---

# Vectores y Matrices

## ¿Qué es un vector?

Un vector es una estructura que almacena varios elementos del mismo tipo.

Ejemplo:

```java
int[] numeros = {10,20,30,40,50};
```

Código completo:

[VectorBasico.java](./codigo/vectores_matrices/VectorBasico.java)

---

## Recorrer un vector

Código completo:

[RecorrerVector.java](./codigo/vectores_matrices/RecorrerVector.java)

---

## Matrices

Una matriz es un arreglo de dos dimensiones.

Código completo:

[MatrizBasica.java](./codigo/vectores_matrices/MatrizBasica.java)

---

## Ejercicios

### Ejercicio 1

Crear un vector con 5 números.

### Ejercicio 2

Mostrar todos los elementos de un vector.

### Ejercicio 3

Crear una matriz de 3 filas por 3 columnas.

---

# Listas (ArrayList)

## ¿Qué es un ArrayList?

ArrayList es una colección dinámica que permite almacenar elementos.

A diferencia de los arreglos, puede aumentar o disminuir su tamaño.

---

## Crear una lista

Código completo:

[ListaBasica.java](./codigo/listas/ListaBasica.java)

---

## Agregar elementos

Código completo:

[AgregarElementos.java](./codigo/listas/AgregarElementos.java)

---

## Recorrer una lista

Código completo:

[RecorrerLista.java](./codigo/listas/RecorrerLista.java)

---

## Ejercicios

### Ejercicio 1

Crear una lista de nombres.

### Ejercicio 2

Agregar cinco elementos a una lista.

### Ejercicio 3

Mostrar todos los elementos utilizando un ciclo.

---

# Manejo de Archivos

## ¿Qué es el manejo de archivos?

Permite almacenar información de forma permanente en archivos de texto.

---

## Leer un archivo

Código completo:

[LeerArchivo.java](./codigo/archivos/LeerArchivo.java)

---

## Escribir un archivo

Código completo:

[EscribirArchivo.java](./codigo/archivos/EscribirArchivo.java)

---

## Procesar un archivo

Código completo:

[ProcesarArchivo.java](./codigo/archivos/ProcesarArchivo.java)

---

## Ejercicios

### Ejercicio 1

Crear un archivo de texto y escribir información.

### Ejercicio 2

Leer el contenido de un archivo.

### Ejercicio 3

Contar cuántas líneas tiene un archivo.

---

# Conclusiones

Los ciclos, métodos, vectores, listas y manejo de archivos son conceptos fundamentales en Java.

Comprender estos temas permite desarrollar programas más organizados y resolver problemas de forma eficiente.

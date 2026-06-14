# Tutorial de Programación en Java

## Introducción

Este proyecto fue desarrollado como material de apoyo para estudiantes que están aprendiendo programación en Java.

El objetivo es explicar de forma sencilla algunos conceptos fundamentales que se utilizan frecuentemente al desarrollar programas.

Los temas incluidos son:

* Ciclos (Bucles)
* Métodos (Funciones)
* Vectores y Matrices
* Listas (ArrayList)
* Manejo de Archivos

---

# Ciclos (Bucles)

## ¿Qué es un ciclo?

Un ciclo es una estructura que permite repetir instrucciones varias veces sin escribir el mismo código repetidamente.

Los ciclos ayudan a automatizar tareas y reducir la cantidad de código.

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

## Ciclo While

Se utiliza cuando no conocemos la cantidad exacta de repeticiones.

### Sintaxis

```java
while(condicion){
    instrucciones;
}
```

Código completo:

[EjemploWhile.java](./codigo/ciclos/EjemploWhile.java)

## Ciclo Do While

Siempre ejecuta el bloque de instrucciones al menos una vez.

### Sintaxis

```java
do{
    instrucciones;
}while(condicion);
```

Código completo:

[EjemploDoWhile.java](./codigo/ciclos/EjemploDoWhile.java)

## Ejercicios

### Ejercicio 1

Mostrar los números del 1 al 20 utilizando un ciclo for.

#### Solución

```java
for(int i = 1; i <= 20; i++){
    System.out.println(i);
}
```

### Ejercicio 2

Mostrar los números pares del 1 al 100.

#### Solución

```java
for(int i = 2; i <= 100; i += 2){
    System.out.println(i);
}
```

### Ejercicio 3

Mostrar la tabla de multiplicar del 5.

#### Solución

```java
for(int i = 1; i <= 10; i++){
    System.out.println("5 x " + i + " = " + (5 * i));
}
```

---

# Métodos (Funciones)

## ¿Qué es un método?

Un método es un bloque de código que realiza una tarea específica.

Permite reutilizar código y organizar mejor los programas.

## Ventajas

* Reutilización de código.
* Mejor organización.
* Facilita el mantenimiento.

## Método sin parámetros

Código completo:

[MetodoSaludar.java](./codigo/metodos/MetodoSaludar.java)

## Método con parámetros

Código completo:

[MetodoSuma.java](./codigo/metodos/MetodoSuma.java)

## Método con retorno

Código completo:

[MetodoRetorno.java](./codigo/metodos/MetodoRetorno.java)

## Ejercicios

### Ejercicio 1

Crear un método que muestre un mensaje de bienvenida.

#### Solución

```java
public static void bienvenida(){
    System.out.println("Bienvenido");
}
```

### Ejercicio 2

Crear un método que reciba dos números y los multiplique.

#### Solución

```java
public static void multiplicar(int a, int b){
    System.out.println(a * b);
}
```

### Ejercicio 3

Crear un método que retorne el cuadrado de un número.

#### Solución

```java
public static int cuadrado(int numero){
    return numero * numero;
}
```



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

## Recorrer un vector

Código completo:

[RecorrerVector.java](./codigo/vectores_matrices/RecorrerVector.java)

## Matrices

Una matriz es un arreglo de dos dimensiones.

Código completo:

[MatrizBasica.java](./codigo/vectores_matrices/MatrizBasica.java)

## Ejercicios

### Ejercicio 1

Crear un vector con cinco números.

#### Solución

```java
int[] numeros = {1,2,3,4,5};
```

### Ejercicio 2

Mostrar todos los elementos de un vector.

#### Solución

```java
for(int i = 0; i < numeros.length; i++){
    System.out.println(numeros[i]);
}
```

### Ejercicio 3

Crear una matriz de tres filas y tres columnas.

#### Solución

```java
int[][] matriz = {
    {1,2,3},
    {4,5,6},
    {7,8,9}
};
```



---

# Listas (ArrayList)

## ¿Qué es un ArrayList?

ArrayList es una colección dinámica que permite almacenar elementos.

A diferencia de los arreglos, puede cambiar de tamaño durante la ejecución.

## Crear una lista

Código completo:

[ListaBasica.java](./codigo/listas/ListaBasica.java)

## Agregar elementos

Código completo:

[AgregarElementos.java](./codigo/listas/AgregarElementos.java)

## Recorrer una lista

Código completo:

[RecorrerLista.java](./codigo/listas/RecorrerLista.java)

## Ejercicios

### Ejercicio 1

Crear una lista de nombres.

#### Solución

```java
ArrayList<String> nombres = new ArrayList<>();
```

### Ejercicio 2

Agregar elementos a una lista.

#### Solución

```java
nombres.add("Ana");
nombres.add("Luis");
nombres.add("Carlos");
```

### Ejercicio 3

Mostrar todos los elementos de la lista.

#### Solución

```java
for(String nombre : nombres){
    System.out.println(nombre);
}
```



---

# Manejo de Archivos

## ¿Qué es el manejo de archivos?

Permite almacenar información de forma permanente en archivos de texto.

## Leer un archivo

Código completo:

[LeerArchivo.java](./codigo/archivos/LeerArchivo.java)

## Escribir un archivo

Código completo:

[EscribirArchivo.java](./codigo/archivos/EscribirArchivo.java)

## Procesar un archivo

Código completo:

[ProcesarArchivo.java](./codigo/archivos/ProcesarArchivo.java)

## Ejercicios

### Ejercicio 1

Crear un archivo de texto y escribir información.

#### Solución

```java
FileWriter escritor = new FileWriter("datos.txt");
escritor.write("Hola Mundo");
escritor.close();
```

### Ejercicio 2

Leer el contenido de un archivo.

#### Solución

```java
BufferedReader lector = new BufferedReader(
    new FileReader("datos.txt")
);
```

### Ejercicio 3

Contar cuántas líneas tiene un archivo.

#### Solución

```java
int contador = 0;

while(lector.readLine() != null){
    contador++;
}
```



---

# Conclusiones

Los ciclos, métodos, vectores, matrices, listas y manejo de archivos forman parte de los fundamentos de programación en Java.

Comprender estos conceptos permite desarrollar programas más organizados, reutilizar código y resolver problemas de manera eficiente.

---
layout: default
title: Tutorial de Programación en Java
---

# Tutorial de Programación en Java

**Autor:** Pablo Isaac Sánchez Albancando
**Carrera:** Tecnologías de la Información — Universidad Técnica de Ambato
**Asignatura:** Fundamentos de Programación

---

## ¿Para quién es este tutorial?

Este tutorial está pensado para personas que **nunca han programado antes** o que están en sus primeras semanas aprendiendo Java. No necesitas saber nada de programación para empezar. Cada tema se explica desde cero, con ejemplos del mundo real y ejercicios resueltos paso a paso.

---

## ¿Qué es Java?

Java es un lenguaje de programación. Un lenguaje de programación es un idioma especial que usamos para darle instrucciones a una computadora. Así como los humanos usamos el español o el inglés para comunicarnos entre nosotros, usamos Java para comunicarnos con la computadora y decirle qué queremos que haga.

Por ejemplo, podemos decirle a la computadora:
- "Muestra el número 5 en la pantalla"
- "Suma dos números y dime el resultado"
- "Repite esta instrucción 10 veces"

Todo eso se hace escribiendo código en Java.

---

## Tabla de Contenidos

1. [Ciclos (Bucles)](#1-ciclos-bucles)
2. [Métodos (Funciones)](#2-métodos-funciones)
3. [Vectores y Matrices](#3-vectores-y-matrices)
4. [Listas — ArrayList](#4-listas--arraylist)
5. [Manejo de Archivos](#5-manejo-de-archivos)
6. [Conclusiones](#6-conclusiones)

---

# 1. Ciclos (Bucles)

## ¿Qué es un ciclo?

Imagina que te piden escribir en una hoja de papel 100 veces la frase "Estoy aprendiendo Java". Hacerlo a mano sería muy tardado. En programación pasa lo mismo: si necesitamos que la computadora repita algo muchas veces, no vamos a escribir la misma instrucción 100 veces. Para eso existen los **ciclos**.

Un ciclo es una estructura que le dice a la computadora: *"repite estas instrucciones hasta que se cumpla una condición"*.

Sin ciclos:
```java
System.out.println(1);
System.out.println(2);
System.out.println(3);
// ... tendríamos que escribir esto 100 veces
```

Con un ciclo:
```java
for(int i = 1; i <= 100; i++){
    System.out.println(i);
}
```

Con solo 3 líneas logramos lo mismo que con 100. Eso es el poder de los ciclos.

---

## Ciclo For

### ¿Cuándo se usa?

Se usa cuando **sabemos exactamente cuántas veces** queremos repetir algo. Por ejemplo: "quiero imprimir los números del 1 al 10" — sabemos que son exactamente 10 repeticiones.

### Partes del ciclo For

```java
for(inicializacion; condicion; incremento){
    instrucciones;
}
```

El ciclo `for` tiene tres partes separadas por punto y coma:

| Parte | ¿Qué hace? | Ejemplo |
|---|---|---|
| Inicialización | Crea una variable de control y le da un valor inicial | `int i = 1` |
| Condición | El ciclo se repite mientras esto sea verdadero | `i <= 10` |
| Incremento | Cambia la variable de control en cada repetición | `i++` |

### ¿Cómo funciona paso a paso?

Tomemos este ejemplo:
```java
for(int i = 1; i <= 5; i++){
    System.out.println(i);
}
```

La computadora lo ejecuta así:

1. Crea la variable `i` y le asigna el valor `1`
2. Revisa si `i <= 5` → `1 <= 5` es verdadero → entra al ciclo → imprime `1`
3. Suma 1 a `i` → ahora `i` vale `2`
4. Revisa si `i <= 5` → `2 <= 5` es verdadero → entra al ciclo → imprime `2`
5. Suma 1 a `i` → ahora `i` vale `3` → imprime `3`
6. Suma 1 a `i` → ahora `i` vale `4` → imprime `4`
7. Suma 1 a `i` → ahora `i` vale `5` → imprime `5`
8. Suma 1 a `i` → ahora `i` vale `6`
9. Revisa si `i <= 5` → `6 <= 5` es **falso** → el ciclo termina

Resultado en pantalla:
1
2
3
4
5
### Ejemplo completo

```java
public class EjemploFor {
    public static void main(String[] args) {
        // Imprimir los números del 1 al 10
        for(int i = 1; i <= 10; i++){
            System.out.println("Número: " + i);
        }
    }
}
```

[Ver archivo completo — EjemploFor.java](./codigo/ciclos/EjemploFor.java)

---

## Ciclo While

### ¿Cuándo se usa?

Se usa cuando **no sabemos exactamente cuántas veces** se va a repetir algo. Por ejemplo: "sigue pidiendo al usuario que ingrese un número hasta que ingrese uno positivo" — no sabemos cuántos intentos va a necesitar.

### Sintaxis

```java
while(condicion){
    instrucciones;
}
```

La computadora revisa la condición **antes** de ejecutar las instrucciones. Si la condición es falsa desde el principio, el ciclo nunca se ejecuta.

### ¿Cómo funciona paso a paso?

```java
int numero = 1;

while(numero <= 5){
    System.out.println(numero);
    numero++;
}
```

1. Revisa si `numero <= 5` → `1 <= 5` es verdadero → imprime `1` → suma 1 → `numero` vale `2`
2. Revisa si `numero <= 5` → `2 <= 5` es verdadero → imprime `2` → suma 1 → `numero` vale `3`
3. Continúa hasta que `numero` vale `6`
4. Revisa si `numero <= 5` → `6 <= 5` es falso → el ciclo termina

### Diferencia clave con el For

> Usa `for` cuando sabes cuántas repeticiones. Usa `while` cuando la cantidad de repeticiones depende de algo que puede cambiar durante la ejecución.

### Ejemplo completo

```java
public class EjemploWhile {
    public static void main(String[] args) {
        int contador = 10;

        // Cuenta regresiva del 10 al 1
        while(contador >= 1){
            System.out.println(contador);
            contador--;
        }

        System.out.println("¡Despegue!");
    }
}
```

[Ver archivo completo — EjemploWhile.java](./codigo/ciclos/EjemploWhile.java)

---

## Ciclo Do-While

### ¿Cuándo se usa?

Es muy similar al `while`, pero con una diferencia importante: **el bloque de instrucciones se ejecuta siempre al menos una vez**, porque la condición se evalúa al final, no al principio.

### Sintaxis

```java
do{
    instrucciones;
}while(condicion);
```

### Comparación: While vs Do-While

Situación: la condición es falsa desde el inicio (`numero = 10`, condición `numero < 5`)

Con `while`:
```java
int numero = 10;
while(numero < 5){
    System.out.println("Esto no se imprime nunca");
}
// El bloque NUNCA se ejecuta porque 10 < 5 es falso desde el inicio
```

Con `do-while`:
```java
int numero = 10;
do{
    System.out.println("Esto se imprime UNA VEZ");
}while(numero < 5);
// El bloque se ejecuta primero, LUEGO revisa la condición
```

### Ejemplo completo

```java
public class EjemploDoWhile {
    public static void main(String[] args) {
        int numero = 1;

        // Muestra los números del 1 al 5
        do{
            System.out.println("Valor: " + numero);
            numero++;
        }while(numero <= 5);
    }
}
```

[Ver archivo completo — EjemploDoWhile.java](./codigo/ciclos/EjemploDoWhile.java)

---

## Resumen: ¿Cuál ciclo usar?

| Ciclo | Úsalo cuando... | Ejecuta mínimo... |
|---|---|---|
| `for` | Sabes exactamente cuántas repeticiones | 0 veces |
| `while` | No sabes cuántas repeticiones serán | 0 veces |
| `do-while` | Necesitas que se ejecute al menos una vez | 1 vez siempre |

---

## Ejercicios de Ciclos

### Ejercicio 1 — Números del 1 al 20

**Problema:** Mostrar los números del 1 al 20 usando un ciclo for.

**Razonamiento:** Sabemos que son exactamente 20 repeticiones → usamos `for`. La variable empieza en 1, la condición es que sea menor o igual a 20, y aumentamos de 1 en 1.

```java
for(int i = 1; i <= 20; i++){
    System.out.println(i);
}
```

Resultado:
1
2
3
4
...
20

---

### Ejercicio 2 — Números pares del 1 al 100

**Problema:** Mostrar todos los números pares entre 1 y 100.

**Razonamiento:** Un número par es divisible entre 2. Podemos empezar desde 2 y sumar de 2 en 2, así nos saltamos todos los impares automáticamente.

```java
for(int i = 2; i <= 100; i += 2){
    System.out.println(i);
}
```

`i += 2` significa "suma 2 a i en cada iteración", por eso obtenemos: 2, 4, 6, 8 ... 100

---

### Ejercicio 3 — Tabla de multiplicar del 5

**Problema:** Mostrar la tabla de multiplicar del número 5.

**Razonamiento:** Una tabla de multiplicar va del 1 al 10. El número fijo es 5, y lo multiplicamos por la variable `i` que va del 1 al 10.

```java
for(int i = 1; i <= 10; i++){
    System.out.println("5 x " + i + " = " + (5 * i));
}
```

Resultado:
5 x 1 = 5

5 x 2 = 10

5 x 3 = 15

...

5 x 10 = 50
---

### Archivos de ejemplo en el repositorio

- [EjemploFor.java](./codigo/ciclos/EjemploFor.java)
- [EjemploWhile.java](./codigo/ciclos/EjemploWhile.java)
- [EjemploDoWhile.java](./codigo/ciclos/EjemploDoWhile.java)

---

# 2. Métodos (Funciones)

## ¿Qué es un método?

Imagina que trabajas en una panadería y cada día tienes que preparar pan. El proceso es siempre el mismo: mezclar ingredientes, amasar, hornear. En lugar de recordar y repetir todos esos pasos cada vez, podrías escribirlos en una receta y simplemente decir "hacer la receta del pan".

En programación, un **método** funciona igual que esa receta. Es un bloque de código que tiene un nombre, realiza una tarea específica, y puede ser llamado (ejecutado) desde cualquier parte del programa simplemente escribiendo su nombre.

Sin métodos, si necesitamos calcular el área de un círculo en tres partes distintas del programa:
```java
// Primera vez
double area1 = 3.1416 * 5 * 5;

// Segunda vez (repetimos todo el código)
double area2 = 3.1416 * 8 * 8;

// Tercera vez (repetimos otra vez)
double area3 = 3.1416 * 3 * 3;
```

Con un método:
```java
// Definimos el método UNA sola vez
public static double calcularArea(double radio){
    return 3.1416 * radio * radio;
}

// Lo llamamos todas las veces que necesitemos
double area1 = calcularArea(5);
double area2 = calcularArea(8);
double area3 = calcularArea(3);
```

Mucho más limpio, ¿verdad?

---

## Partes de un método

```java
public static void nombreDelMetodo(parametros){
    // instrucciones
}
```

| Parte | Significado |
|---|---|
| `public` | El método puede ser usado desde cualquier parte del programa |
| `static` | No necesitamos crear un objeto para llamar al método |
| `void` | El método no devuelve ningún valor (solo ejecuta instrucciones) |
| `nombreDelMetodo` | El nombre que le damos para poder llamarlo |
| `parametros` | Datos que le pasamos al método para que trabaje con ellos |

---

## Tipos de métodos

### Método sin parámetros y sin retorno

Es el tipo más sencillo. Solo ejecuta instrucciones cuando lo llamamos, no necesita datos externos y no devuelve nada.

```java
public class MetodoSaludar {

    // Definición del método
    public static void saludar(){
        System.out.println("¡Hola! Bienvenido al programa.");
        System.out.println("Este es tu primer método en Java.");
    }

    public static void main(String[] args){
        // Llamada al método — solo escribimos su nombre con paréntesis
        saludar();

        System.out.println("El método terminó, continuamos aquí.");

        // Podemos llamarlo las veces que queramos
        saludar();
    }
}
```

Resultado:
Hola Bienvenido al programa.
Este es tu primer método en Java.
El método terminó, continuamos aquí.
¡Hola! Bienvenido al programa.
Este es tu primer método en Java.
[Ver archivo completo — MetodoSaludar.java](./codigo/metodos/MetodoSaludar.java)

---

### Método con parámetros

Los parámetros son como los ingredientes de una receta: le decimos al método con qué datos debe trabajar. Se declaran dentro de los paréntesis con su tipo y nombre.

```java
public class MetodoSuma {

    // Este método recibe DOS números enteros como parámetros
    public static void sumar(int a, int b){
        int resultado = a + b;
        System.out.println(a + " + " + b + " = " + resultado);
    }

    public static void main(String[] args){
        // Llamamos al método pasando valores concretos (argumentos)
        sumar(3, 7);    // a=3, b=7 → imprime: 3 + 7 = 10
        sumar(15, 20);  // a=15, b=20 → imprime: 15 + 20 = 35
        sumar(100, 50); // a=100, b=50 → imprime: 100 + 50 = 150
    }
}
```

> **Parámetros vs Argumentos:** Los **parámetros** son las variables que declaramos en la definición del método (`int a, int b`). Los **argumentos** son los valores reales que pasamos al llamarlo (`3, 7`).

[Ver archivo completo — MetodoSuma.java](./codigo/metodos/MetodoSuma.java)

---

### Método con retorno

A veces necesitamos que el método nos **devuelva un resultado** para usarlo después. Para eso usamos la palabra `return` y especificamos el tipo de dato que devuelve en lugar de `void`.

```java
public class MetodoRetorno {

    // Este método recibe un número y DEVUELVE su cuadrado
    // "int" antes del nombre indica que devuelve un número entero
    public static int calcularCuadrado(int numero){
        int cuadrado = numero * numero;
        return cuadrado; // devuelve el resultado
    }

    public static void main(String[] args){
        // El valor que devuelve el método lo guardamos en una variable
        int resultado1 = calcularCuadrado(4);  // devuelve 16
        int resultado2 = calcularCuadrado(7);  // devuelve 49

        System.out.println("El cuadrado de 4 es: " + resultado1);
        System.out.println("El cuadrado de 7 es: " + resultado2);

        // También podemos usarlo directamente sin guardar
        System.out.println("El cuadrado de 10 es: " + calcularCuadrado(10));
    }
}
```

Resultado:
El cuadrado de 4 es: 16

El cuadrado de 7 es: 49

El cuadrado de 10 es: 100
[Ver archivo completo — MetodoRetorno.java](./codigo/metodos/MetodoRetorno.java)

---

## Resumen: tipos de métodos

| Tipo | `void` o tipo | Tiene `return` | Ejemplo |
|---|---|---|---|
| Sin parámetros, sin retorno | `void` | No | `public static void saludar()` |
| Con parámetros, sin retorno | `void` | No | `public static void sumar(int a, int b)` |
| Con parámetros, con retorno | `int`, `double`, etc. | Sí | `public static int cuadrado(int n)` |

---

## Ejercicios de Métodos

### Ejercicio 1 — Mensaje de bienvenida

**Problema:** Crear un método que muestre un mensaje de bienvenida en pantalla.

**Razonamiento:** No necesitamos parámetros (el mensaje siempre es el mismo) ni retorno (solo queremos imprimir). Usamos `void`.

```java
public static void bienvenida(){
    System.out.println("¡Bienvenido al sistema!");
    System.out.println("Hoy aprenderás sobre métodos en Java.");
}
```

Para llamarlo: `bienvenida();`

---

### Ejercicio 2 — Multiplicación

**Problema:** Crear un método que reciba dos números y muestre su producto.

**Razonamiento:** Necesitamos dos números de entrada → usamos parámetros. No necesitamos devolver nada → usamos `void`.

```java
public static void multiplicar(int a, int b){
    System.out.println(a + " x " + b + " = " + (a * b));
}
```

Para llamarlo: `multiplicar(4, 5);` → imprime `4 x 5 = 20`

---

### Ejercicio 3 — Cuadrado de un número

**Problema:** Crear un método que reciba un número y retorne su cuadrado.

**Razonamiento:** Necesitamos un número de entrada → parámetro. Necesitamos devolver el resultado para usarlo después → `return` con tipo `int`.

```java
public static int cuadrado(int numero){
    return numero * numero;
}
```

Para llamarlo: `int resultado = cuadrado(6);` → `resultado` vale `36`

---

### Archivos de ejemplo en el repositorio

- [MetodoSaludar.java](./codigo/metodos/MetodoSaludar.java)
- [MetodoSuma.java](./codigo/metodos/MetodoSuma.java)
- [MetodoRetorno.java](./codigo/metodos/MetodoRetorno.java)

---

# 3. Vectores y Matrices

## El problema que resuelven

Imagina que necesitas guardar las calificaciones de 30 estudiantes. Sin vectores, tendrías que crear 30 variables diferentes:

```java
int nota1 = 8;
int nota2 = 7;
int nota3 = 9;
// ... hasta nota30
```

Eso es muy ineficiente. Con un **vector** (también llamado arreglo o array) puedes guardar todos esos valores en una sola variable:

```java
int[] notas = {8, 7, 9, 6, 10, 8, 7, 9, 8, 7, 6, 9, 10, 8, 7, 9, 8, 6, 7, 10, 9, 8, 7, 6, 9, 8, 10, 7, 8, 9};
```

---

## ¿Qué es un vector?

Un vector es una estructura que almacena **múltiples valores del mismo tipo** bajo un único nombre. Cada valor ocupa una posición llamada **índice**, que empieza siempre desde **0** (no desde 1).
Vector: notas

Índice:   0    1    2    3    4

Valor:    8    7    9    6   10
Para acceder al primer elemento usamos `notas[0]`, al segundo `notas[1]`, y así sucesivamente.

---

## Crear un vector

Hay dos formas de crear un vector en Java:

**Forma 1 — Con valores iniciales:**
```java
int[] numeros = {10, 20, 30, 40, 50};
```

**Forma 2 — Con tamaño definido (los valores arrancan en 0):**
```java
int[] numeros = new int[5]; // crea un vector de 5 posiciones
numeros[0] = 10;
numeros[1] = 20;
numeros[2] = 30;
numeros[3] = 40;
numeros[4] = 50;
```

Ambas formas producen el mismo resultado.

### Ejemplo completo

```java
public class VectorBasico {
    public static void main(String[] args) {

        // Crear un vector con 5 frutas
        String[] frutas = {"Manzana", "Banana", "Cereza", "Durazno", "Uva"};

        // Acceder a elementos individuales
        System.out.println("Primera fruta: " + frutas[0]);  // Manzana
        System.out.println("Tercera fruta: " + frutas[2]);  // Cereza
        System.out.println("Última fruta: "  + frutas[4]);  // Uva

        // Conocer el tamaño del vector
        System.out.println("Total de frutas: " + frutas.length); // 5
    }
}
```

[Ver archivo completo — VectorBasico.java](./codigo/vectores_matrices/VectorBasico.java)

---

## Recorrer un vector

Para mostrar o procesar todos los elementos de un vector usamos un ciclo `for`. La variable de control va desde `0` hasta `longitud - 1`.

```java
public class RecorrerVector {
    public static void main(String[] args) {

        int[] numeros = {15, 30, 45, 60, 75};

        System.out.println("Elementos del vector:");

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Posición " + i + ": " + numeros[i]);
        }

        // También podemos usar for-each cuando no necesitamos el índice
        int suma = 0;
        for(int n : numeros){
            suma += n;
        }
        System.out.println("Suma total: " + suma); // 225
    }
}
```

Resultado:
Posición 0: 15

Posición 1: 30

Posición 2: 45

Posición 3: 60

Posición 4: 75

Suma total: 225
[Ver archivo completo — RecorrerVector.java](./codigo/vectores_matrices/RecorrerVector.java)

---

## ¿Qué es una matriz?

Si un vector es como una fila de casillas, una **matriz** es como una tabla con filas y columnas. Se accede a cada elemento con dos índices: `[fila][columna]`.
Matriz 3x3:

col 0  col 1  col 2

fila 0:    1      2      3

fila 1:    4      5      6

fila 2:    7      8      9
Para acceder al número `5` usamos `matriz[1][2]` (fila 1, columna 2... espera, eso sería 6). El `5` está en `matriz[1][1]` (fila 1, columna 1).

### Ejemplo completo

```java
public class MatrizBasica {
    public static void main(String[] args) {

        // Crear una matriz 3x3
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Acceder a un elemento específico
        System.out.println("Elemento [0][0]: " + matriz[0][0]); // 1
        System.out.println("Elemento [1][1]: " + matriz[1][1]); // 5
        System.out.println("Elemento [2][2]: " + matriz[2][2]); // 9

        // Recorrer toda la matriz con dos ciclos for anidados
        System.out.println("\nMatriz completa:");
        for(int fila = 0; fila < 3; fila++){
            for(int col = 0; col < 3; col++){
                System.out.print(matriz[fila][col] + " ");
            }
            System.out.println(); // salto de línea al terminar cada fila
        }

        // Calcular la suma de la diagonal principal (donde fila == columna)
        int sumaDiagonal = 0;
        for(int i = 0; i < 3; i++){
            sumaDiagonal += matriz[i][i]; // 1 + 5 + 9
        }
        System.out.println("\nSuma diagonal principal: " + sumaDiagonal); // 15
    }
}
```

Resultado:
Elemento [0][0]: 1

Elemento [1][1]: 5

Elemento [2][2]: 9
Matriz completa:

1 2 3

4 5 6

7 8 9
Suma diagonal principal: 15
[Ver archivo completo — MatrizBasica.java](./codigo/vectores_matrices/MatrizBasica.java)

---

## Ejercicios de Vectores y Matrices

### Ejercicio 1 — Crear un vector con cinco números

**Problema:** Declarar un vector con exactamente cinco números enteros.

**Razonamiento:** Usamos la sintaxis de inicialización directa con llaves.

```java
int[] numeros = {1, 2, 3, 4, 5};
System.out.println("Vector creado con " + numeros.length + " elementos.");
```

---

### Ejercicio 2 — Mostrar todos los elementos de un vector

**Problema:** Recorrer e imprimir cada elemento de un vector.

**Razonamiento:** Usamos un ciclo `for` que va desde el índice 0 hasta `length - 1`.

```java
int[] numeros = {10, 20, 30, 40, 50};

for(int i = 0; i < numeros.length; i++){
    System.out.println("Posición " + i + " → " + numeros[i]);
}
```

---

### Ejercicio 3 — Crear una matriz 3x3

**Problema:** Declarar una matriz de tres filas y tres columnas e imprimirla.

**Razonamiento:** Usamos dos corchetes `[][]` para declarar la matriz y dos ciclos for anidados para recorrerla.

```java
int[][] matriz = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

for(int i = 0; i < 3; i++){
    for(int j = 0; j < 3; j++){
        System.out.print(matriz[i][j] + "\t");
    }
    System.out.println();
}
```

---

### Archivos de ejemplo en el repositorio

- [VectorBasico.java](./codigo/vectores_matrices/VectorBasico.java)
- [RecorrerVector.java](./codigo/vectores_matrices/RecorrerVector.java)
- [MatrizBasica.java](./codigo/vectores_matrices/MatrizBasica.java)

---

# 4. Listas — ArrayList

## La limitación de los vectores

Los vectores tienen un problema: su tamaño es **fijo**. Una vez que declaras `int[] numeros = new int[5]`, ese vector siempre tendrá exactamente 5 posiciones. No puedes agregar un sexto elemento.

En muchos programas reales no sabemos de antemano cuántos datos vamos a necesitar guardar. Para eso existen las **listas dinámicas**.

---

## ¿Qué es un ArrayList?

Un `ArrayList` es una colección que puede **crecer o decrecer** automáticamente según necesitemos. Internamente Java maneja el tamaño por nosotros.

| Característica | Vector (`int[]`) | ArrayList |
|---|---|---|
| Tamaño | Fijo, definido al crear | Dinámico, cambia en ejecución |
| Agregar elementos | No se puede agregar más del tamaño inicial | `lista.add(elemento)` sin límite |
| Eliminar elementos | No se puede reducir | `lista.remove(indice)` |
| Acceso por índice | `vector[i]` | `lista.get(i)` |

---

## ¿Cómo se usa?

Primero hay que importar la clase `ArrayList` al inicio del archivo:

```java
import java.util.ArrayList;
```

Luego crear la lista indicando qué tipo de datos va a guardar (entre `<` y `>`):

```java
ArrayList<String> nombres = new ArrayList<>();
ArrayList<Integer> numeros = new ArrayList<>();
ArrayList<Double> precios = new ArrayList<>();
```

---

## Métodos principales

| Método | ¿Qué hace? | Ejemplo |
|---|---|---|
| `add(elemento)` | Agrega un elemento al final | `lista.add("Ana")` |
| `get(i)` | Obtiene el elemento en la posición i | `lista.get(0)` |
| `remove(i)` | Elimina el elemento en la posición i | `lista.remove(2)` |
| `size()` | Devuelve cuántos elementos tiene | `lista.size()` |
| `contains(x)` | Indica si el elemento está en la lista | `lista.contains("Ana")` |
| `clear()` | Elimina todos los elementos | `lista.clear()` |

---

## Ejemplo: ListaBasica

```java
import java.util.ArrayList;

public class ListaBasica {
    public static void main(String[] args) {

        // Crear una lista vacía de strings
        ArrayList<String> paises = new ArrayList<>();

        // Agregar elementos
        paises.add("Ecuador");
        paises.add("Colombia");
        paises.add("Perú");
        paises.add("Argentina");

        // Ver cuántos elementos tiene
        System.out.println("Número de países: " + paises.size()); // 4

        // Acceder a un elemento específico por su índice
        System.out.println("Primer país: " + paises.get(0));  // Ecuador
        System.out.println("Tercer país: " + paises.get(2));  // Perú
    }
}
```

[Ver archivo completo — ListaBasica.java](./codigo/listas/ListaBasica.java)

---

## Ejemplo: AgregarElementos

```java
import java.util.ArrayList;

public class AgregarElementos {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        // Agregar números a la lista
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        System.out.println("Lista original: " + numeros);
        // Imprime: [10, 20, 30, 40, 50]

        // Eliminar el elemento en la posición 2 (el número 30)
        numeros.remove(2);

        System.out.println("Después de eliminar posición 2: " + numeros);
        // Imprime: [10, 20, 40, 50]

        // Los elementos siguientes se desplazan automáticamente
        System.out.println("Nuevo elemento en posición 2: " + numeros.get(2));
        // Imprime: 40
    }
}
```

[Ver archivo completo — AgregarElementos.java](./codigo/listas/AgregarElementos.java)

---

## Ejemplo: RecorrerLista

```java
import java.util.ArrayList;

public class RecorrerLista {
    public static void main(String[] args) {

        ArrayList<String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        colores.add("Amarillo");

        // Forma 1: for-each (recomendada para solo leer)
        System.out.println("Recorrido con for-each:");
        for(String color : colores){
            System.out.println("- " + color);
        }

        // Forma 2: for tradicional (cuando necesitas el índice)
        System.out.println("\nRecorrido con for tradicional:");
        for(int i = 0; i < colores.size(); i++){
            System.out.println("Posición " + i + ": " + colores.get(i));
        }
    }
}
```

Resultado:
Recorrido con for-each:

Rojo
Verde
Azul
Amarillo

Recorrido con for tradicional:

Posición 0: Rojo

Posición 1: Verde

Posición 2: Azul

Posición 3: Amarillo
[Ver archivo completo — RecorrerLista.java](./codigo/listas/RecorrerLista.java)

---

## Ejercicios de Listas

### Ejercicio 1 — Crear una lista de nombres

**Problema:** Crear un ArrayList que almacene nombres de personas.

**Razonamiento:** Usamos `ArrayList<String>` porque los nombres son cadenas de texto.

```java
ArrayList<String> nombres = new ArrayList<>();
System.out.println("Lista creada. Elementos: " + nombres.size()); // 0
```

---

### Ejercicio 2 — Agregar elementos a una lista

**Problema:** Agregar tres nombres a la lista y mostrarla.

**Razonamiento:** Usamos el método `add()` para cada nombre y luego imprimimos la lista completa.

```java
nombres.add("Ana");
nombres.add("Luis");
nombres.add("Carlos");
System.out.println("Lista: " + nombres); // [Ana, Luis, Carlos]
```

---

### Ejercicio 3 — Mostrar todos los elementos

**Problema:** Recorrer la lista e imprimir cada nombre en una línea separada.

**Razonamiento:** El for-each es la forma más limpia de recorrer una lista cuando no necesitamos modificarla.

```java
for(String nombre : nombres){
    System.out.println("Nombre: " + nombre);
}
```

---

### Archivos de ejemplo en el repositorio

- [ListaBasica.java](./codigo/listas/ListaBasica.java)
- [AgregarElementos.java](./codigo/listas/AgregarElementos.java)
- [RecorrerLista.java](./codigo/listas/RecorrerLista.java)

---

# 5. Manejo de Archivos

## ¿Por qué necesitamos archivos?

Todo lo que hemos visto hasta ahora (variables, listas, vectores) guarda los datos en la **memoria RAM** de la computadora. El problema es que cuando el programa termina, esa memoria se libera y los datos **desaparecen para siempre**.

Si queremos que los datos persistan (que sigan existiendo después de cerrar el programa), necesitamos guardarlos en un **archivo**, ya sea un `.txt`, un `.csv`, u otro formato. Eso es exactamente lo que hace el manejo de archivos.

Ejemplos del mundo real donde se usa esto:
- Una aplicación que guarda tu lista de contactos en un archivo
- Un programa que exporta facturas a un archivo de texto
- Un sistema que lee configuraciones desde un archivo

---

## Clases necesarias

Para trabajar con archivos en Java necesitamos importar clases del paquete `java.io`:

```java
import java.io.FileWriter;      // para escribir en archivos
import java.io.BufferedWriter;  // mejora el rendimiento al escribir
import java.io.FileReader;      // para leer archivos
import java.io.BufferedReader;  // para leer línea por línea eficientemente
import java.io.IOException;     // para manejar errores de entrada/salida
```

---

## Escribir en un archivo

```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {
    public static void main(String[] args) {

        // El nombre del archivo que vamos a crear (o sobrescribir si ya existe)
        String nombreArchivo = "datos.txt";

        // try-with-resources: abre el archivo y lo cierra automáticamente al terminar
        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo))){

            // Escribir líneas en el archivo
            escritor.write("Nombre: Pablo");
            escritor.newLine(); // salto de línea

            escritor.write("Carrera: Tecnologías de la Información");
            escritor.newLine();

            escritor.write("Universidad: UTA");
            escritor.newLine();

            System.out.println("Archivo escrito correctamente.");

        } catch(IOException e){
            // Si ocurre un error (por ejemplo, no hay permisos para crear el archivo)
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
```

Después de ejecutar este programa, se crea un archivo llamado `datos.txt` con este contenido:
Nombre: Pablo

Carrera: Tecnologías de la Información

Universidad: UTA
[Ver archivo completo — EscribirArchivo.java](./codigo/archivos/EscribirArchivo.java)

---

## Leer un archivo

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
    public static void main(String[] args) {

        String nombreArchivo = "datos.txt";

        try(BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))){

            String linea;

            System.out.println("Contenido del archivo:");
            System.out.println("----------------------");

            // readLine() lee una línea a la vez y devuelve null al llegar al final
            while((linea = lector.readLine()) != null){
                System.out.println(linea);
            }

            System.out.println("----------------------");
            System.out.println("Lectura completada.");

        } catch(IOException e){
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
```

Resultado (si el archivo tiene el contenido del ejemplo anterior):
Contenido del archivo:
Nombre: Pablo

Carrera: Tecnologías de la Información

Universidad: UTA
Lectura completada.
[Ver archivo completo — LeerArchivo.java](./codigo/archivos/LeerArchivo.java)

---

## Procesar un archivo

Este ejemplo combina lectura y procesamiento: lee un archivo de números y calcula su suma.

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProcesarArchivo {
    public static void main(String[] args) {

        String nombreArchivo = "datos.txt";
        int contadorLineas = 0;

        try(BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))){

            String linea;

            while((linea = lector.readLine()) != null){
                contadorLineas++;
                System.out.println("Línea " + contadorLineas + ": " + linea);
            }

            System.out.println("\nTotal de líneas en el archivo: " + contadorLineas);

        } catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

[Ver archivo completo — ProcesarArchivo.java](./codigo/archivos/ProcesarArchivo.java)

---

## El bloque try-catch explicado

Cuando trabajamos con archivos, muchas cosas pueden salir mal: el archivo no existe, no tenemos permisos para leerlo, el disco está lleno, etc. Java nos obliga a manejar esos posibles errores usando `try-catch`.

```java
try {
    // Código que puede fallar
    // Si algo sale mal aquí, Java salta al bloque catch
} catch(IOException e) {
    // Qué hacer si ocurre un error
    // e.getMessage() nos dice qué salió mal
}
```

El `try-with-resources` (con paréntesis después de `try`) además cierra automáticamente el archivo al terminar, aunque ocurra un error. Siempre es la forma recomendada.

---

## Ejercicios de Manejo de Archivos

### Ejercicio 1 — Escribir en un archivo

**Problema:** Crear un archivo de texto y guardar una línea de información.

**Razonamiento:** Usamos `FileWriter` envuelto en `BufferedWriter` dentro de un `try-with-resources`.

```java
try(BufferedWriter bw = new BufferedWriter(new FileWriter("mi_archivo.txt"))){
    bw.write("Esta es mi primera línea guardada en un archivo.");
    bw.newLine();
    bw.write("Java puede guardar datos de forma permanente.");
} catch(IOException e){
    System.out.println("Error: " + e.getMessage());
}
```

---

### Ejercicio 2 — Leer un archivo

**Problema:** Leer y mostrar el contenido de un archivo de texto.

**Razonamiento:** Usamos `BufferedReader` con `readLine()` en un bucle `while` que termina cuando devuelve `null`.

```java
try(BufferedReader br = new BufferedReader(new FileReader("mi_archivo.txt"))){
    String linea;
    while((linea = br.readLine()) != null){
        System.out.println(linea);
    }
} catch(IOException e){
    System.out.println("Error: " + e.getMessage());
}
```

---

### Ejercicio 3 — Contar líneas de un archivo

**Problema:** Determinar cuántas líneas tiene un archivo.

**Razonamiento:** Incrementamos un contador en cada iteración del `while`.

```java
int contador = 0;
try(BufferedReader br = new BufferedReader(new FileReader("mi_archivo.txt"))){
    while(br.readLine() != null){
        contador++;
    }
} catch(IOException e){
    System.out.println("Error: " + e.getMessage());
}
System.out.println("El archivo tiene " + contador + " líneas.");
```

---

### Archivos de ejemplo en el repositorio

- [EscribirArchivo.java](./codigo/archivos/EscribirArchivo.java)
- [LeerArchivo.java](./codigo/archivos/LeerArchivo.java)
- [ProcesarArchivo.java](./codigo/archivos/ProcesarArchivo.java)

---

# 6. Conclusiones

A lo largo de este tutorial se estudiaron cinco conceptos fundamentales de la programación en Java:

**Los ciclos** (`for`, `while`, `do-while`) permiten automatizar tareas repetitivas. Sin ellos, tendríamos que escribir la misma instrucción decenas o cientos de veces.

**Los métodos** permiten dividir un programa grande en bloques pequeños y reutilizables. Hacen el código más organizado, fácil de leer y fácil de corregir.

**Los vectores y matrices** resuelven el problema de manejar muchos datos del mismo tipo. En lugar de cien variables separadas, usamos una sola estructura con índices.

**Las listas (ArrayList)** van un paso más allá: permiten manejar colecciones cuyo tamaño no conocemos de antemano, creciendo o reduciendo según lo necesitemos.

**El manejo de archivos** da persistencia a los datos. Todo lo que el usuario ingresa o el programa calcula puede guardarse en disco y recuperarse la próxima vez que se ejecute el programa.

Estos cinco temas forman la base sobre la que se construyen programas más complejos como aplicaciones de escritorio, sistemas web y bases de datos.

---

*Universidad Técnica de Ambato — Fundamentos de Programación — Ciclo Enero–Julio 2026*

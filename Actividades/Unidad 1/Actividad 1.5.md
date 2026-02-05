## Juego: Adivina el número

# Enunciado del problema

El programa genera un número entero aleatorio entre 0 y 99 utilizando el método `random` de la clase `Math`.  
Después, solicita al usuario que adivine dicho número.  

Si el usuario no acierta, el programa indica si el número ingresado es mayor o menor que el número generado.  
El proceso se repite hasta que el usuario adivine correctamente.

---

# Entradas

- Número entero ingresado por el usuario desde el teclado.

---

# Salidas

- Mensajes indicando si el número ingresado es mayor o menor que el número generado.
- Mensaje final cuando el usuario adivina correctamente el número.

---

# Variables a emplear

| Variable | Tipo | Descripción |
|--------|------|-------------|
| `number` | int | Número aleatorio generado por el programa |
| `guess` | int | Número ingresado por el usuario |
| `input` | Scanner | Permite leer datos desde el teclado |

---

# Análisis del problema

El programa debe permitir que el usuario intente adivinar un número generado aleatoriamente.  
Después de cada intento, el sistema compara el valor ingresado con el número generado y muestra una pista.  
El proceso se repite hasta que el usuario acierte.

---

# Diseño del algoritmo

1. Generar un número aleatorio entre 0 y 99.
2. Solicitar al usuario que ingrese un número.
3. Comparar el número ingresado con el número generado.
4. Indicar si el número ingresado es mayor o menor.
5. Repetir hasta que el usuario adivine el número.

---

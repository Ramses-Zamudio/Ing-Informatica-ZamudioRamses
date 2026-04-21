# 3. Game: Learning Addition

---

# Enunciado del problema

El programa genera dos números enteros aleatorios menores que 100.

Posteriormente, solicita al usuario que ingrese la suma de ambos números.

El programa compara la respuesta del usuario con el resultado correcto:

- Si la respuesta es correcta, muestra un mensaje indicando que es correcto.
- Si la respuesta es incorrecta, muestra un mensaje de error.

---

# Entradas

- `sum` → Número entero ingresado por el usuario (respuesta de la suma).

---

# Salidas

- Mensaje **"CORRECTO!"** si la respuesta coincide con la suma real.
- Mensaje **"ERROR!"** si la respuesta es incorrecta.

---

# Variables a emplear

| Variable | Tipo | Descripción |
|----------|------|------------|
| `num1` | int | Primer número aleatorio generado |
| `num2` | int | Segundo número aleatorio generado |
| `sum` | int | Respuesta ingresada por el usuario |
| `input` | Scanner | Permite leer datos desde el teclado |

---

# Análisis del problema

El programa debe generar dos números aleatorios menores que 100 utilizando el método `Math.random()`.

Después, debe solicitar al usuario que ingrese la suma de dichos números.

El sistema compara la respuesta ingresada con la suma real (`num1 + num2`).  
Si ambas coinciden, el programa muestra un mensaje indicando que la respuesta es correcta; en caso contrario, muestra un mensaje de error.

---

# Diseño del algoritmo

1. Generar dos números aleatorios menores que 100.
2. Mostrar la operación al usuario.
3. Leer la respuesta ingresada.
4. Comparar la respuesta con la suma real.
5. Mostrar:
   - "CORRECTO!" si coincide.
   - "ERROR!" si no coincide.

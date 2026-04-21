# 4. Game: Addition for Three Numbers

---

# Enunciado del problema

El programa genera tres números enteros aleatorios de un solo dígito (entre 0 y 9).

Posteriormente, solicita al usuario que ingrese la suma de estos tres números.

El programa compara la respuesta ingresada con el resultado correcto:

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
| `num1` | int | Primer número aleatorio (0–9) |
| `num2` | int | Segundo número aleatorio (0–9) |
| `num3` | int | Tercer número aleatorio (0–9) |
| `sum` | int | Respuesta ingresada por el usuario |
| `input` | Scanner | Permite leer datos desde el teclado |

---

# Análisis del problema

El programa debe generar tres números aleatorios de un solo dígito utilizando el método `Math.random()`.

Luego, muestra la operación al usuario y solicita que ingrese el resultado de la suma.

El sistema compara la respuesta ingresada con la suma real (`num1 + num2 + num3`).

Si la respuesta es correcta, el programa muestra un mensaje indicando que el usuario acertó; en caso contrario, muestra un mensaje de error.

---

# Diseño del algoritmo

1. Generar tres números aleatorios entre 0 y 9.
2. Mostrar la operación al usuario.
3. Leer la respuesta ingresada.
4. Comparar la respuesta con la suma real.
5. Mostrar:
   - "CORRECTO!" si coincide.
   - "ERROR!" si no coincide.

# Juego: Lanzamiento de dados hasta obtener una suma específica

---

# Enunciado del problema

El programa solicita al usuario una **suma deseada** entre 2 y 12.

Posteriormente, mediante el método `rollDice`, se simula el lanzamiento de dos dados de manera aleatoria hasta que la suma de ambos sea igual a la suma deseada.

Finalmente, el programa muestra cuántas veces fue necesario lanzar los dados para obtener dicha suma.

---

# Entradas

- `valor` → Número entero ingresado por el usuario (suma deseada entre 2 y 12).

---

# Salidas

- Número de lanzamientos necesarios para obtener la suma deseada.
- Mensaje de error si el número ingresado no está dentro del rango permitido.

---

# Variables a emplear

| Variable | Tipo | Descripción |
|----------|------|------------|
| `valor` | int | Suma deseada ingresada por el usuario |
| `n_roll` | int | Número de lanzamientos realizados |
| `flag` | boolean | Controla la validación del rango |
| `die1` | int | Valor aleatorio del dado 1 |
| `die2` | int | Valor aleatorio del dado 1 |

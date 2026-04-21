# 1. Algebra: Solving Quadratic Equation

---

# Enunciado del problema

El programa solicita al usuario los coeficientes `a`, `b` y `c` de una ecuación cuadrática de la forma:

ax² + bx + c = 0

Las raíces de la ecuación se calculan utilizando la fórmula general:

r1 = (-b + √(b² - 4ac)) / (2a)  
r2 = (-b - √(b² - 4ac)) / (2a)

El término:

b² - 4ac

se denomina **discriminante**.

El resultado depende del valor del discriminante:

- Si es positivo → existen dos raíces reales.
- Si es igual a cero → existe una raíz real.
- Si es negativo → no existen raíces reales (raíces imaginarias).

---

# Entradas

- `a` → coeficiente cuadrático
- `b` → coeficiente lineal
- `c` → término independiente

---

# Salidas

- Valor del discriminante.
- Dos raíces reales si el discriminante es positivo.
- Una raíz real si el discriminante es cero.
- Mensaje indicando que las raíces son imaginarias si el discriminante es negativo.

---

# Variables a emplear

| Variable | Tipo | Descripción |
|----------|------|------------|
| `a` | double | Coeficiente cuadrático |
| `b` | double | Coeficiente lineal |
| `c` | double | Término independiente |
| `disc` | double | Discriminante (b² - 4ac) |
| `r1` | double | Primera raíz |
| `r2` | double | Segunda raíz |
| `input` | Scanner | Lectura de datos |

---

# Análisis del problema

El programa debe calcular el discriminante para determinar el tipo de raíces que tiene la ecuación cuadrática.  

Dependiendo del resultado del discriminante, el programa calcula las raíces usando la fórmula general o muestra un mensaje indicando que no existen raíces reales.

---

# Diseño del algoritmo

1. Solicitar al usuario los valores de `a`, `b` y `c`.
2. Calcular el discriminante:  
   disc = b² - 4ac
3. Evaluar:
   - Si disc > 0 → calcular r1 y r2.
   - Si disc == 0 → calcular una raíz.
   - Si disc < 0 → mostrar mensaje de raíces imaginarias.
4. Mostrar resultados.

# 2. Algebra: Solving 2x2 Linear Equation (Cramer's Rule)

---

# Enunciado del problema

El programa solicita al usuario los coeficientes de un sistema de ecuaciones lineales 2x2 de la forma:

ax + by = c  
dx + ey = f  

El sistema se resuelve utilizando la **Regla de Cramer**, donde:

Determinante = (a·e − b·d)

Si el determinante es diferente de cero, el sistema tiene solución única:

x = (c·e − b·f) / (a·e − b·d)  
y = (a·f − c·d) / (a·e − b·d)

Si el determinante es igual a cero, el sistema no tiene solución única.

---

# Entradas

- `a`, `b`, `c` → coeficientes de la primera ecuación
- `d`, `e`, `f` → coeficientes de la segunda ecuación

---

# Salidas

- Valor de `x`
- Valor de `y`
- Mensaje indicando que el sistema no tiene solución si el determinante es cero

---

# Variables a emplear

| Variable | Tipo | Descripción |
|----------|------|------------|
| `a,b,c,d,e,f` | double | Coeficientes del sistema |
| `x` | double | Solución para x |
| `y` | double | Solución para y |
| `input` | Scanner | Lectura de datos |

---

# Análisis del problema

Para resolver un sistema de ecuaciones lineales 2x2 mediante la Regla de Cramer, es necesario calcular primero el determinante principal.

Si el determinante es diferente de cero, el sistema tiene solución única y se calculan los valores de `x` y `y`.

Si el determinante es igual a cero, el sistema no tiene solución única (puede ser incompatible o tener infinitas soluciones).

---

# Diseño del algoritmo

1. Solicitar los coeficientes del sistema.
2. Calcular el determinante:  
   det = (a·e − b·d)
3. Evaluar:
   - Si det ≠ 0 → calcular x y y.
   - Si det = 0 → mostrar mensaje sin solución.
4. Mostrar resultados.

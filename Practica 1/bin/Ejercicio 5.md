# 5. Geometry: Two Rectangles

---

# Enunciado del problema

El programa solicita al usuario ingresar las coordenadas del centro (x, y), el ancho (width) y el alto (height) de dos rectángulos.

El objetivo es determinar si:

- El segundo rectángulo está completamente dentro del primero.
- El segundo rectángulo se superpone (solapa) con el primero.
- Los rectángulos no se intersectan.

---

# Entradas

Para el primer rectángulo:
- `x1` → Coordenada en x
- `y1` → Coordenada en y
- `w1` → Ancho
- `h1` → Alto

Para el segundo rectángulo:
- `x2` → Coordenada en x
- `y2` → Coordenada en y
- `w2` → Ancho
- `h2` → Alto

---

# Salidas

- Mensaje indicando que el rectángulo 2 está dentro del rectángulo 1.
- Mensaje indicando que el rectángulo 2 solapa al rectángulo 1.
- Mensaje indicando que los rectángulos no están encimados.

---

# Variables a emplear

| Variable | Tipo | Descripción |
|----------|------|------------|
| `x1, y1` | int | Coordenadas del primer rectángulo |
| `w1, h1` | int | Dimensiones del primer rectángulo |
| `x2, y2` | int | Coordenadas del segundo rectángulo |
| `w2, h2` | int | Dimensiones del segundo rectángulo |
| `flag` | boolean | Indica si existe solapamiento |
| `input` | Scanner | Lectura de datos |

---

# Análisis del problema

El programa compara las dimensiones y posiciones de ambos rectángulos.

Primero verifica si el rectángulo 2 está completamente contenido dentro del rectángulo 1 mediante comparación de límites.

Si no está completamente dentro, el programa revisa punto por punto si alguna parte del rectángulo 2 se encuentra dentro del área del rectángulo 1.

Si encuentra al menos un punto en común, determina que existe solapamiento.

Si no se encuentra ninguna intersección, concluye que los rectángulos no están encimados.

---

# Diseño del algoritmo

1. Solicitar las coordenadas y dimensiones de ambos rectángulos.
2. Verificar si el rectángulo 2 está completamente dentro del rectángulo 1.
3. Si no está dentro:
   - Recorrer los puntos del rectángulo 2.
   - Verificar si alguno pertenece al área del rectángulo 1.
4. Si se encuentra coincidencia → hay solapamiento.
5. Si no → los rectángulos no se intersectan.
6. Mostrar el resultado correspondiente.

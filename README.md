# Reto de Refactorización – Operación Tienda D1

## Introducción

En este ejercicio vamos a resolver un reto de refactorización que nos propuso el **equipo 8**.  
El objetivo del reto es analizar un sistema existente con problemas de diseño y aplicar principios de diseño de software para mejorar su estructura, mantenibilidad y escalabilidad.

El escenario planteado es el sistema interno de una tienda tipo **D1**, el cual inicialmente fue desarrollado para una tienda pequeña donde una sola persona realizaba todas las tareas. Debido a esto, el sistema fue construido con una arquitectura muy simple, pero con el tiempo la tienda creció y ahora existen diferentes roles dentro de la operación.

Esto genera problemas porque el sistema no fue diseñado pensando en esa evolución.

---

# Descripción del reto

El equipo 8 nos propone analizar un sistema que actualmente tiene problemas claros de diseño y refactorizarlo aplicando dos principios importantes de diseño de software:

- **ISP (Interface Segregation Principle)**
- **High Cohesion (Alta Cohesión)**

La idea principal del reto es mejorar la estructura del código para que cada parte del sistema tenga una responsabilidad clara y los distintos roles de la tienda no dependan de funcionalidades que realmente no necesitan.

---

# Estado actual del sistema (ANTES)

Al revisar el código que nos entregaron en la carpeta del reto, encontramos varios problemas de diseño que afectan la calidad del sistema.

## 1. Interfaz gigante (Violación de ISP)

Actualmente existe **una sola interfaz que contiene todas las operaciones del sistema**, incluyendo:

- funciones de caja
- manejo de inventario
- compras
- devoluciones
- reclamos
- reportes
- servicio al cliente

Esto provoca que **todos los roles dependan de la misma interfaz**, incluso si solo utilizan una pequeña parte de ella.

Por ejemplo:

- un cajero no debería depender de métodos de inventario
- un empleado de bodega no debería depender de funciones de facturación

Esto rompe el principio **ISP**, que indica que una clase no debería verse obligada a implementar métodos que no utiliza.

---

## 2. Clase “Dios” (Baja cohesión)

El sistema también tiene una **clase central que implementa todas las funcionalidades del sistema**.

Esta clase se encarga de:

- ventas
- inventario
- facturación
- devoluciones
- reclamos
- reportes

Esto significa que la clase tiene **demasiadas responsabilidades**, lo que genera un problema de **baja cohesión**.

En un diseño con alta cohesión, cada clase debería tener **una responsabilidad clara y bien definida**.

---

## 3. Cambios con efecto dominó

Debido a que toda la lógica está concentrada en una sola clase, cualquier cambio en una funcionalidad puede afectar otras partes del sistema.

Por ejemplo:

- modificar la lógica de devoluciones puede afectar el sistema de ventas
- cambiar la facturación puede afectar inventario

Esto aumenta el riesgo de introducir errores y hace que el sistema sea difícil de mantener.

---

## 4. Escalabilidad organizacional pobre

En la realidad, una tienda tipo D1 tiene varios roles operativos, por ejemplo:

- cajero
- supervisor
- personal de bodega
- personal de soporte o servicio al cliente

Sin embargo, el sistema actual **no refleja esta separación de responsabilidades**, ya que todo está concentrado en una sola estructura.

Esto hace que el sistema sea difícil de escalar a medida que la organización crece.

---

# Objetivo del reto

El objetivo de este reto es **refactorizar el sistema actual** para mejorar su diseño aplicando los siguientes principios.

## Aplicar ISP (Interface Segregation Principle)

Debemos **dividir la interfaz gigante en varias interfaces más pequeñas**, cada una enfocada en un rol o conjunto de responsabilidades.

Por ejemplo:

- interfaz para operaciones de caja
- interfaz para inventario
- interfaz para servicio al cliente
- interfaz para reportes

De esta manera, cada rol del sistema solo dependerá de las funcionalidades que realmente necesita.

---

## Aplicar High Cohesion

También debemos **separar la clase central en varias clases con responsabilidades específicas**.

En lugar de una sola clase que haga todo, el sistema debería tener componentes como:

- clase de ventas
- clase de inventario
- clase de devoluciones
- clase de reportes
- clase de atención al cliente

Cada clase se encargará únicamente de su propia lógica.

---

# Resultado esperado

Al aplicar estos cambios buscamos lograr:

- un sistema más **modular**
- clases con **responsabilidades claras**
- menor **acoplamiento entre componentes**
- mayor **facilidad para escalar el sistema**
- código más **mantenible y entendible**

---

# Conclusión

Este reto nos permite analizar un sistema con problemas comunes de diseño y aplicar principios fundamentales de ingeniería de software para mejorar su arquitectura.

Al aplicar **ISP** y **High Cohesion**, logramos separar responsabilidades, reducir dependencias innecesarias y construir una base de código mucho más limpia y preparada para crecer junto con la organización.

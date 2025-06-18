# Proceso con enfoque ADD y Clean Architecture

### 1. ¿Qué es Attribute-Driven Design (ADD) y cuál es su propósito en el diseño de software?

Es un enfoque para diseñar la arquitectura del sistema, teniendo como base los atributos de calidad como rendimiento, seguridad o escalabilidad. Su proposito es que la arquitectura se adapte a las necesidades del negocio. 

### 2. ¿Cómo se relaciona ADD con Clean Architecture en el proceso de diseño de sistemas?

ADD define qué necesita el sistema desde una perspectiva de calidad, mientras que Clean Architecture organiza el código en capas para mantenerlo desacoplado y mantenible.

### 3. ¿Cuáles son los pasos principales del método ADD para definir una arquitectura de software?

1. Definit los atributos de calidad y restricciones
2. Diseñar la arquitectura con base en atributos de calidad. 
3. Implementar siguiendo Clean Architecture
4. Validar y refinar la arquitectura 

### 4. ¿Cómo se identifican los atributos de calidad en ADD y por qué son importantes?

Se identifican analizando los requisitos del negocio o del sistema. Son importantes porque guían las decisiones arquitectónicas para que el sistema cumpla con las expectativas. 

### 5. ¿Por qué Clean Architecture complementa ADD en la implementación de una solución?

Porque organiza el código en capas independientes. Esto facilita cumplir con los atributos de calidad definidos en ADD, manteniendo una separación de responsabilidades y bajo acoplamiento. 

### 6. ¿Qué criterios se deben considerar al definir las capas en Clean Architecture dentro de un proceso ADD?

- Dominio: Contiene entidades y reglas de negocio, debe ser independiente.
- Aplicación: Gestiona casos de uso, conectando el dominio con otras capas.
- Infraestructura: Maneja acceso a datos y servicios externos, usando interfaces.
- Presentación: Incluye UI o API, dependiendo solo de la capa de aplicación.

### 7. ¿Cómo ADD ayuda a tomar decisiones arquitectónicas basadas en necesidades del negocio?

ADD prioriza los atributos de calidad que reflejan las necesidades del negocio. Luego, ejecuta acciones específicas para garantizar que la arquitectura cumpla con esos objetivos desde el diseño. 
- **Ejemplo**: Si se requiere seguridad, se toman decisiones como usar encriptación y/o autenticar usuarios.

### 8. ¿Cuáles son los beneficios de combinar ADD con Clean Architecture en un sistema basado en microservicios?

Permite tener servicios bien diseñados desde el punto de vista técnico y organizados internamente de forma desacoplada, lo que facilita escalar, mantener y genera adaptabilidad para ajustar la arquitectura según cambien los requisitos.

### 9. ¿Cómo se asegura que la arquitectura resultante cumpla con los atributos de calidad definidos en ADD?

A partir de pruebas como lo son: pruebas de carga, seguridad, revisiones arquitectónicas, métricas, y si no se cumple, se debe ajustar. 

### 10. ¿Qué herramientas o metodologías pueden ayudar a validar una arquitectura diseñada con ADD y Clean Architecture?

- Pruebas de carga (JMeter): Para validar atributos como rendimiento y escalabilidad.

- Revisiones de arquitectura (Architecture Review):
Permiten identificar si las decisiones arquitectónicas están alineadas con los atributos de calidad y las restricciones definidas.

- Análisis estático de código (SonarQube):
Ayuda a mantener la calidad del código, detectar problemas de acoplamiento, complejidad, duplicación y otras métricas técnicas.

- Pruebas automatizadas (unitarias, integración, end-to-end)
# Clean Architecture en microservicios Spring Boot

### 1. ¿Cuál es el propósito principal de Clean Architecture en el desarrollo de software?

Organizar el código en capas independientes para separar la lógica de negocio de la infraestructura y la presentación, asegurando que el sistema sea mantenible, escalable y fácil de modificar.

### 2. ¿Qué beneficios aporta Clean Architecture a un microservicio en Spring Boot?

Permite tener microservicios desacoplados, donde el dominio no depende de Spring ni de la base de datos. Además, hace más sencillo modificar tecnologias y mejora la organización del código.

### 3. ¿Cuáles son las principales capas de Clean Architecture y qué responsabilidad tiene cada una?

- Dominio: Contiene entidades y reglas de negocio, sin dependencias externas.
- Aplicación: Gestiona casos de uso, orquestando la lógica de negocio sin acoplarse a infraestructura.
Infraestructura: Implementa detalles técnicos como repositorios, bases de datos o servicios externos.
- Presentación: Maneja controladores REST, UI o autenticación, conectando con la capa de aplicación.

### 4. ¿Por qué se recomienda desacoplar la lógica de negocio de la infraestructura en un microservicio?

Esto se debe, a que permite que la lógica de negocio sea independiente de tecnologías, lo que facilita su modificación, prueba y mantenimiento. 

### 5. ¿Cuál es el rol de la capa de aplicación y qué tipo de lógica debería contener?

Se encarga de orquestar los casos de uso, contenidneod la lógica del negocio específica, sin depender de bases de datos o APIs externas.

### 6. ¿Qué diferencia hay entre un UseCase y un Service en Clean Architecture?

- **Service**: Combina la lógica de negocio y casos de uso.
- **UseCase**: Encapsula una acción del negocio y se mantiene separado del resto. 

### 7. ¿Por qué se recomienda definir Repositories como interfaces en la capa de dominio en lugar de usar directamente JpaRepository?

Porque se logra desacoplar la lógica de negocio de JPA, logrando cambiar la implementación sin modificar el dominio. 

### 8. ¿Cómo se implementa un UseCase en un microservicio con Spring Boot y qué ventajas tiene?

Se implementa en la capa de aplicación, recibe el repositorio como dependencia y ejecuta una acción de negocio.
**Ventajas**:
- Modularidad
- Mantenibilidad
- Escalabilidad

### 9. ¿Qué problemas podrían surgir si no aplicamos Clean Architecture en un proyecto de microservicios?

- **Acoplamiento**: La lógica de negocio se mezcla con la infraestructura.
- **Mantenimiento**: El código desorganizado, con controladores o servicios sobrecargados.
- **Escalabilidad**: Cambiar tecnologías requiere reescribir el código.
- **Pruebas**: Las dependencias directas dificultan las pruebas unitarias.

### 10. ¿Cómo Clean Architecture facilita la escalabilidad y mantenibilidad en un entorno basado en microservicios?

Cada microservicio tiene su estructura clara, la lógica de negocio está protegida, y se pueden modificar detalles técnicos sin involucrar la lógica. 
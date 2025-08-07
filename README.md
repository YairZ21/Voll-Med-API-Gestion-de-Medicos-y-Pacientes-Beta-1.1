# 🏥 Voll Med API - Gestión de Médicos y Pacientes Version Beta 1.1

¡Bienvenido a **Voll Med API**!  
Una solución moderna y robusta para la gestión de médicos y pacientes en clínicas y centros de salud, desarrollada con **Java 17**, **Spring Boot** y **Maven**.

---

## 🚀 ¿Qué es Voll Med API?

Voll Med API es una API RESTful que permite registrar, listar, actualizar y eliminar (de forma lógica) médicos y pacientes. Está diseñada para ser escalable, segura y fácil de integrar con cualquier frontend o sistema externo.

---

## ✨ Características Principales

- **Gestión completa de médicos y pacientes**  
  Registra, consulta, actualiza y elimina recursos de manera eficiente.

- **Validaciones robustas**  
  Uso de anotaciones de Jakarta Validation para asegurar la integridad de los datos.

- **Paginación y ordenamiento**  
  Listados optimizados para grandes volúmenes de datos.

- **Eliminación lógica**  
  Los registros no se borran físicamente, solo se desactivan.

- **Arquitectura modular**  
  Separación clara entre entidades, DTOs y controladores.

- **Preparado para ampliaciones**  
  Fácil de mantener y escalar.

---

## 🛠️ Tecnologías Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Maven
- SQL (MySQL, PostgreSQL, etc.)
- Insomnia

---

## ⚡ Instalación Rápida

1. Clona el repositorio  


2. Accede al directorio  
   `cd tu-repo`

3. Compila el proyecto  
   `mvn clean install`

4. Ejecuta la aplicación  
   `mvn spring-boot:run`

---

## 📚 Endpoints Principales

- `/medicos`  
  - POST: Registrar médico  
  - GET: Listar médicos  
  - PUT: Actualizar médico  
  - DELETE: Eliminar médico

- `/pacientes`  
  - POST: Registrar paciente  
  - GET: Listar pacientes  
  - PUT: Actualizar paciente  
  - DELETE: Eliminar paciente

---

## 🗂️ Estructura del Proyecto

- `src/main/java/med/voll/api/medico` → Lógica y modelos de médicos  
- `src/main/java/med/voll/api/Paciente` → Lógica y modelos de pacientes  
- `src/main/java/med/voll/api/controller` → Controladores REST  
- `src/main/resources` → Configuración y recursos  
- `pom.xml` → Configuración de Maven

---

## 🤝 Contribuciones

¡Las contribuciones son bienvenidas!  
Abre un issue o pull request para sugerencias, mejoras o reportar bugs.

Contacto = yairandrezunig4@gmail.com

---

¡Gracias por visitar **Voll Med API**!  
¿Listo para llevar la gestión de tu clínica al siguiente nivel? 🚑

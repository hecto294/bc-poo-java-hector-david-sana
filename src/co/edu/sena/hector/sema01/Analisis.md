# Análisis Orientado a Objetos - Clínica Oftalmológica "Visión Clara"

## 1. Identificación del Dominio

**Nombre del negocio:** Clínica Oftalmológica "Visión Clara"\
**Tipo:** Servicio de salud especializado\
**Descripción:**\
La Clínica Oftalmológica "Visión Clara" ofrece servicios médicos
enfocados en el diagnóstico, tratamiento y corrección de problemas
visuales. Atiende pacientes con miopía, astigmatismo, cataratas y otras
condiciones oculares, mediante profesionales especializados, equipos
modernos y una atención integral.

------------------------------------------------------------------------

## 2. Objetos Identificados

### Objeto Principal: **Paciente**

**¿Qué es?:**\
Representa a la persona que asiste a la clínica para recibir atención
oftalmológica.

**Atributos identificados:** - `idPaciente`: String -- Código único que
identifica al paciente.\
- `nombreCompleto`: String -- Nombre y apellidos del paciente.\
- `edad`: int -- Edad del paciente, usada para determinar tratamientos
  especiales.\
- `diagnostico`: String -- Descripción médica del problema ocular.\
- `citaActiva`: boolean -- Indica si el paciente tiene una cita
  pendiente o cancelada.

**Métodos identificados:** - `mostrarInformacion()`: Muestra en consola
toda la información del paciente.\
- `calcularCostoConsulta()`: Calcula el valor de la cita dependiendo de
  la edad.\
- `setCitaActiva(boolean estado)`: Cambia el estado de la cita (activa o
  cancelada).\
- `getNombreCompleto()`: Devuelve el nombre completo del paciente.

------------------------------------------------------------------------

### Objeto Secundario: **Doctor**

**¿Qué es?:**\
Representa al profesional oftalmólogo encargado de atender a los
pacientes de la clínica.

**Atributos identificados:** - `idDoctor`: String -- Código único del
doctor.\
- `nombre`: String -- Nombre completo del médico.\
- `especialidad`: String -- Área específica de la oftalmología en la que
  se especializa.\
- `pacientesAtendidos`: int -- Número de pacientes atendidos en la
  jornada.

**Métodos identificados:** - `mostrarDatos()`: Muestra la información
del doctor en consola.\
- `atenderPaciente()`: Incrementa el número de pacientes atendidos.\
- `esActivo()`: Indica si el doctor aún puede atender más pacientes en
  la jornada.

------------------------------------------------------------------------

## 3. Relación entre Objetos

**Tipo de relación:** Asociación

**Descripción:**\
Un **Doctor** puede atender a varios **Pacientes**, mientras que cada
**Paciente** es atendido por un solo **Doctor** en una cita específica.\
Esta relación refleja el flujo natural de atención en la clínica: los
pacientes se registran, se les asigna un doctor y este realiza el
diagnóstico o tratamiento correspondiente.

**Ejemplo:**\
\> "Un Doctor atiende múltiples Pacientes durante el día.\
\> Cada Paciente tiene una cita programada con un único Doctor."

------------------------------------------------------------------------

## 4. Justificación del Diseño

**¿Por qué elegí estos objetos?**\
Porque representan las entidades centrales del proceso de atención
médica en la clínica: el **Paciente** como receptor del servicio y el
**Doctor** como prestador del mismo.

**¿Por qué estos atributos son importantes?**\
- Permiten identificar a cada persona en el sistema.\
- Guardan información clave para cálculos (como edad o pacientes
  atendidos).\
- Registran estados importantes, como la disponibilidad del doctor o si
  la cita sigue activa.

**¿Por qué estos métodos son necesarios?**\
- Simulan las acciones reales del dominio: mostrar datos, atender
  pacientes, calcular costos y actualizar estados.\
- Permiten mantener una lógica clara y orientada a la realidad del
  negocio.

------------------------------------------------------------------------

## 5. Comparación: POO vs Programación Estructurada

**Sin POO (Estructurado):**\
El sistema se resolvería con múltiples variables y funciones globales
(por ejemplo, `nombrePaciente`, `edadPaciente`, `costoConsulta()`,
etc.).\
Esto haría el código más desorganizado y difícil de mantener,
especialmente si hay muchos pacientes o doctores.

**Con POO:**\
Se agrupan datos y comportamientos dentro de clases. Cada paciente o
doctor se convierte en un objeto con identidad y comportamiento propio.\
El código es más modular, reutilizable y fácil de expandir (por ejemplo,
se puede agregar una clase `Cita` o `Enfermero` sin alterar las demás).

**Ventajas específicas en mi dominio:** 1. Permite representar
fácilmente el proceso de atención médica mediante objetos reales
(Doctor, Paciente).\
2. Facilita la expansión del sistema para agregar más entidades
   (Enfermero, Historia Clínica, Factura, etc.).\
3. Mejora la claridad del código al reflejar las relaciones reales del
   entorno médico.

------------------------------------------------------------------------

## 6. Diagrama de Clases (Opcional)

    +-------------------+           +-------------------+
    |     Doctor        |           |     Paciente      |
    +-------------------+           +-------------------+
    | - idDoctor        |           | - idPaciente      |
    | - nombre          |           | - nombreCompleto  |
    | - especialidad    |           | - edad            |
    | - pacientesAtendidos|         | - diagnostico     |
    |                   |           | - citaActiva      |
    +-------------------+           +-------------------+
    | +mostrarDatos()   |<--------->| +mostrarInformacion() |
    | +atenderPaciente()|           | +calcularCostoConsulta()|
    | +esActivo()       |           | +setCitaActiva()  |
    +-------------------+           +-------------------+

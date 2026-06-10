# Modelo Relacional del Sistema

Este documento describe las relaciones entre las entidades principales del sistema: **Usuario, Reserva, Actividad e Incidencia**.

---

## Entidades del sistema

Las entidades principales son:

- Usuario
- Reserva
- Actividad
- Incidencia

---

## Relaciones entre entidades

### Usuario → Reserva

Un **usuario** puede realizar **N reservas**.

Cada **reserva** pertenece a un único usuario.

-> Relación: **1 a N (uno a muchos)**

---

### Actividad → Reserva

Una **actividad** puede estar asociada a **N reservas**.

Cada **reserva** pertenece a una única actividad.

-> Relación: **1 a N (uno a muchos)**

---

### Usuario → Incidencia

Un **usuario** puede registrar **N incidencias**.

Cada **incidencia** es creada por un único usuario.

-> Relación: **1 a N (uno a muchos)**

---

### Actividad → Incidencia

Una **actividad** puede tener **N incidencias**.

Cada **incidencia** pertenece a una única actividad.

-> Relación: **1 a N (uno a muchos)**

---

## Diagrama del modelo

![Diagrama del modelo](/database/img/diagrama.png)
DROP DATABASE IF EXISTS person;

CREATE DATABASE IF NOT EXISTS person;

use person;

CREATE TABLE IF NOT EXISTS persona(
	id_persona int NOT NULL auto_increment,
    nombres varchar(30),
    apellidos varchar(30),
    tipo_documento varchar(30),
    cedula varchar(30),
    fecha_nacimiento varchar(30),
    direccion varchar(30),
    celular varchar(30),
    primary key (id_persona)
);
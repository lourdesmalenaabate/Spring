-- BORRAR BASE DE DATOS 
drop database if exists CursoSpring;

-- CREACION DE LA BASE DE DATOS
create database if not exists CursoSpring;

-- USO DE LA BASE DE DATOS 
use CursoSpring;

-- CREACION DE LA TABLA USUARIOS
create table if not exists usuarios(
	correo varchar(100) not null primary key,
	clave blob not null,
	fechaActualizacion datetime
);


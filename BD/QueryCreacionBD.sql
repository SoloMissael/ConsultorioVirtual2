CREATE DATABASE dbconsultorio;
USE dbconsultorio;


CREATE TABLE usuarios(
	id_usuario int,
    tipo_usuario VARCHAR(100),
    nombre VARCHAR(100),
    segundo_nombre VARCHAR(100),
    apellido_paterno VARCHAR(100),
    apellido_materno VARCHAR(100),
    contraseña VARCHAR(100)
);

select * from usuarios;

delete FROM usuarios;

SET SQL_SAFE_UPDATES = 0;
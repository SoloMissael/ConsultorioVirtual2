CREATE DATABASE DBCONSULTORIO;


USE DBCONSULTORIO;

CREATE TABLE Usuarios(
	id_usuario int not null primary key, 
	tipo_usuario varchar(15),
	nombre varchar(25),
	segundo_nombre varchar(25),
	apellido_paterno varchar(25),
	apellido_materno varchar(25),
	contraseña varchar(25)	
)

insert into Usuarios values
('Doctor','Jose','Carlos','Valencia','Valenzuela','1234')

select * from Usuarios
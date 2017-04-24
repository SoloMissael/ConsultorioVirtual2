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

CREATE TABLE citas(
	fecha date,
    hora varchar(5),
    paciente varchar(100),
    doctor varchar(100),
    estado bool
);

insert into citas 
values ('2017-4-04','10:30','Rodrigo Gomez','Eduardo Velazco',0),
	   ('2017-4-04','13:30','Natalia Perez','Eduardo Velazco',1),
	   ('2017-4-04','14:30','Alejandra Ramirez','Eduardo Velazco',1),
	   ('2017-4-04','15:00','Diego Mayorquin','Eduardo Velazco',1),
	   ('2017-4-04','15:30','Axel Aguirre','Eduardo Velazco',1),
	   ('2017-4-04','16:00','Elizabeth Flores','Eduardo Velazco',1),
	   ('2017-4-04','16:30','Margarita Garcia','Eduardo Velazco',0);

insert into citas 
values ('2017-4-05','10:30','Rodrigo Gomez','Eduardo Velazco',1),
	   ('2017-4-05','13:30','Natalia Perez','Eduardo Velazco',1),
	   ('2017-4-05','14:30','Alejandra Ramirez','Eduardo Velazco',1),
	   ('2017-4-05','15:00','Diego Mayorquin','Eduardo Velazco',1),
	   ('2017-4-05','15:30','Axel Aguirre','Eduardo Velazco',1),
	   ('2017-4-05','16:00','Elizabeth Flores','Eduardo Velazco',1),
	   ('2017-4-05','16:30','Margarita Garcia','Eduardo Velazco',1);
       
insert into citas 
values ('2017-4-09','19:30','Rodrigo Gomez','Eduardo Velazco',1),
	   ('2017-4-09','10:30','Natalia Perez','Eduardo Velazco',1),
	   ('2017-4-09','13:30','Alejandra Ramirez','Eduardo Velazco',1),
	   ('2017-4-09','16:00','Diego Mayorquin','Eduardo Velazco',1),
	   ('2017-4-09','15:30','Axel Aguirre','Eduardo Velazco',1),
	   ('2017-4-09','14:00','Elizabeth Flores','Eduardo Velazco',1),
	   ('2017-4-09','11:30','Margarita Garcia','Eduardo Velazco',1);


/*aaaa-mm-dd*/
select * from usuarios;

select hora, paciente, fecha, doctor from citas
WHERE fecha= '2017-04-09' and estado = 1
ORDER BY hora;


delete from citas;
delete FROM usuarios;

drop table citas;
SET SQL_SAFE_UPDATES = 0;

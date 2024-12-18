drop database new_schema2;
create database new_schema2;
use new_schema2;


create table Estudiante(
EAN int primary key,
marca varchar(50) not null,
nombre varchar(50) not null,
precio double not null
);

create table Modulo(
ID_Pedido int auto_increment primary key,
fecha_de_pedido datetime not null,
importe_total int not null
);

create table Estudiante_Modulo (
ID_Estudiante_Modulo int a
);
 
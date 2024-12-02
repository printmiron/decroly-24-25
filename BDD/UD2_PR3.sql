drop database actividad3;
create database actividad3;
use actividad3;

create table Robot_De_AL (
id_robot_almacenamiento int auto_increment primary key,
estado boolean,
ubicacion varchar(50) not null,
capacidad_de_carga int,
eficiencia varchar(50),
energetica int
); 

create table Robot_AL_Estanteria (
id_robot_al_estanteria int auto_increment primary key,
fecha_de_opracion time not null,
duarcion_de_la_operacion time not null,
id_robot_almacenamiento int,
id_estanteria int,
foreign key (id_robot_almacenamiento) references Robot_De_AL(id_robot_almacenamiento),
foreign key (id_estanteria) references Estanteria(id_estanteria)
);

create table Estanderia(
id_estanteria int auto_increment primary key,
ubicacion varchar(50) not null,
capacidad_de_almacenamiento int,
nivel_de_uso int,
condicion varchar(50)
);

create table Estanteria_Producto (
id_estanteria_producto int auto_increment primary key,
cantidad_almacenada int not null,
id_producto int,
id_estanteria int,
foreign key (id_producto) references Producto(id_rproducto),
foreign key (id_estanteria) references Estanteria(id_estanteria)
);

create table Producto(
id_producto int auto_increment primary key,
Nombre varchar(50) not null,
dimensiones int,
cantidad_en_inverntario int,
peso int
);

create table Producto_Pedido (
id_producto_pedido int auto_increment primary key,
cantidad_pedida int not null,
id_producto int,
id_pedido int,
foreign key (id_producto) references Producto(id_rproducto),
foreign key (id_pedido) references Pedido(id_pedido)
);

create table Pedido(
id_pedido int auto_increment primary key,
fecha_de_pedido time not null,
estado_de_pedido varchar(50),
cliente varchar(50),
fecha_de_entrega time,
estimada varchar(50)
);
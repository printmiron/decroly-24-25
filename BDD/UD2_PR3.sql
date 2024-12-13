drop database actividad3;
create database actividad3;
use actividad3;



create table Robot_de_AL (
id_robot_almacenamiento int auto_increment primary key,
estado boolean,
ubicacion int not null,
capacidad_de_carga int,
eficiencia varchar(50),
energetica int
); 

create table Estanteria(
id_estanteria int auto_increment primary key,
ubicacion int not null,
capacidad_de_almacenamiento int,
nivel_de_uso int,
condicion varchar(50)
);

create table Producto(
id_producto int auto_increment primary key,
Nombre varchar(50) not null,
dimensiones int,
cantidad_en_inverntario int,
peso int
);

create table Pedido(
id_pedido int auto_increment primary key,
fecha_de_pedido time not null,
estado_de_pedido boolean,
cliente varchar(50),
fecha_de_entrega time,
estimada varchar(50)
);

create table Drone(
id_drone int auto_increment primary key,
estado boolean,
ubicacion int,
autonomia int,
capacidad_de_carga int
);

create table Robot_de_empaque (
id_robot_de_empaque int auto_increment primary key,
estado boolean,
ubicacion int,
capacidad_de_empaque int,
energetica int
);

create table Modulo_de_enegia (
id_modulo int auto_increment primary key,
capacidad int,
energetica int,
estado boolean,
ubicacion int
);

create table Personal_humano(
id_personal int auto_increment primary key,
DNI_NIE varchar(9),
nombre varchar(40),
apellido varchar(40),
rol varchar(50),
turno boolean,
especialidad varchar(50)
);

create table Robot_AL_Estanteria (
id_robot_al_estanteria int auto_increment primary key,
fecha_de_opracion time not null,
duarcion_de_la_operacion time not null,
id_robot_almacenamiento int,
id_estanteria int,
foreign key (id_robot_almacenamiento) references Robot_de_AL(id_robot_almacenamiento),
foreign key (id_estanteria) references Estanteria(id_estanteria)
);

create table Estanteria_Producto (
id_estanteria_producto int auto_increment primary key,
cantidad_almacenada int not null,
id_producto int,
id_estanteria int,
foreign key (id_producto) references Producto(id_producto),
foreign key (id_estanteria) references Estanteria(id_estanteria)
);

create table Producto_Pedido (
id_producto_pedido int auto_increment primary key,
cantidad_pedida int not null,
id_producto int,
id_pedido int,
foreign key (id_producto) references Producto(id_producto),
foreign key (id_pedido) references Pedido(id_pedido)
);

create table Pedido_Drone_Entrega(
id_pedido_drone int auto_increment primary key,
fecha_de_entrega time not null,
duracion_de_entrega time not null,
id_pedido int,
id_drone int,
foreign key (id_pedido) references Pedido(id_pedido),
foreign key (id_drone) references Drone(id_drone)
);

create table Robot_de_empaque_Pedido(
id_robot_de_empaque_pedido int auto_increment primary key,
fecha_de_empaque time not null,
tiempo_de_proceso time not null,
id_robot_de_empaque int,
id_pedido int,
foreign key (id_robot_de_empaque) references Robot_de_empaque(id_robot_de_empaque),
foreign key (id_pedido) references Pedido(id_pedido)
);

create table Modulo_de_enegia_Robot_AL_Empaque_Drone(
id_modulo_robot_AL_EM_DR int auto_increment primary key,
fecha_recarga time not null,
duracion_recarga time not null,
id_modulo int,
id_robot_almacenamiento int,
id_robot_de_empaque int,
id_drone int,
foreign key (id_modulo) references Modulo_de_enegia(id_modulo),
foreign key (id_robot_almacenamiento) references Robot_de_AL(id_robot_almacenamiento),
foreign key (id_robot_de_empaque) references Robot_de_empaque(id_robot_de_empaque),
foreign key (id_drone) references Drone(id_drone)
);

create table Personal_humano_Robot_AL_Empaque_Drone(
id_modulo_robot_AL_EM_DR int auto_increment primary key,
fecha_mantenimiento time not null,
descripcion_de_la_tarea varchar(100),
id_personal int,
id_robot_almacenamiento int,
id_robot_de_empaque int,
id_drone int,
foreign key (id_personal) references Personal_humano(id_personal),
foreign key (id_robot_almacenamiento) references Robot_de_AL(id_robot_almacenamiento              ),
foreign key (id_robot_de_empaque) references Robot_de_empaque(id_robot_de_empaque),
foreign key (id_drone) references Drone(id_drone)
);
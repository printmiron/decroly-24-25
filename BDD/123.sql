drop database new_schema3;
create database new_schema3;
use new_schema3;

create table Cliente (
id_cliente int primary key,
nombre varchar(50) not null,
direccion varchar(50) not null,
cuenta_bancaria varchar(50)
);

create table Pedido  (
id_pedido int auto_increment primary key,
fecha_de_pedido datetime not null,
importe_total decimal(10,2) not null,
cuenta_bancaria varchar(50),
id_cliente int,
id_producto int,
foreign key (id_cliente) references Cliente(id_cliente),
foreign key (id_producto) references Producto(id_producto)
);

create table Producto  (
id_producto int auto_increment primary key,
marca varchar(50) not null,
nombre varchar(50) not null,
importe_total decimal(10,2) not null
);

drop database if exists hotelio;

create database hotelio;

use hotelio;

create table poblacion (
	id int auto_increment,
    nombre varchar(255),
    cp varchar(255),
    primary key (id)
);

create table hotel (
	id int auto_increment,
    nombre varchar(255),
    categoria int,
    poblacion_id int,
    latitud double,
    longitud double,
    primary key (id),
    foreign key (poblacion_id) references poblacion (id)    
);

create table habitacion (
    numero varchar(255),
    libre boolean,
    precio_noche double,
    num_personas int,
    planta int,
    hotel_id int,
    primary key (numero,hotel_id),
    foreign key (hotel_id) references hotel (id)
    
);

create table usuario (
	id int auto_increment,
    email varchar(255),
    nombre_usuario varchar(255) unique,
    dni_nif_nie varchar(50),
    nombre varchar(255),
    apellidos varchar(255),
    telefono varchar(255),
    fecha_nacimiento date,
    genero char,
    primary key (id)
);

create table reserva (
	id int auto_increment,
    fecha_entrada date,
    fecha_salida date,
    hotel_id int,
    habitacion_id int,
    usuario_id int,
    primary key (id),
    foreign key (hotel_id) references habitacion (hotel_id),
    foreign key (habitacion_id) references habitacion (numero),
    foreign key (usuario_id) references usuario (id)
);






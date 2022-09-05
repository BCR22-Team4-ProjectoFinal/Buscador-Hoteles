use heroku_754c7a01d89d1b0;

#drop table if exists reservas;
#drop table if exists usuarios;
#drop table if exists habitaciones;
#drop table if exists hoteles;
#drop table if exists poblaciones;

create table poblaciones (
	id int auto_increment,
    nombre varchar(255),
    cp varchar(255),
    primary key (id)
);

create table hoteles (
	id int auto_increment,
    nombre varchar(255),
    categoria int,
    poblacion_id int,
    latitud double,
    longitud double,
    primary key (id),
    foreign key (poblacion_id) references poblaciones (id) 
    on delete cascade on update cascade
);

create table habitaciones (
	id int auto_increment,
    num_habitacion varchar(255),
    libre boolean,
    precio_noche double,
    num_personas int,
    planta int,
    hotel_id int,
    primary key (id),
    foreign key (hotel_id) references hoteles (id)
    on delete cascade on update cascade
);

create table usuarios (
	id int auto_increment,
    email varchar(255),
    nombre_usuario varchar(255) unique,
    dni_nif_nie varchar(50),
    nombre varchar(255),
    apellidos varchar(255),
    telefono varchar(255),
    fecha_nacimiento date,
    genero char,
    contrasena varchar(255),
    rol int,
    primary key (id)
);

create table reservas (
	id int auto_increment,
    fecha_entrada date,
    fecha_salida date,
    fecha_reserva date,
    num_adultos int,
    num_ninos int,
    habitacion_id int,
    usuario_id int,
    primary key (id),
    foreign key (habitacion_id) references habitaciones (id)
    on delete cascade on update cascade,
    foreign key (usuario_id) references usuarios (id)
    on delete cascade on update cascade
);

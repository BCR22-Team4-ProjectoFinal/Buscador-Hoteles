insert into poblaciones (nombre, cp) values ("Amposta, Tarragona, Catalunya, ESP", "43870");
insert into poblaciones (nombre, cp) values ("Tortosa, Tarragona, Catalunya, ESP", "43500");
insert into poblaciones (nombre, cp) values ("Madrid, Madrid, Comunidad de Madrid, ESP", "28014");
insert into poblaciones (nombre, cp) values ("Barcelona, Barcelona, Cataluña, ESP", "08002");
insert into poblaciones (nombre, cp) values ("Lérida, Lérida, Cataluña, ESP", "25007");

insert into hoteles (nombre, categoria, poblacion_id, latitud, longitud) values ("Miami", 4, 1, 0.001, 0.002);
insert into hoteles (nombre, categoria, poblacion_id, latitud, longitud) values ("Varadero", 4, 11, 0.011, 0.002);
insert into hoteles (nombre, categoria, poblacion_id, latitud, longitud) values ("Hotel Sagrada Familia", 4, 21, 41.406011997141135, 2.1714746821687227);
insert into hoteles (nombre, categoria, poblacion_id, latitud, longitud) values ("Hotel Nuevo Madrid", 4, 31, 40.46972, -3.66903);
insert into hoteles (nombre, categoria, poblacion_id, latitud, longitud) values ("Nastasi Hotel & Spa", 4, 41, 41.630785916521596, 0.5970251840229278);

insert into habitaciones (num_habitacion, libre, precio_noche, num_personas, planta, hotel_id) values (101, true, 50, 2, 1, 11);
insert into habitaciones (num_habitacion, libre, precio_noche, num_personas, planta, hotel_id) values (122, true, 68, 2, 1, 21);
insert into habitaciones (num_habitacion, libre, precio_noche, num_personas, planta, hotel_id) values (319, true, 79, 2, 3, 31);
insert into habitaciones (num_habitacion, libre, precio_noche, num_personas, planta, hotel_id) values (187, true, 123, 2, 1, 41);
insert into habitaciones (num_habitacion, libre, precio_noche, num_personas, planta, hotel_id) values (133, true, 49, 2, 1, 51);

insert into usuarios (email, nombre_usuario, dni_nif_nie, nombre, apellidos, telefono, genero, contrasena) values ("johndoe@gmail.com", "johndoe", "11111111A", "John", "Doe", "+34600000000", 'm', '1111');
insert into usuarios (email, nombre_usuario, dni_nif_nie, nombre, apellidos, telefono, genero, contrasena, rol) values ("janedoe@gmail.com", "janedoe", "22222222B", "Jane", "Doe", "+34600000011", 'f', '2222', 2);
insert into usuarios (email, nombre_usuario, dni_nif_nie, nombre, apellidos, telefono, genero, contrasena, rol) values ("scott34@gmail.com", "scott34", "33333333C", "James", "Scott", "+34600000066", 'm', '3333', 2);
insert into usuarios (email, nombre_usuario, dni_nif_nie, nombre, apellidos, telefono, genero, contrasena, rol) values ("dynos49@gmail.com", "dynos49", "44444444D", "Diana", "Würth", "+34600000077", 'f', '4444', 2);
insert into usuarios (email, nombre_usuario, dni_nif_nie, nombre, apellidos, telefono, genero, contrasena, rol) values ("factors@gmail.com", "factors", "55555555E", "Frank", "Kadosh", "+34600000088", 'm', '5555', 2);

insert into reservas (fecha_entrada, fecha_salida, fecha_reserva, num_adultos, num_ninos, habitacion_id, usuario_id) values ('2021/12/17','2021/12/20',101,11, '2021/12/08', 1, 1);
insert into reservas (fecha_entrada, fecha_salida, fecha_reserva, num_adultos, num_ninos, habitacion_id, usuario_id) values ('2021/10/29','2021/11/01',122,12, '2021/10/19', 11, 11);
insert into reservas (fecha_entrada, fecha_salida, fecha_reserva, num_adultos, num_ninos, habitacion_id, usuario_id) values ('2021/11/17','2021/12/20',319,13, '2021/11/15', 21, 21);
insert into reservas (fecha_entrada, fecha_salida, fecha_reserva, num_adultos, num_ninos, habitacion_id, usuario_id) values ('2021/09/29','2021/10/01',187,14, '2021/09/18', 31, 31);
insert into reservas (fecha_entrada, fecha_salida, fecha_reserva, num_adultos, num_ninos, habitacion_id, usuario_id) values ('2021/01/31','2021/02/20',133,15, '2021/01/10', 41, 41);

select * from reservas;


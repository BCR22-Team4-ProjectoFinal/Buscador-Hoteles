insert into poblacion (nombre, cp) values ("Amposta, Tarragona, Catalunya, ESP", "43870");
insert into poblacion (nombre, cp) values ("Tortosa, Tarragona, Catalunya, ESP", "43500");
insert into poblacion (nombre, cp) values ("Madrid, Madrid, Comunidad de Madrid, ESP", "28014");
insert into poblacion (nombre, cp) values ("Barcelona, Barcelona, Cataluña, ESP", "08002");
insert into poblacion (nombre, cp) values ("Lérida, Lérida, Cataluña, ESP", "25007");

insert into hotel (nombre, categoria, latitud, longitud, poblacion_id) values ("Miami", 4, 0.001, 0.002, 1);
insert into hotel (nombre, categoria, latitud, longitud, poblacion_id) values ("Varadero", 4, 0.011, 0.002, 11);
insert into hotel (nombre, categoria, latitud, longitud, poblacion_id) values ("Hotel Sagrada Familia", 4, 41.406011997141135, 2.1714746821687227, 12);
insert into hotel (nombre, categoria, latitud, longitud, poblacion_id) values ("Hotel Nuevo Madrid", 4, 40.46972, -3.66903, 13);
insert into hotel (nombre, categoria, latitud, longitud, poblacion_id) values ("Varadero", 4, 0.011, 0.002, 11);


insert into habitacion (numero, libre, precio_noche, num_personas, planta, hotel_id) values (101, true, 50, 2, 1, 11);
insert into habitacion (numero, libre, precio_noche, num_personas, planta, hotel_id) values (122, true, 68, 2, 1, 12);
insert into habitacion (numero, libre, precio_noche, num_personas, planta, hotel_id) values (319, true, 79, 2, 3, 13);
insert into habitacion (numero, libre, precio_noche, num_personas, planta, hotel_id) values (187, true, 123, 2, 1, 14);
insert into habitacion (numero, libre, precio_noche, num_personas, planta, hotel_id) values (133, true, 49, 2, 1, 15);

insert into usuario (email, nombre_usuario, dni_nif_nie, nombre, apellidos, telefono, genero) values ("johndoe@gmail.com", "johndoe", "11111111A", "John", "Doe", "+34600000000", 'm');
insert into usuario (email, nombre_usuario, dni_nif_nie, nombre, apellidos, telefono, genero) values ("janedoe@gmail.com", "janedoe", "22222222B", "Jane", "Doe", "+34600000011", 'f');
insert into usuario (email, nombre_usuario, dni_nif_nie, nombre, apellidos, telefono, genero) values ("scott34@gmail.com", "scott34", "33333333C", "James", "Scott", "+34600000066", 'm');
insert into usuario (email, nombre_usuario, dni_nif_nie, nombre, apellidos, telefono, genero) values ("dynos49@gmail.com", "dynos49", "44444444D", "Diana", "Würth", "+34600000077", 'f');
insert into usuario (email, nombre_usuario, dni_nif_nie, nombre, apellidos, telefono, genero) values ("factors@gmail.com", "factors", "55555555E", "Frank", "Kadosh", "+34600000088", 'm');

insert into reserva (fecha_entrada,fecha_salida,hotel_id,habitacion_id,usuario_id) values ('2021/12/17','2021/12/20',10,101,11);
insert into reserva (fecha_entrada,fecha_salida,hotel_id,habitacion_id,usuario_id) values ('2021/10/29','2021/11/01',20,122,12);
insert into reserva (fecha_entrada,fecha_salida,hotel_id,habitacion_id,usuario_id) values ('2021/11/17','2021/12/20',30,319,13);
insert into reserva (fecha_entrada,fecha_salida,hotel_id,habitacion_id,usuario_id) values ('2021/09/29','2021/10/01',40,187,14);
insert into reserva (fecha_entrada,fecha_salida,hotel_id,habitacion_id,usuario_id) values ('2021/01/31','2021/02/20',50,133,15);

select * from reserva;


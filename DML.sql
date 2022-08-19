insert into poblacion (nombre, cp) values ("Amposta", "43500");
insert into poblacion (nombre, cp) values ("Tortosa", "50000");

insert into hotel (nombre, categoria, latitud, longitud, poblacion_id) values ("Miami", 4, 0.001, 0.002, 1);
insert into hotel (nombre, categoria, latitud, longitud, poblacion_id) values ("Varadero", 4, 0.011, 0.002, 11);

insert into habitacion (numero, libre, precio_noche, num_personas, planta, hotel_id) values (101, true, 50, 2, 1, 1);
insert into habitacion (numero, libre, precio_noche, num_personas, planta, hotel_id) values (101, true, 50, 2, 1, 11);

insert into usuario (email, nombre_usuario, dni_nif_nie, nombre, apellidos, telefono, genero) values ("johndoe@gmail.com", "johndoe", "00000000A", "John", "Doe", "+34600000000", 'm');
insert into usuario (email, nombre_usuario, dni_nif_nie, nombre, apellidos, telefono, genero) values ("janedoe@gmail.com", "janedoe", "00000000B", "Jane", "Doe", "+34600000001", 'f');

insert into reserva (fecha_entrada,fecha_salida,hotel_id,habitacion_id,usuario_id) values
('2015/12/17','2015/12/20',1,101,1),
('2020/10/29','2020/11/01',11,101,11);

select * from reserva;

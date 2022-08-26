package com.example.api_rest.service;

import java.util.List;

import com.example.api_rest.dto.Habitacion;

public interface IHabitacionService {
	public Habitacion guardarHabitacion(Habitacion habitacion);
	
	public List<Habitacion> listarHabitacion();
	
	public Habitacion habitacionPorId(Long id);	
	
	public Habitacion actualizarHabitacion(Habitacion habitacion);	
	
	public void eliminarHabitacion(Long id);
}

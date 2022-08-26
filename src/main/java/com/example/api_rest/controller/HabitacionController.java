package com.example.api_rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_rest.dto.Habitacion;
import com.example.api_rest.service.HabitacionServiceImpl;

@RestController
@RequestMapping("/api")
public class HabitacionController {

	@Autowired
	HabitacionServiceImpl habitacionServiceImpl;

	@PostMapping("/habitaciones")
	public Habitacion guardarHabitacion(@RequestBody Habitacion habitacion) {
		return habitacionServiceImpl.guardarHabitacion(habitacion);
	}

	@GetMapping("/habitaciones")
	public List<Habitacion> listarHabitacion() {
		return habitacionServiceImpl.listarHabitacion();
	}

	@GetMapping("/habitaciones/{id}")
	public Habitacion habitacionPorId(@PathVariable(name="id") Long id) {
		Habitacion habitacionPorId = new Habitacion();
		habitacionPorId = habitacionServiceImpl.habitacionPorId(id);
		
		return habitacionPorId;
	}	

	@PutMapping("/habitaciones/{id}")
	public Habitacion actualizarHabitacion(@PathVariable(name="id") Long id, @RequestBody Habitacion habitacion) {
		Habitacion habitacionSeleccionado = new Habitacion();
		Habitacion habitacionActualizado = new Habitacion();

		habitacionSeleccionado = habitacionServiceImpl.habitacionPorId(id);

		habitacionSeleccionado.setNum_habitacion(habitacion.getNum_habitacion());
		habitacionSeleccionado.setLibre(habitacion.isLibre());
		habitacionSeleccionado.setPrecio_noche(habitacion.getPrecio_noche());
		habitacionSeleccionado.setNum_personas(habitacion.getNum_personas());
		habitacionSeleccionado.setPlanta(habitacion.getPlanta());
		habitacionSeleccionado.setHotel(habitacion.getHotel());

		habitacionActualizado = habitacionServiceImpl.actualizarHabitacion(habitacionSeleccionado);

		return habitacionActualizado;
	}

	@DeleteMapping("/habitaciones/{id}")
	public void borrarHabitacion(@PathVariable(name="id") Long id) {
		habitacionServiceImpl.eliminarHabitacion(id);
	}

}


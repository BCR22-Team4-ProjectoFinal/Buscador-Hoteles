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

import com.example.api_rest.dto.Reserva;
import com.example.api_rest.service.ReservaServiceImpl;

@RestController
@RequestMapping("/api")
public class ReservaController {

	@Autowired
	ReservaServiceImpl reservaServiceImpl;

	@PostMapping("/reservas")
	public Reserva guardarReserva(@RequestBody Reserva reserva) {
		return reservaServiceImpl.guardarReserva(reserva);
	}

	@GetMapping("/reservas")
	public List<Reserva> listarReserva() {
		return reservaServiceImpl.listarReserva();
	}

	@GetMapping("/reservas/{id}")
	public Reserva reservaPorId(@PathVariable(name="id") Long id) {
		Reserva reservaPorId = new Reserva();
		reservaPorId = reservaServiceImpl.reservaPorId(id);
		
		return reservaPorId;
	}	

	@PutMapping("/reservas/{id}")
	public Reserva actualizarReserva(@PathVariable(name="id") Long id, @RequestBody Reserva reserva) {
		Reserva reservaSeleccionado = new Reserva();
		Reserva reservaActualizado = new Reserva();

		reservaSeleccionado = reservaServiceImpl.reservaPorId(id);

		reservaSeleccionado.setFecha_entrada(reserva.getFecha_entrada());
		reservaSeleccionado.setFecha_salida(reserva.getFecha_salida());
		reservaSeleccionado.setFecha_reserva(reserva.getFecha_reserva());
		reservaSeleccionado.setNum_adultos(reserva.getNum_adultos());
		reservaSeleccionado.setNum_ninos(reserva.getNum_ninos());
		reservaSeleccionado.setHabitacion(reserva.getHabitacion());
		reservaSeleccionado.setUsuario(reserva.getUsuario());
		

		reservaActualizado = reservaServiceImpl.actualizarReserva(reservaSeleccionado);

		return reservaActualizado;
	}

	@DeleteMapping("/reservas/{id}")
	public void borrarReserva(@PathVariable(name="id") Long id) {
		reservaServiceImpl.eliminarReserva(id);
	}

}


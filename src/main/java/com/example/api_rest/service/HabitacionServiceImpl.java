package com.example.api_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api_rest.dao.IHabitacionDAO;
import com.example.api_rest.dto.Habitacion;

@Service
public class HabitacionServiceImpl implements IHabitacionService {

	@Autowired
	IHabitacionDAO iHabitacionDAO;
	
	@Override
	public Habitacion guardarHabitacion(Habitacion habitacion) {
		return iHabitacionDAO.save(habitacion);
	}

	@Override
	public List<Habitacion> listarHabitacion() {
		return iHabitacionDAO.findAll();
	}

	@Override
	public Habitacion habitacionPorId(Long id) {
		return iHabitacionDAO.findById(id).get();
	}

	@Override
	public Habitacion actualizarHabitacion(Habitacion habitacion) {
		return iHabitacionDAO.save(habitacion);
	}

	@Override
	public void eliminarHabitacion(Long id) {
		iHabitacionDAO.deleteById(id);
		
	}

}

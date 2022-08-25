package com.example.api_rest.service;

import java.util.List;

import com.example.api_rest.dto.Poblacion;

public interface IPoblacionService {

	public List<Poblacion> listarPoblaciones();
	
	public Poblacion guardarPoblacion(Poblacion poblacion);
	
	public Poblacion poblacionXId(Long id);
	
	public void eliminarPoblacion(Long id);
}

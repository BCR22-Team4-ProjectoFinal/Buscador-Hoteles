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

import com.example.api_rest.dto.Poblacion;
import com.example.api_rest.service.PoblacionServiceImpl;

@RestController
@RequestMapping("/api")
public class PoblacionController {

	@Autowired
	PoblacionServiceImpl poblacionServiceImpl;
	
	@GetMapping("/poblaciones")
	public List<Poblacion> listarPoblaciones(){
		return poblacionServiceImpl.listarPoblaciones();
	}
	
	@GetMapping("/poblaciones/{id}")
	public Poblacion poblacionXId(@PathVariable(name="id")Long id) {
		return poblacionServiceImpl.poblacionXId(id);
	}
	
	@PostMapping("/poblaciones")
	public Poblacion guardarPoblacion(@RequestBody Poblacion poblacion) {
		return poblacionServiceImpl.guardarPoblacion(poblacion);
	}
	
	@PutMapping("/poblaciones/{id}")
	public Poblacion actualizarPoblacion(@PathVariable(name="id")Long id, @RequestBody Poblacion poblacion) {
		Poblacion poblacionActualizado = poblacionServiceImpl.poblacionXId(id);
		poblacionActualizado.setNombre(poblacion.getNombre());
		poblacionActualizado.setCp(poblacion.getCp());
		
		return poblacionServiceImpl.guardarPoblacion(poblacionActualizado);
	}
	
	@DeleteMapping("/poblaciones/{id}")
	public void eliminarPoblacion(@PathVariable(name="id")Long id) {
		poblacionServiceImpl.eliminarPoblacion(id);
	}
}

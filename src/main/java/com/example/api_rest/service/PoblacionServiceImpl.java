package com.example.api_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api_rest.dao.IPoblacionDAO;
import com.example.api_rest.dto.Poblacion;

@Service
public class PoblacionServiceImpl implements IPoblacionService{

	@Autowired
	IPoblacionDAO iPoblacionDAO;
	
	@Override
	public List<Poblacion> listarPoblaciones() {
		// TODO Auto-generated method stub
		return iPoblacionDAO.findAll();
	}

	@Override
	public Poblacion guardarPoblacion(Poblacion poblacion) {
		// TODO Auto-generated method stub
		return iPoblacionDAO.save(poblacion);
	}

	@Override
	public Poblacion poblacionXId(Long id) {
		// TODO Auto-generated method stub
		return iPoblacionDAO.findById(id).get();
	}

	@Override
	public void eliminarPoblacion(Long id) {
		// TODO Auto-generated method stub
		iPoblacionDAO.deleteById(id);
	}

}

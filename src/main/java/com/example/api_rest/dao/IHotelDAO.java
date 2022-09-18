package com.example.api_rest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api_rest.dto.Hotel;

public interface IHotelDAO extends JpaRepository<Hotel, Long>{
	
	public List<Hotel> findByCategoria(String categoria);
}

package com.example.api_rest.service;

import java.util.List;

import com.example.api_rest.dto.Hotel;

public interface IHotelService {
	//CRUD methods
	public List<Hotel> listarHoteles();	
	public Hotel guardarHotel(Hotel hotel);	
	public Hotel hotelXID(Long id);
	public void eliminarHotel(Long id);
}

package com.example.api_rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_rest.dto.Hotel;
import com.example.api_rest.service.HotelServiceImpl;

@RestController
@RequestMapping("/api")
public class HotelController {
	
	@Autowired
	HotelServiceImpl hotelServiceImpl;
	
	@GetMapping("/hoteles")
	public List<Hotel> listarHoteles(){
		
		return hotelServiceImpl.listarHoteles();
	}
	
	@PostMapping("/hoteles")
	public Hotel guardarHotel(@RequestBody Hotel hotel) {
		
		return hotelServiceImpl.guardarHotel(hotel);	
	}
	
	@GetMapping("/hoteles/{id}")
	public Hotel hotelXID(@PathVariable(name="id") Long id) {
		Hotel hotelXID = new Hotel();
		hotelXID = hotelServiceImpl.hotelXID(id);
		
		return hotelXID;
	}
	
	@DeleteMapping("/hoteles/{id}")
	public void eliminarHotel(@PathVariable(name="id") Long id) {
		hotelServiceImpl.eliminarHotel(id);
	}
	
	@GetMapping("/hoteles/categoria/{categoria}")
	public List<Hotel> buscarCategoria (@PathVariable(name="categoria")String categoria){
		return hotelServiceImpl.buscarCategoria(categoria);
	}
	
}

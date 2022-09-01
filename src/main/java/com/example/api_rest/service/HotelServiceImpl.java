package com.example.api_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api_rest.dao.IHotelDAO;
import com.example.api_rest.dto.Hotel;

@Service
public class HotelServiceImpl implements IHotelService{
	
	@Autowired
	IHotelDAO iHotelDAO;

	@Override
	public List<Hotel> listarHoteles() {
		// TODO Auto-generated method stub
		return iHotelDAO.findAll();
	}

	@Override
	public Hotel guardarHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return iHotelDAO.save(hotel);
	}

	@Override
	public Hotel hotelXID(Long id) {
		// TODO Auto-generated method stub
		return iHotelDAO.findById(id).get();
	}

	@Override
	public void eliminarHotel(Long id) {
		// TODO Auto-generated method stub
		iHotelDAO.deleteById(id);
	}
	

}

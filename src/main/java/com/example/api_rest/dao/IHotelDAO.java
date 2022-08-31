package com.example.api_rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api_rest.dto.Hotel;

public interface IHotelDAO extends JpaRepository<Hotel, Long>{

}

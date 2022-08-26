package com.example.api_rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api_rest.dto.Reserva;

public interface IReservaDAO extends JpaRepository<Reserva, Long>{

}

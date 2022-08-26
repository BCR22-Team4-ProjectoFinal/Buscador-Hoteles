package com.example.api_rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api_rest.dto.Habitacion;

public interface IHabitacionDAO extends JpaRepository<Habitacion, Long>{

}

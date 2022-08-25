package com.example.api_rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api_rest.dto.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long>{

}

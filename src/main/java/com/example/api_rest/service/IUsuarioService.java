package com.example.api_rest.service;

import java.util.List;

import com.example.api_rest.dto.Usuario;

public interface IUsuarioService {

	public List<Usuario> listarUsuarios();
	
	public Usuario guardarUsuario(Usuario usuario);
	
	public Usuario usuarioXId(Long id);
	
	public void eliminarUsuario(Long id);

	public Usuario usuarioXNombreUsuario(String username);
}

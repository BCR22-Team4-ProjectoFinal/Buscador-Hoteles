package com.example.api_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api_rest.dao.IUsuarioDAO;
import com.example.api_rest.dto.Usuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

	@Autowired
	IUsuarioDAO iUsuarioDAO;
	
	@Override
	public List<Usuario> listarUsuarios() {
		// TODO Auto-generated method stub
		return iUsuarioDAO.findAll();
	}

	@Override
	public Usuario guardarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return iUsuarioDAO.save(usuario);
	}

	@Override
	public Usuario usuarioXId(Long id) {
		// TODO Auto-generated method stub
		return iUsuarioDAO.findById(id).get();
	}

	@Override
	public void eliminarUsuario(Long id) {
		// TODO Auto-generated method stub
		iUsuarioDAO.deleteById(id);
	}

}

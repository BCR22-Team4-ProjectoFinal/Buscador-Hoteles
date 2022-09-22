package com.example.api_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.api_rest.dao.IUsuarioDAO;
import com.example.api_rest.dto.Usuario;

@Service("userDetailsService")
public class UsuarioServiceImpl implements IUsuarioService, UserDetailsService{

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
		if (usuario.getRol() == null) {
			usuario.setRol("USER"); 
		}
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

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		final Usuario retrievedUser = iUsuarioDAO.findByNombreUsuario(username);
		if (retrievedUser == null) {
			throw new UsernameNotFoundException("Invalid username or password");
		}
		return UserDetailsMapper.build(retrievedUser);
	}

	@Override
	public Usuario usuarioXNombreUsuario(String username) {
		// TODO Auto-generated method stub
		return iUsuarioDAO.findByNombreUsuario(username);
	}

}

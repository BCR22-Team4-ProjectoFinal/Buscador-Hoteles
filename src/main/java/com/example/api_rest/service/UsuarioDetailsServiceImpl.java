package com.example.api_rest.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import static java.util.Collections.emptyList;
import com.example.api_rest.dao.IUsuarioDAO;
import com.example.api_rest.dto.Usuario;

@Service
public class UsuarioDetailsServiceImpl implements UserDetailsService{

	private IUsuarioDAO iUsuarioDAO;
	
	
	/**
	 * @param iUsuarioDAO
	 */
	public UsuarioDetailsServiceImpl(IUsuarioDAO iUsuarioDAO) {
		this.iUsuarioDAO = iUsuarioDAO;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Usuario usuario = iUsuarioDAO.findByNombreUsuario(username);
		if (usuario == null) {
			throw new UsernameNotFoundException(username);
		}
		return new User(usuario.getNombreUsuario(), usuario.getContrasena(), emptyList());
	}

}

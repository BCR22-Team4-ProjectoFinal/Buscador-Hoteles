package com.example.api_rest.service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.apache.catalina.Role;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.api_rest.dto.Usuario;

public class UserDetailsMapper {
	public static UserDetails build(Usuario user) {
		return new org.springframework.security.core.userdetails.User(user.getNombreUsuario(), user.getContrasena(), getAuthorities(user));
	}

	private static Collection<? extends GrantedAuthority> getAuthorities(Usuario user) {
		String rol = user.getRol();
		Set<SimpleGrantedAuthority> authorities = new HashSet<>();
		authorities.add(new SimpleGrantedAuthority("ROLE_" + rol));
		return authorities;
	}

}

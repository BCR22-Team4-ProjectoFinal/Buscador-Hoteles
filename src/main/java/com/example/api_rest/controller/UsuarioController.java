package com.example.api_rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_rest.dto.Usuario;
import com.example.api_rest.service.UsuarioServiceImpl;

@RestController
@RequestMapping("/api")
public class UsuarioController {

	@Autowired
	UsuarioServiceImpl usuarioServiceImpl;
	
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	/**
	 * @param usuarioServiceImpl
	 * @param bCryptPasswordEncoder
	 */
	public UsuarioController(UsuarioServiceImpl usuarioServiceImpl, BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.usuarioServiceImpl = usuarioServiceImpl;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}
	
	
	@GetMapping("/usuarios")
	public List<Usuario> listarUsuarios(){
		return usuarioServiceImpl.listarUsuarios();
	}
	
	@PreAuthorize("hasRole('ROLE_USER') OR hasRole('ROLE_ADMIN')")
	@GetMapping("/usuarios/{id}")
	public Usuario usuarioXId(@PathVariable(name="id")Long id) {
		return usuarioServiceImpl.usuarioXId(id);
	}
	
	@PostMapping("/usuarios")
	public Usuario guardarUsuario(@RequestBody Usuario usuario) {
		usuario.setContrasena(bCryptPasswordEncoder.encode(usuario.getContrasena()));
		return usuarioServiceImpl.guardarUsuario(usuario);
	}
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@PutMapping("/usuarios/{id}")
	public Usuario actualizarUsuario(@PathVariable(name="id")Long id, @RequestBody Usuario usuario) {
		Usuario usuarioActualizado = usuarioServiceImpl.usuarioXId(id);
		usuarioActualizado.setNombre(usuario.getNombre());
		usuarioActualizado.setApellidos(usuario.getApellidos());
		usuarioActualizado.setEmail(usuario.getEmail());
		usuarioActualizado.setDni(usuario.getDni());
		usuarioActualizado.setFechaNacimiento(usuario.getFechaNacimiento());
		usuarioActualizado.setGenero(usuario.getGenero());
		usuarioActualizado.setNombreUsuario(usuario.getNombreUsuario());
		usuarioActualizado.setTelefono(usuario.getTelefono());
		
		return usuarioServiceImpl.guardarUsuario(usuarioActualizado);
	}
	
	@DeleteMapping("/usuarios/{id}")
	public void eliminarUsuario(@PathVariable(name="id")Long id) {
		usuarioServiceImpl.eliminarUsuario(id);
	}


	@GetMapping("/usuarios/username/{username}")
	public Usuario usuarioXNombreUsuario(@PathVariable(name="username")String username) {
		return usuarioServiceImpl.usuarioXNombreUsuario(username);
	}
}

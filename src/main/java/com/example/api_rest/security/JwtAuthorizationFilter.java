package com.example.api_rest.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.web.filter.OncePerRequestFilter;

import com.example.api_rest.service.UsuarioServiceImpl;

import io.jsonwebtoken.Jwts;

public class JwtAuthorizationFilter extends BasicAuthenticationFilter{

	@Autowired
	UserDetailsService usuarioServiceImpl;
	
	/**
	 * @param authenticationManager
	 */
	public JwtAuthorizationFilter(AuthenticationManager authenticationManager, UserDetailsService userDetailsService) {
		super(authenticationManager);
		this.usuarioServiceImpl = userDetailsService;
	}



	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String token = request.getHeader("Authorization");
		
		String username = Jwts.parser()
				// Cipher key to decrypt the token
				.setSigningKey("1234")
				// Parse the Bearer Token
				.parseClaimsJws(token.replace("Bearer ", ""))
				// Get the body of the token...
				.getBody()
				// ...and the subject, which (If all's correct) should be the username
				.getSubject();
		
		UserDetails user = usuarioServiceImpl.loadUserByUsername(username);
		
		UsernamePasswordAuthenticationToken authenticationToken = TokenProvider.getAuthentication(token.replace("Bearer ", ""), user);
		SecurityContextHolder.getContext().setAuthentication(authenticationToken);
		filterChain.doFilter(request, response);
	}

}

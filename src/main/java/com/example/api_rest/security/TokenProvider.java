package com.example.api_rest.security;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class TokenProvider {
	public static String generateToken(Authentication authentication) {
		// Genera el token con roles, issuer, fecha, expiración (8h)
		final String authorities = authentication.getAuthorities().stream()
				.map(GrantedAuthority::getAuthority)
				.collect(Collectors.joining(","));
		return Jwts.builder()
				.setSubject(authentication.getName())
				.claim("Rol", authorities)
				.signWith(SignatureAlgorithm.HS256, "1234")
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 864_000_000))
				.compact();
	}
	
	public static UsernamePasswordAuthenticationToken getAuthentication(final String token,
			final UserDetails userDetails) {
		final JwtParser jwtParser = Jwts.parser().setSigningKey("1234");
		System.out.println(jwtParser);
		final Jws<Claims> claimsJws = jwtParser.parseClaimsJws(token);
		
		final Claims claims = claimsJws.getBody();
		
		final Collection<SimpleGrantedAuthority> authorities =
				Arrays.stream(claims.get("Rol").toString().split(","))
						.map(SimpleGrantedAuthority::new)
						.collect(Collectors.toList());
		
		return new UsernamePasswordAuthenticationToken(userDetails, "", authorities);
	}
}

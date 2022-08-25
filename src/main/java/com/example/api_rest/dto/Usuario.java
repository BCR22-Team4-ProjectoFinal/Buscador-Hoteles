package com.example.api_rest.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="email")
	private String email;
	@Column(name="nombreUsuario")
	private String nombreUsuario;
	@Column(name="dniNifNie")
	private String dni;
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellidos")
	private String spellidos;
	@Column(name="telefono")
	private String telefono;
	@Temporal(TemporalType.TIMESTAMP)
	private String fechaNacimiento;
	@Column(name="genero")
	private String genero;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<Reserva> reservas;

	/**
	 * 
	 */
	public Usuario() {
	}

	/**
	 * @param id
	 * @param email
	 * @param nombreUsuario
	 * @param dni
	 * @param nombre
	 * @param spellidos
	 * @param telefono
	 * @param fechaNacimiento
	 * @param genero
	 * @param reservas
	 */
	public Usuario(Long id, String email, String nombreUsuario, String dni, String nombre, String spellidos,
			String telefono, String fechaNacimiento, String genero, List<Reserva> reservas) {
		this.id = id;
		this.email = email;
		this.nombreUsuario = nombreUsuario;
		this.dni = dni;
		this.nombre = nombre;
		this.spellidos = spellidos;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.reservas = reservas;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * @param nombreUsuario the nombreUsuario to set
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the spellidos
	 */
	public String getSpellidos() {
		return spellidos;
	}

	/**
	 * @param spellidos the spellidos to set
	 */
	public void setSpellidos(String spellidos) {
		this.spellidos = spellidos;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return the reservas
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "reservas")
	public List<Reserva> getReservas() {
		return reservas;
	}

	/**
	 * @param reservas the reservas to set
	 */
	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", email=" + email + ", nombreUsuario=" + nombreUsuario + ", dni=" + dni
				+ ", nombre=" + nombre + ", spellidos=" + spellidos + ", telefono=" + telefono + ", fechaNacimiento="
				+ fechaNacimiento + ", genero=" + genero + "]";
	}
	
	
}

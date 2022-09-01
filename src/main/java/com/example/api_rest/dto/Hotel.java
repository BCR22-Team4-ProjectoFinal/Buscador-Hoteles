package com.example.api_rest.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="hoteles")
public class Hotel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="categoria")
	private String categoria;
	@Column(name="latitud")
	private String latitud;
	@Column(name="longitud")
	private String longitud;
	
	@ManyToOne
	@JoinColumn(name="poblacionId")
	Poblacion poblacion;
	
	@OneToMany
	@JoinColumn(name="id")
	List<Habitacion> habitacion;

	/**
	 * 
	 */
	public Hotel() {

	}

	/**
	 * @param id
	 * @param nombre
	 * @param categoria
	 * @param latitud
	 * @param longitud
	 * @param poblacion
	 * @param habitacion
	 */
	public Hotel(Long id, String nombre, String categoria, String latitud, String longitud, Poblacion poblacion,
			List<Habitacion> habitacion) {
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		this.latitud = latitud;
		this.longitud = longitud;
		this.poblacion = poblacion;
		this.habitacion = habitacion;
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
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * @return the latitud
	 */
	public String getLatitud() {
		return latitud;
	}

	/**
	 * @param latitud the latitud to set
	 */
	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	/**
	 * @return the longitud
	 */
	public String getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	/**
	 * @return the poblacion
	 */
	public Poblacion getPoblacion() {
		return poblacion;
	}

	/**
	 * @param poblacion the poblacion to set
	 */
	public void setPoblacion(Poblacion poblacion) {
		this.poblacion = poblacion;
	}

	/**
	 * @return the habitacion
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy="habitacion")
	public List<Habitacion> getHabitacion() {
		return habitacion;
	}

	/**
	 * @param habitacion the habitacion to set
	 */
	public void setHabitacion(List<Habitacion> habitacion) {
		this.habitacion = habitacion;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", nombre=" + nombre + ", categoria=" + categoria + ", latitud=" + latitud
				+ ", longitud=" + longitud + ", poblacion=" + poblacion + ", habitacion=" + habitacion + "]";
	}
	
	
	

}

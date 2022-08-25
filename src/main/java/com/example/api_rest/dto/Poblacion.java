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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="poblaciones")
public class Poblacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="cp")
	private String cp;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<Hoteles> hoteles;

	/**
	 * 
	 */
	public Poblacion() {
	}

	/**
	 * @param id
	 * @param nombre
	 * @param cp
	 * @param hoteles
	 */
	public Poblacion(Long id, String nombre, String cp, List<Hoteles> hoteles) {
		this.id = id;
		this.nombre = nombre;
		this.cp = cp;
		this.hoteles = hoteles;
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
	 * @return the cp
	 */
	public String getCp() {
		return cp;
	}

	/**
	 * @param cp the cp to set
	 */
	public void setCp(String cp) {
		this.cp = cp;
	}

	/**
	 * @return the hoteles
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy="hoteles")
	public List<Hoteles> getHoteles() {
		return hoteles;
	}

	/**
	 * @param hoteles the hoteles to set
	 */
	public void setHoteles(List<Hoteles> hoteles) {
		this.hoteles = hoteles;
	}

	@Override
	public String toString() {
		return "Poblacion [id=" + id + ", nombre=" + nombre + ", cp=" + cp + "]";
	}
	
	
}

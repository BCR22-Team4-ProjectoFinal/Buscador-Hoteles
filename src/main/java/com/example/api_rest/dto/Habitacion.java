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
@Table(name="habitaciones")
public class Habitacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "num_habitacion")
	private int num_habitacion;
	@Column
	private boolean libre;
	@Column 
	private double precio_noche;
	@Column
	private int num_personas;
	@Column
	private int planta;

	@ManyToOne
	@JoinColumn(name="hotel_id")
	private Hotel hotel;
	
	@OneToMany
	@JoinColumn(name="id")
    private List<Reserva> reservas;
	
	public Habitacion() {
	
	}

	public Habitacion(Long id, int num_habitacion, boolean libre, double precio_noche, int num_personas, int planta, Hotel hotel, List<Reserva> reservas) {
		this.id = id;
		this.num_habitacion = num_habitacion;
		this.libre = libre;
		this.precio_noche = precio_noche;
		this.num_personas = num_personas;
		this.planta = planta;
		this.hotel = hotel;
		this.reservas = reservas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNum_habitacion() {
		return num_habitacion;
	}

	public void setNum_habitacion(int num_habitacion) {
		this.num_habitacion = num_habitacion;
	}

	public boolean isLibre() {
		return libre;
	}

	public void setLibre(boolean libre) {
		this.libre = libre;
	}

	public double getPrecio_noche() {
		return precio_noche;
	}

	public void setPrecio_noche(double precio_noche) {
		this.precio_noche = precio_noche;
	}

	public int getNum_personas() {
		return num_personas;
	}

	public void setNum_personas(int num_personas) {
		this.num_personas = num_personas;
	}

	public int getPlanta() {
		return planta;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Reserva")
	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	

	

	/*@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Venta")
	public List<Venta> getVentas() {
		return ventas;
	}*/

	
	
	
	
	
}





package com.example.api_rest.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="reservas")
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	
	@Column
	private Date fecha_entrada;
	@Column
	private Date fecha_salida;
	@Column
	private Date fecha_reserva;
	@Column
	private int num_adultos;
	@Column
	private int num_ninos;
	
	@ManyToOne
    @JoinColumn(name = "habitacion_id")
    private Habitacion habitacion;
 
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;	
    
	public Reserva() {
	
	}

	public Reserva(Long id, Date fecha_entrada, Date fecha_salida, Date fecha_reserva, int num_adultos, int num_ninos, Habitacion habitacion, Usuario usuario) {
		this.id = id;
		this.fecha_entrada = fecha_entrada;
		this.fecha_salida = fecha_salida;
		this.fecha_reserva = fecha_reserva;
		this.num_adultos = num_adultos;
		this.num_ninos = num_ninos;
		this.habitacion = habitacion;
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFecha_entrada() {
		return fecha_entrada;
	}

	public void setFecha_entrada(Date fecha_entrada) {
		this.fecha_entrada = fecha_entrada;
	}

	public Date getFecha_salida() {
		return fecha_salida;
	}

	public void setFecha_salida(Date fecha_salida) {
		this.fecha_salida = fecha_salida;
	}

	public Date getFecha_reserva() {
		return fecha_reserva;
	}

	public void setFecha_reserva(Date fecha_reserva) {
		this.fecha_reserva = fecha_reserva;
	}

	public int getNum_adultos() {
		return num_adultos;
	}

	public void setNum_adultos(int num_adultos) {
		this.num_adultos = num_adultos;
	}

	public int getNum_ninos() {
		return num_ninos;
	}

	public void setNum_ninos(int num_ninos) {
		this.num_ninos = num_ninos;
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}	
}

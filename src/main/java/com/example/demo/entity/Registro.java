package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name = "registro")
public class Registro {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	@ManyToOne
	@JoinColumn(name="vehiculo")
	private Vehiculo vehiculo;
	private Date fechInicio;
	private Date fechFin;
	private String usuarioRegistro;
	private Date fechaRegistro;

	public Registro(long id, Vehiculo vehiculo, Date fechInicio, Date fechFin, String usuarioRegistro,
			Date fechaRegistro) {
		super();
		this.id = id;
		this.vehiculo = vehiculo;
		this.fechInicio = fechInicio;
		this.fechFin = fechFin;
		this.usuarioRegistro = usuarioRegistro;
		this.fechaRegistro = fechaRegistro;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Date getFechInicio() {
		return fechInicio;
	}

	public void setFechInicio(Date fechInicio) {
		this.fechInicio = fechInicio;
	}

	public Date getFechFin() {
		return fechFin;
	}

	public void setFechFin(Date fechFin) {
		this.fechFin = fechFin;
	}

	public String getUsuarioRegistro() {
		return usuarioRegistro;
	}

	public void setUsuarioRegistro(String usuarioRegistro) {
		this.usuarioRegistro = usuarioRegistro;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
}

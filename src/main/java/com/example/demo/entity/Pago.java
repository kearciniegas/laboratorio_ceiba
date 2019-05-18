package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "pago")
public class Pago {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idPago;

	@Column
	private double valor;

	@Column
	private long idRegistro;

	@Column
	private String usuarioRegistro;

	@Column
	private Date fechaRegistro;
	
	public Pago(long idPago, double valor, long idRegistro, String usuarioRegistro, Date fechaRegistro) {
		super();
		this.idPago = idPago;
		this.valor = valor;
		this.idRegistro = idRegistro;
		this.usuarioRegistro = usuarioRegistro;
		this.fechaRegistro = fechaRegistro;
	}
	
	public long getIdPago() {
		return idPago;
	}

	public void setIdPago(long idPago) {
		this.idPago = idPago;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public long getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(long idRegistro) {
		this.idRegistro = idRegistro;
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
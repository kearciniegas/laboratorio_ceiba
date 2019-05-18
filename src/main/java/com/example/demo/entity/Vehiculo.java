package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "vehiculo")
public class Vehiculo {

	@Id
	private long id;
	private String placa;
	private String marca;
	private String modelo;
	private String tipo;

	public Vehiculo(long id, String placa, String marca, String modelo, String tipo) {
		super();
		this.id = id;
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}

package com.example.demo.domain.builder;

import com.example.demo.entity.Vehiculo;

public class VehiculoBuilder {

	public static final String DEFAULT_PLACA = "EFG141";
	public static final String DEFAULT_MARCA = "Mazda";
	public static final String DEFAULT_MODELO = "2019";
	public static final String DEFAULT_TIPO = "Carro";

	private long id;
	private String placa;
	private String marca;
	private String modelo;
	private String tipo;

	private VehiculoBuilder() {
		this.placa = DEFAULT_PLACA;
		this.marca = DEFAULT_MARCA;
		this.modelo = DEFAULT_MODELO;
		this.tipo = DEFAULT_TIPO;
	}

	public static VehiculoBuilder defaultValues() {
		return new VehiculoBuilder();
	}

	public VehiculoBuilder withId(long id) {
		this.id = id;
		return this;
	}

	public VehiculoBuilder withPlaca(String placa) {
		this.placa = placa;
		return this;
	}

	public VehiculoBuilder withMarca(String marca) {
		this.marca = marca;
		return this;
	}

	public VehiculoBuilder withModelo(String modelo) {
		this.modelo = modelo;
		return this;
	}

	public VehiculoBuilder withTipo(String tipo) {
		this.tipo = tipo;
		return this;
	}

	public Vehiculo build() {
		return new Vehiculo(id, placa, marca, modelo, tipo);
	}

}

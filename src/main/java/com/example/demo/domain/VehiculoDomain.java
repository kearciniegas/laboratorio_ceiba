package com.example.demo.domain;

import java.util.List;

import com.example.demo.entity.Vehiculo;

public interface VehiculoDomain{

	List<Vehiculo> findAll();

	void save(Vehiculo vehiculo);

	Vehiculo findByPlaca(Vehiculo vehiculo);
	
}

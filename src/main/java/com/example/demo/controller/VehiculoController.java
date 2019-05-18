package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.VehiculoDomain;
import com.example.demo.entity.Vehiculo;

@RestController
@RequestMapping("vehiculos")
public class VehiculoController {

	private VehiculoDomain vehiculoDomain;

	@Autowired
	public VehiculoController(VehiculoDomain vehiculoDomain) {
		this.vehiculoDomain = vehiculoDomain;
	}

	@GetMapping
	public List<Vehiculo> listado() {
		return vehiculoDomain.findAll();
	}

}

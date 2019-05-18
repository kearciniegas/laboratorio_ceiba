package com.example.demo.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Vehiculo;
import com.example.demo.repository.VehiculoRepository;

@Service
public class VehiculoDomainImpl implements VehiculoDomain {

	private VehiculoRepository vehiculoRepository;
	
	@Autowired
	public VehiculoDomainImpl(VehiculoRepository vehiculoRepository) {
		this.vehiculoRepository = vehiculoRepository;
	}

	@Override
	public List<Vehiculo> findAll() {
		return (List<Vehiculo>) vehiculoRepository.findAll();
	}

}

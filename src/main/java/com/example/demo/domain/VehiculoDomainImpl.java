package com.example.demo.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Vehiculo;
import com.example.demo.exception.ParqueaderoException;
import com.example.demo.repository.VehiculoRepository;

@Service
@Transactional
public class VehiculoDomainImpl implements VehiculoDomain {

	public static final String MENSAJE_PLACA_REQUERIDA = "La placa es requerida";

	private VehiculoRepository vehiculoRepository;

	@Autowired
	public VehiculoDomainImpl(VehiculoRepository vehiculoRepository) {
		this.vehiculoRepository = vehiculoRepository;
	}

	@Override
	public List<Vehiculo> findAll() {
		return (List<Vehiculo>) vehiculoRepository.findAll();
	}

	@Override
	public void save(Vehiculo vehiculo) {
		if (vehiculo.getPlaca() == null) {
			throw new ParqueaderoException(MENSAJE_PLACA_REQUERIDA);
		}
		vehiculoRepository.save(vehiculo);
	}

	@Override
	public  Vehiculo findByPlaca( Vehiculo vehiculo) {
		if (vehiculo.getPlaca() == null) {
			throw new ParqueaderoException(MENSAJE_PLACA_REQUERIDA);
		}
		return vehiculo;
	}
}

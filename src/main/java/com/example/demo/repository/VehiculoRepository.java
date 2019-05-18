package com.example.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Vehiculo;

@Repository
public interface VehiculoRepository extends CrudRepository<Vehiculo, Long>{

	public Vehiculo findByPlaca(String placa);
	
	@Query("SELECT v FROM vehiculo AS v WHERE v.placa = :placa")
	public Vehiculo findPorPlaca(@Param("placa") String placa);
	
}

package com.example.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Vehiculo;

@Repository
public interface VehiculoRepository extends PagingAndSortingRepository<Vehiculo, Long>{

}

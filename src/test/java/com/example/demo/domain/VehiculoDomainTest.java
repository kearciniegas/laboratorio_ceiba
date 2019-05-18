package com.example.demo.domain;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.builder.VehiculoBuilder;
import com.example.demo.entity.Vehiculo;
import com.example.demo.exception.ParqueaderoException;

@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional
public class VehiculoDomainTest {

	@Autowired
	private VehiculoDomain vehiculoDomain;

	@Test	
	public void whenNullPlacaThenFail() {
		Vehiculo vehiculo = VehiculoBuilder.defaultValues().withPlaca(null).build();
		try {
			vehiculoDomain.save(vehiculo);
			fail();
		} catch (ParqueaderoException e) {
			Assert.assertEquals(VehiculoDomainImpl.MENSAJE_PLACA_REQUERIDA, e.getMessage());
		}
	}

	@Test
	public void whenVehiculoIsOkThenSave() {
		Vehiculo vehiculo = VehiculoBuilder.defaultValues().build();
		vehiculoDomain.save(vehiculo);
		Assert.assertEquals(VehiculoBuilder.DEFAULT_PLACA, vehiculo.getPlaca());
		Assert.assertEquals(VehiculoBuilder.DEFAULT_MARCA, vehiculo.getMarca());
		Assert.assertEquals(VehiculoBuilder.DEFAULT_MODELO, vehiculo.getModelo());
		Assert.assertEquals(VehiculoBuilder.DEFAULT_TIPO, vehiculo.getTipo());
	}

}

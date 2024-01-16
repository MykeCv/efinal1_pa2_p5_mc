package com.uce.edu;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.CuentaBancaria;
import com.uce.edu.repository.modelo.Propietario;
import com.uce.edu.service.ICuentaBancariaService;
import com.uce.edu.service.IPropietarioService;
import com.uce.edu.service.IRegistroTransferenciaService;

@SpringBootApplication
public class Efinal1Pa2U2P5McApplication implements CommandLineRunner {

	@Autowired
	private IPropietarioService iPropietarioService;
	@Autowired
	private ICuentaBancariaService bancariaService;
	@Autowired
	private IRegistroTransferenciaService iRegistroTransferenciaService;

	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2U2P5McApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		CuentaBancaria ctaBancaria1 = new CuentaBancaria();
		ctaBancaria1.setId("1A");
		ctaBancaria1.setTipoAhorros("Cuenta de Ahorros");
		ctaBancaria1.setNumero("123456");
		ctaBancaria1.setSaldo(new BigDecimal(500));

		CuentaBancaria ctaBancaria2 = new CuentaBancaria();
		ctaBancaria2.setId("2B");
		ctaBancaria2.setTipoCorriente("Cuenta Corriente");
		ctaBancaria2.setNumero("456123");
		ctaBancaria2.setSaldo(new BigDecimal(1000));

		Propietario propietario1 = new Propietario();
		propietario1.setId("1A");
		propietario1.setNombre("Jose");
		propietario1.setApellido("Chicaiza");
		propietario1.setCedula("1724361203");

		Propietario propietario2 = new Propietario();
		propietario2.setId("2B");
		propietario2.setNombre("Maria");
		propietario2.setApellido("Alcoser");
		propietario2.setCedula("17241206363");

		this.bancariaService.guardar(ctaBancaria1);
		this.bancariaService.guardar(ctaBancaria2);
		this.iPropietarioService.guardar(propietario1);
		this.iPropietarioService.guardar(propietario2);

		System.out.println("Guardado Con exito");

	}

}

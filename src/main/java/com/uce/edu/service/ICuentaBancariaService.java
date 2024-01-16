package com.uce.edu.service;

import com.uce.edu.repository.modelo.CuentaBancaria;

public interface ICuentaBancariaService {

	public void guardar(CuentaBancaria cuentaBancaria);

	public CuentaBancaria buscar(Integer id);

	public void actulizar(CuentaBancaria cuentaBancaria);

	public void borrar(Integer id);

}

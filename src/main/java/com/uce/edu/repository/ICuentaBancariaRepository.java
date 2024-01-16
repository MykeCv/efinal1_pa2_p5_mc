package com.uce.edu.repository;

import com.uce.edu.repository.modelo.CuentaBancaria;

public interface ICuentaBancariaRepository {

	public void insertar(CuentaBancaria cuentaBancaria);

	public CuentaBancaria seleccionarPorId(Integer id);

	public void actualizar(CuentaBancaria cuentaBancaria);

	public CuentaBancaria seleccionarPorCedula(String cedula);

	public void eliminar(Integer id);

}

package com.uce.edu.repository;

import com.uce.edu.repository.modelo.Propietario;

public interface IPropietarioRepository {

	public void insertar(Propietario propietario);

	public Propietario seleccionarPorId(Integer id);

	public void actualizar(Propietario propietario);

	public Propietario seleccionarPorCedula(String cedula);

	public void eliminarId(Integer id);

	public void eliminarCedula(String cedula);
}

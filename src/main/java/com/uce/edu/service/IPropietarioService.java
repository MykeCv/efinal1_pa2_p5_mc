package com.uce.edu.service;

import com.uce.edu.repository.modelo.Propietario;

public interface IPropietarioService {

	public void guardar(Propietario libro);

	public Propietario buscarId(Integer id);

	public Propietario buscarCedula(String cedula);

	public void actulizar(Propietario ropietario);

	public void borrarId(Integer id);

	public void borrarCedula(String cedula);

}

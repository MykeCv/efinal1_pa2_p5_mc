package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IPropietarioRepository;
import com.uce.edu.repository.modelo.Propietario;

@Service
public class IPropietarioServiceImpl implements IPropietarioService {

	@Autowired
	private IPropietarioRepository iPropietarioRepository;

	@Override
	public void guardar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.insertar(propietario);
	}

	@Override
	public Propietario buscarId(Integer id) {
		// TODO Auto-generated method stub
		return this.iPropietarioRepository.seleccionarPorId(id);
	}

	@Override
	public Propietario buscarCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.iPropietarioRepository.seleccionarPorCedula(cedula);
	}

	@Override
	public void actulizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.actualizar(propietario);
	}

	@Override
	public void borrarId(Integer id) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.eliminarId(id);
	}

	@Override
	public void borrarCedula(String cedula) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.eliminarCedula(cedula);
	}

}

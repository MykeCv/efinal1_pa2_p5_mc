package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IRegistroTransferenciaRepository;
import com.uce.edu.repository.modelo.RegistroTransferencia;

@Service
public class IRegistroTransferenciaServiceImpl implements IRegistroTransferenciaService {

	@Autowired
	private IRegistroTransferenciaRepository iRegistroTransferenciaRepository;

	@Override
	public void guardar(RegistroTransferencia registroTransferencia) {
		// TODO Auto-generated method stub
		this.iRegistroTransferenciaRepository.insertar(registroTransferencia);
	}

	@Override
	public RegistroTransferencia buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iRegistroTransferenciaRepository.seleccionarPorId(id);
	}

	@Override
	public void actulizar(RegistroTransferencia registroTransferencia) {
		// TODO Auto-generated method stub
		this.iRegistroTransferenciaRepository.actualizar(registroTransferencia);

	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iRegistroTransferenciaRepository.eliminar(id);
	}

}

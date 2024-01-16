package com.uce.edu.service;

import com.uce.edu.repository.modelo.RegistroTransferencia;

public interface IRegistroTransferenciaService {

	public void guardar(RegistroTransferencia registroTransferencia);

	public RegistroTransferencia buscar(Integer id);

	public void actulizar(RegistroTransferencia registroTransferencia);

	public void borrar(Integer id);

}

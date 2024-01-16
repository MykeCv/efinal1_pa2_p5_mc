package com.uce.edu.repository;

import com.uce.edu.repository.modelo.RegistroTransferencia;

public interface IRegistroTransferenciaRepository {

	public void insertar(RegistroTransferencia registroTransferencia);

	public RegistroTransferencia seleccionarPorId(Integer id);

	public void actualizar(RegistroTransferencia registroTransferencia);

	public void eliminar(Integer id);
}

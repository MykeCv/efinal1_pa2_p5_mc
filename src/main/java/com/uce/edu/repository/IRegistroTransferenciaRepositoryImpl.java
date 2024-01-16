package com.uce.edu.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.RegistroTransferencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class IRegistroTransferenciaRepositoryImpl implements IRegistroTransferenciaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(RegistroTransferencia registroTransferencia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(registroTransferencia);

	}

	@Override
	public RegistroTransferencia seleccionarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(RegistroTransferencia.class, id);
	}

	@Override
	public void actualizar(RegistroTransferencia registroTransferencia) {
		// TODO Auto-generated method stub
		this.entityManager.merge(registroTransferencia);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(id);
	}

}

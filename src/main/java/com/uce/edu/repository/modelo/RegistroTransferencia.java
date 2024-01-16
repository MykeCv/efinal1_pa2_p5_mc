package com.uce.edu.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "registroTransferencia")
public class RegistroTransferencia {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_id")
	@SequenceGenerator(name = "seq_id", sequenceName = "seq_id", allocationSize = 1)
	@Column(name = "regTrans_id")
	private String id;
	@Column(name = "regTrans_fecha")
	private LocalDateTime fecha;
	@Column(name = "regTrans_referenciaCtaOrigen")
	private String ReferenciaCtaOrigen;
	@Column(name = "regTrans_referenciaCtaDestino")
	private String ReferenciaCtaDestino;
	@Column(name = "regTrans_montoTransferencia")
	private BigDecimal montoTransferencia;
	@Column(name = "regTrans_comisionTransferencia")
	private BigDecimal comisionTransferencia;

	// set y gets
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getReferenciaCtaOrigen() {
		return ReferenciaCtaOrigen;
	}

	public void setReferenciaCtaOrigen(String referenciaCtaOrigen) {
		ReferenciaCtaOrigen = referenciaCtaOrigen;
	}

	public String getReferenciaCtaDestino() {
		return ReferenciaCtaDestino;
	}

	public void setReferenciaCtaDestino(String referenciaCtaDestino) {
		ReferenciaCtaDestino = referenciaCtaDestino;
	}

	public BigDecimal getMontoTransferencia() {
		return montoTransferencia;
	}

	public void setMontoTransferencia(BigDecimal montoTransferencia) {
		this.montoTransferencia = montoTransferencia;
	}

	public BigDecimal getComisionTransferencia() {
		return comisionTransferencia;
	}

	public void setComisionTransferencia(BigDecimal comisionTransferencia) {
		this.comisionTransferencia = comisionTransferencia;
	}

	// set y gets

}

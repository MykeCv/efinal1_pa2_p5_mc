package com.uce.edu.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name = "cuentaBancaria")
public class CuentaBancaria {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_id")
	@SequenceGenerator(name = "seq_id", sequenceName = "seq_id", allocationSize = 1)
	@Column(name = "ctaBan_id")
	private String id;
	@Column(name = "ctaBan_numero")
	private String numero;
	@Column(name = "ctaBan_tipoAhorros")
	private String tipoAhorros;
	@Column(name = "ctaBan_tipoCorriente")
	private String tipoCorriente;
	@Column(name = "ctaBan_saldo")
	private BigDecimal saldo;

	// set y gets
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipoAhorros() {
		return tipoAhorros;
	}

	public void setTipoAhorros(String tipoAhorros) {
		this.tipoAhorros = tipoAhorros;
	}

	public String getTipoCorriente() {
		return tipoCorriente;
	}

	public void setTipoCorriente(String tipoCorriente) {
		this.tipoCorriente = tipoCorriente;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

}

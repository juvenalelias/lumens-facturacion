package com.co.lumens.entities;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
	
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "factura")
//@JsonIgnoreProperties(value = {"fecha"}, allowGetters = true)
public class Factura {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long noFactura;
	private long idCliente;
	private double valor;
	private Date fecha;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="factura")
	private Set<FacturaDetalle> facturaDetalle;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Set<FacturaDetalle> getFacturaDetalle() {
		return facturaDetalle;
	}

	public void setFacturaDetalle(Set<FacturaDetalle> facturaDetalle) {
		this.facturaDetalle = facturaDetalle;
	}
	
	public long getNoFactura() {
		return noFactura;
	}

	public void setNoFactura(long noFactura) {
		this.noFactura = noFactura;
	}
		 
	public Factura(long noFactura, long idCliente, double valor, Date fecha){
		this.idCliente = idCliente;
		this.valor = valor;
		this.fecha = fecha;
		this.noFactura = noFactura;
	}
	
	public Factura(){
	}
	
	
}

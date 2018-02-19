package com.co.lumens.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

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
	
//	@Temporal(TemporalType.TIMESTAMP)	
	private Date fecha;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<FacturaDetalle> items = new ArrayList<>();
		 
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getNoFactura() {
		return noFactura;
	}
	
	public void setNoFactura(long noFactura) {
		this.noFactura = noFactura;
	}
	
	public long getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	
	//@JsonGetter
	public double getValor() {
		return valor;
	}
	
	//@JsonSetter
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	//@JsonGetter
	public Date getFecha() {
		return fecha;
	}
	
	//@JsonSetter
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public List<FacturaDetalle> getFacturas() {
		return items;
	}

	public void setFacturas(List<FacturaDetalle> facturas) {
		this.items = facturas;
	}
	
}

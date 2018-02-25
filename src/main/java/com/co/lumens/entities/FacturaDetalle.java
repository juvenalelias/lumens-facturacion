package com.co.lumens.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "factura_detalle")
//@JsonIgnoreProperties({"id"})
//@JsonIgnoreProperties(ignoreUnknown = true)
public class FacturaDetalle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private long idItem;
	private String unidad;
	private long cantidad;
	private long valorUnit;
	private long iva;
	
	
	@ManyToOne
    @JoinColumn(name="id_factura")
//	@JsonBackReference
//	@JsonProperty("Factura")
    private Factura factura;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getIdItem() {
		return idItem;
	}
	
	public void setIdItem(long idItem) {
		this.idItem = idItem;
	}
	
	public String getUnidad() {
		return unidad;
	}
	
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	
	public long getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}
	
	public long getValorUnit() {
		return valorUnit;
	}
	
	public void setValorUnit(long valorUnit) {
		this.valorUnit = valorUnit;
	}
	
	public long getIva() {
		return iva;
	}
	
	public void setIva(long iva) {
		this.iva = iva;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}
}

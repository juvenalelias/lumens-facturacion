package com.co.lumens.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.co.lumens.entities.Factura;
import com.co.lumens.repository.FacturaRepository;

@RestController
@RequestMapping(value="/rest/factura")
public class FacturaService implements IFacturaService {
	
	@Autowired
	private FacturaRepository facturaRepository;
	
	//@RequestMapping(value="/add",method = RequestMethod.POST)
	public synchronized Factura crearFactura(Factura fact) {
		// TODO Auto-generated method stub
		facturaRepository.save(fact);
		return fact;
	}
}

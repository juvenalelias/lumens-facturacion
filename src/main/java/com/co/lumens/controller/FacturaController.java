package com.co.lumens.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.lumens.service.FacturaMqSender;

@RestController("/facturamq")
public class FacturaController {
	
	@Autowired
	private FacturaMqSender facturaService;
	
	@PostMapping("/send")
	public ResponseEntity<String> addFactura(String factura) {
		
		facturaService.sendMessage(factura);
       
		return new ResponseEntity<String>(factura, HttpStatus.OK);
	}
	
	@GetMapping("/get")
	public ResponseEntity<String> getFactura() {
		
		return new ResponseEntity<String>("hola mundo", HttpStatus.OK);
	}


}

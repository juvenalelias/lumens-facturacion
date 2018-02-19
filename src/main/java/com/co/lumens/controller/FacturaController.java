package com.co.lumens.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import com.co.lumens.entities.Factura;
import com.co.lumens.service.IFacturaService;

@Controller
@RequestMapping("user")
public class FacturaController {
	@Autowired
	private IFacturaService facturaService;
	
	@PostMapping("factura")
	public Factura addFactura(@RequestBody Factura factura, UriComponentsBuilder builder) {
		Factura fact = facturaService.crearFactura(factura);
        /*if (flag == false) {
        	return new ResponseEntity<Void>(HttpStatus.CONFLICT);
          }
                HttpHeaders headers = new HttpHeaders();
                headers.setLocation(builder.path("/article/{id}").buildAndExpand(article.getArticleId()).toUri());
                return new ResponseEntity<Factura>(headers, HttpStatus.CREATED);*/
		return fact;
	}

}

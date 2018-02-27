package com.co.lumens.mq;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.co.lumens.entities.Factura;
import com.co.lumens.entities.FacturaDetalle;
import com.co.lumens.repository.FacturaRepository;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class Receiver {

//	@Autowired
//	FacturaRepository facturarespository;
//	
//    private CountDownLatch latch = new CountDownLatch(1);
//    
////    @JsonCreator
//    public void receiveMessage(String message) throws JsonParseException, JsonMappingException, IOException {
//        System.out.println("Received <" + message + ">");
//        System.out.println("Received <" + new String(message) + ">");
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
//
//        try {
//        	String b = "{ \"noFactura\" : 987, \"idCliente\" : 13, \"valor\" : \"5.00\", \"fecha\" : \"2018-02-06\", \"facturaDetalle\": [ { \"idItem\": 1, \"unidad\":\"H\", \"cantidad\": 3, \"valorUnit\": 10000, \"iva\": \"16\" }, { \"idItem\": 2, \"unidad\":\"H\", \"cantidad\": 1, \"valorUnit\": 10000, \"iva\": \"16\" }, { \"idItem\": 3, \"unidad\":\"H\", \"cantidad\": 1, \"valorUnit\": 10000, \"iva\": \"16\" } ] }";
//        	String a = String.valueOf(message);
//        	System.out.println("Iguales: " + a.equals(b));
//        	Factura factura = mapper.readValue(a, Factura.class);
//        	
//        	
//			System.out.println("Factura: " + factura);
//			
//			for(FacturaDetalle fa : factura.getFacturaDetalle()){
//				System.out.println(fa);
//				fa.setFactura(factura);
//			}
//			facturarespository.save(factura);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        latch.countDown();
//    }
//
//    public CountDownLatch getLatch() {
//        return latch;
//    }
//    
//    public static void main(String...  args){
//    	String a = "{ \"noFactura\" : 987, \"idCliente\" : 13, \"valor\" : \"5.00\", \"fecha\" : \"2018-02-06\", \"facturaDetalle\": [ { \"idItem\": 1, \"unidad\":\"H\", \"cantidad\": 3, \"valorUnit\": 10000, \"iva\": \"16\" }, { \"idItem\": 2, \"unidad\":\"H\", \"cantidad\": 1, \"valorUnit\": 10000, \"iva\": \"16\" }, { \"idItem\": 3, \"unidad\":\"H\", \"cantidad\": 1, \"valorUnit\": 10000, \"iva\": \"16\" } ] }";
//    	ObjectMapper mapper = new ObjectMapper();
//
//        try {
//			Factura factura = mapper.readValue(a, Factura.class);
//			//mapper.configure(DeserializationFeature.);
//			System.out.println("Factura: " + factura);
//			
//			for(FacturaDetalle fa : factura.getFacturaDetalle()){
//				System.out.println(fa);
//				fa.setFactura(factura);
//			}
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        
//    }

}
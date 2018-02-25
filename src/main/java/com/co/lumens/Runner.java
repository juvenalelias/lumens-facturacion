package com.co.lumens;

import org.springframework.stereotype.Component;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

@Component
public class Runner /*implements CommandLineRunner*/ {
	
	
	private final static String QUEUE_NAME = "spring-boot";

	  public static void main(String[] argv) throws Exception {
	    ConnectionFactory factory = new ConnectionFactory();
	    factory.setHost("192.168.50.4");
	    factory.setUsername("test");
	    factory.setPassword("test");
	    
	    Connection connection = factory.newConnection();
	    Channel channel = connection.createChannel();

	    channel.queueDeclare(QUEUE_NAME, false, false, false, null);
	    String message = "Hello World!";
	    channel.basicPublish("spring-boot-exchange", QUEUE_NAME, null, message.getBytes("UTF-8"));
	    System.out.println(" [x] Sent '" + message + "'");

	    channel.close();
	    connection.close();
	  }
	
	/*

	
    private final RabbitTemplate rabbitTemplate;
    private final Receiver receiver;
    private final ConfigurableApplicationContext context;

    public Runner(Receiver receiver, RabbitTemplate rabbitTemplate,
            ConfigurableApplicationContext context) {
        this.receiver = receiver;
        this.rabbitTemplate = rabbitTemplate;
        this.context = context;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Sending message...");
        String b = "{ \"noFactura\" : 987, \"idCliente\" : 13, \"valor\" : \"5.00\", \"fecha\" : \"2018-02-06\", \"facturaDetalle\": [ { \"idItem\": 1, \"unidad\":\"H\", \"cantidad\": 3, \"valorUnit\": 10000, \"iva\": \"16\" }, { \"idItem\": 2, \"unidad\":\"H\", \"cantidad\": 1, \"valorUnit\": 10000, \"iva\": \"16\" }, { \"idItem\": 3, \"unidad\":\"H\", \"cantidad\": 1, \"valorUnit\": 10000, \"iva\": \"16\" } ] }";
        rabbitTemplate.convertAndSend(Application.queueName, b);
        receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
        context.close();
    }
    
    */

}
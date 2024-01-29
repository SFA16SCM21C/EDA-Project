package net.javaguides.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

	// remember to start the zookeeper and the server first in order to be able to see the orders in stock and email service logs
	// go to kafka folder using cd whereever you have saved it
	// first start the zookeeper bash using this command - bin/zookeeper-server-start.sh config/zookeeper.properties
	// second start the server bash using this command - bin/kafka-server-start.sh config/server.properties

}

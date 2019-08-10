package com.stackroute.microservice.eurekaserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication<args> {
	private static Logger LOGGER = LoggerFactory.getLogger(EurekaServerApplication.class);

	//main method
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args); {

			SpringApplication.run(EurekaServerApplication.class, args);

			LOGGER.debug(" debug message");
			LOGGER.info(" info message");
			LOGGER.warn(" warn message");
			LOGGER.error("This is an error message");
		}
	}
}





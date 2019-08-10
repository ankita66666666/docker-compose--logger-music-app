package com.stackroute.microservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(ConfigServerApplication.class);

	//main method
	public static void main(String[] args) {

		SpringApplication.run(ConfigServerApplication.class, args);
		{
			LOGGER.debug(" debug message");
			LOGGER.info(" info message");
			LOGGER.warn(" warn message");
			LOGGER.error("This is an error message");
		}
	}
}







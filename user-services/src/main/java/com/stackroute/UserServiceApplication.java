package com.stackroute;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

import static org.apache.logging.log4j.LogManager.LOGGER;

@SpringBootApplication
public class UserServiceApplication {


	private static org.slf4j.Logger LOGGER=  LoggerFactory.getLogger(UserServiceApplication.class);

	//main method
	public static void main(String[] args)
	{

		SpringApplication.run(UserServiceApplication.class, args);

		LOGGER.debug(" debug message");
		LOGGER.info(" info message");
		LOGGER.warn(" warn message");
		LOGGER.error("This is an error message");
	}

}

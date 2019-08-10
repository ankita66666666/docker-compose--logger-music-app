package com.stackroute;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class UserServiceApplication {

//	Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
//		LOGGER.debug("This is a debug message");
//		LOGGER.info("This is an info message");
//		LOGGER.warn("This is a warn message");
//		LOGGER.error("This is an error message");
		SpringApplication.run(UserServiceApplication.class, args);
	}

}

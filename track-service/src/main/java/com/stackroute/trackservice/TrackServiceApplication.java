package com.stackroute.trackservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TrackServiceApplication {
	private static Logger LOGGER=  LoggerFactory.getLogger(TrackServiceApplication.class);

	//main method
	public static void main(String[] args)
	{

		SpringApplication.run(TrackServiceApplication.class, args);

		LOGGER.debug(" debug message");
		LOGGER.info(" info message");
		LOGGER.warn(" warn message");
		LOGGER.error("This is an error message");
	}

}

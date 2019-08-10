package com.stackroute.apigatewaypattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.ConfigServerApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
@EnableZuulProxy
public class ApiGatewayPatternApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(ApiGatewayPatternApplication.class);

	//main method

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayPatternApplication.class, args);
	}

		
	{
		{
			LOGGER.debug(" debug message");
			LOGGER.info(" info message");
			LOGGER.warn(" warn message");
			LOGGER.error("This is an error message");
		}
	}
}






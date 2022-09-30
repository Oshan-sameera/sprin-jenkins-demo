package com.oshcoding;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SprinJenkinsDemoApplication {
	public static Logger logger = LoggerFactory.getLogger(SprinJenkinsDemoApplication.class);

	@PostConstruct
	public void initt() {
		logger.info("Application started....");
	}
	
	public static void main(String[] args) {
		logger.info("Application executed....");
		SpringApplication.run(SprinJenkinsDemoApplication.class, args);
	}

}

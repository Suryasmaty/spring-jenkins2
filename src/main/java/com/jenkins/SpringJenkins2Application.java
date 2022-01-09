package com.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringJenkins2Application {

	
	
	public static Logger logger = LoggerFactory.getLogger(SpringJenkins2Application.class);
	
	@PostConstruct
	public void init()
	{
		
		logger.info("application started...");
	}
	
	public static void main(String[] args) {
		logger.info("application excecuted");
		SpringApplication.run(SpringJenkins2Application.class, args);
	}

}

package com.shannelservicedemo;

import com.shannelservicedemo.repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.ZonedDateTime;

@SpringBootApplication
public class ShannelServiceDemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(ShannelServiceDemoApplication.class, args);
	}

}

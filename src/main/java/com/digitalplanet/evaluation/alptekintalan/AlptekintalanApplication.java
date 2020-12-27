package com.digitalplanet.evaluation.alptekintalan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class AlptekintalanApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlptekintalanApplication.class, args);
	}

}

package com.example.calcule;

import com.example.calcule.service.CalculadoraService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CalculeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculeApplication.class, args);
		CalculadoraService calculadoraService = new CalculadoraService();
		System.out.println(calculadoraService.subtracao(4d, 5d));
	}

}

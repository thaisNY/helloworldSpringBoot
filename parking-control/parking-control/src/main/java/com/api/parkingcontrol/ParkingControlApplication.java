package com.api.parkingcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController //Classe do tipo controler
public class ParkingControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingControlApplication.class, args);
	}

	@GetMapping("/")//Mapeando um metodo get como a raiz
	public String index(){
		return "Ola Mundo!";
	}
}
//O apache servelet roteia as requisicoes que sao enviadas ao servidor ao respectivo controller
//que vai receber e/ou responder um dada solicitacao

package br.com.fiap.api_rest;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info =
@Info(title = "API de Produtos",
		version = "v1",
		description = "API RESTful de Produtos com Swagger e Validation",
		license = @License (name = "MIT"),
		contact = @Contact(name = "RM563065", email = "rm563065@fiap.com.br" )))
public class ApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestApplication.class, args);
	}

}

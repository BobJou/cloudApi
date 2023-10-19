package me.dio.cloudapi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import springfox.documentation.swagger2.annotations.EnableSwagger2;




@SpringBootApplication
@OpenAPIDefinition(servers = { @Server(url = "/",description = "Default URL")})
public class CloudapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudapiApplication.class, args);
	}

}

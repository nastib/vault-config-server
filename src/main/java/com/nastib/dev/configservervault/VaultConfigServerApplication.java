package com.nastib.dev.configservervault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigServer
@SpringBootApplication
public class VaultConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaultConfigServerApplication.class, args);
	}

	@GetMapping("/")
	String hello() {
		return "hello world !";
	}

}

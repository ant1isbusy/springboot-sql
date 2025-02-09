package com.antoine.footy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FootyApplication {

	public static void main(String[] args) {
		String port_str = System.getenv().getOrDefault("APP_PORT", "8010");
		System.setProperty("server.port", port_str);

		SpringApplication.run(FootyApplication.class, args);
		AppLogger.AppStartup(port_str);
	}

	@GetMapping("/Hello")
	public String hello(){
		return "Hello World";
	}

}

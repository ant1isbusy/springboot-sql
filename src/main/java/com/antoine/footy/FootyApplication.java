package com.antoine.footy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FootyApplication {

	public static void main(String[] args) {
		String port_str = System.getenv().getOrDefault("APP_PORT", "8010");
		System.setProperty("server.port", port_str);

		SpringApplication.run(FootyApplication.class, args);
		AppLogger.AppStartup(port_str);
	}



}

package com.inc.currencyconverterconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CurrencyConverterConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConverterConfigApplication.class, args);
	}

}

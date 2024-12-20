package com.client.Eureka_Client;

import com.client.Eureka_Client.entities.Client;
import com.client.Eureka_Client.repositories.ClientRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}

	@Bean
	CommandLineRunner initializeDatabase(ClientRepository clientRepository) {
		return args -> {
			clientRepository.save(new Client(null, "Chaimae Rouita", "chaimae123@example.com", "123456789"));
			clientRepository.save(new Client(null, "Yassine ZR", "yassine2235@example.com", "987654321"));
			clientRepository.save(new Client(null, "Latifa SAFT", "latifa@example.com", "112233445"));
		};
	}


}




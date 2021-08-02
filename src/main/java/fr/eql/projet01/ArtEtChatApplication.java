package fr.eql.projet01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ArtEtChatApplication {
	public static void main(String[] args) {
		SpringApplication.run(ArtEtChatApplication.class, args);
	}
}
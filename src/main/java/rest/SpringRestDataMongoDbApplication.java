package rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class SpringRestDataMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestDataMongoDbApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public WebClient.Builder getWebClientBuider(){
		return WebClient.builder();
	}
}

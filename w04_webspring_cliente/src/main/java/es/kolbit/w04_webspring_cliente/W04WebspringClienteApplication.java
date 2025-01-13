package es.kolbit.w04_webspring_cliente;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import es.kolbit.w04_webspring.dto.PersonaDto;

//@SpringBootApplication
//public class W04WebspringClienteApplication implements CommandLineRunner {
//
//	public static void main(String[] args) {
//		SpringApplication app = new SpringApplication(W04WebspringClienteApplication.class);
//		app.run(args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		RestTemplate templ = new RestTemplate();
//		PersonaDto[] personas = templ.getForObject("http://localhost:7070/personas", PersonaDto[].class);
//		for (PersonaDto personaDto : personas) {
//			System.out.println(personaDto);
//		}
//	}
//}

@SpringBootApplication
public class W04WebspringClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(W04WebspringClienteApplication.class, args);
	}

}

package es.kolbit.w04_webspring_cliente.cliente;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import es.kolbit.w04_webspring.dto.PersonaDto;

@RestController
public class ClienteRestPersona {

	@RequestMapping("/personas_cliente")
	public List<PersonaDto> listaPersonas(){
		RestTemplate templ = new RestTemplate();
		PersonaDto[] lista = templ.getForObject("http://webspring:7070/personas", PersonaDto[].class);
		return Arrays.asList(lista);
	}
}

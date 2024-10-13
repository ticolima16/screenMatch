package br.tiagobarboza.screenmatchV1;

import br.tiagobarboza.screenmatchV1.model.DadosSerie;
import br.tiagobarboza.screenmatchV1.principal.Principal;
import br.tiagobarboza.screenmatchV1.service.ConsumoAPI;
import br.tiagobarboza.screenmatchV1.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchV1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchV1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}

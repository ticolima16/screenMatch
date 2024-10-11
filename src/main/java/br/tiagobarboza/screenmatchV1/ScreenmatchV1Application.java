package br.tiagobarboza.screenmatchV1;

import br.tiagobarboza.screenmatchV1.service.ConsumoAPI;
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
		ConsumoAPI consumoAPI = new ConsumoAPI();
		var json = consumoAPI.obterDados("https://www.omdbapi.com/?i=tt3896198&apikey=ad102065");
		System.out.println(json);

	}
}

package br.tiagobarboza.screenmatchV1;

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
		System.out.println("Ola, MUNDO!");
	}
}

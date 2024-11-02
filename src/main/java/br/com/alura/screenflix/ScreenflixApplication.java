package br.com.alura.screenflix;

import br.com.alura.screenflix.model.DadosSerie;
import br.com.alura.screenflix.services.ConsumoApi;
import br.com.alura.screenflix.services.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenflixApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenflixApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Primeiro projeto spring sem web");

		var consumo = new ConsumoApi();
		var json = consumo.obterdados("http://www.omdbapi.com/?t=Gilmore+girls&apikey=49c65d63");

		System.out.println(json);

		ConverteDados converteDados = new ConverteDados();

		DadosSerie dados = converteDados.obterDados(json,DadosSerie.class);

		System.out.println(dados);
}}

package br.com.diego.openbank;

import br.com.diego.openbank.model.ClientFisic;
import br.com.diego.openbank.model.MovimentacionModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@SpringBootApplication
public class OpenbankApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenbankApplication.class, args);

		ClientFisic c1 = new ClientFisic("RAIMUNDO NONATO LOUREIRO CASTELO BRANCO", "333.333.222-89");

		MovimentacionModel m1 = new MovimentacionModel();
		m1.setCliente(c1);
		m1.setDate(LocalDateTime.now());
		m1.setValor(200.0);
		m1.setTipoMov(TipoMov.DESPESA);
		m1.setEstornado(false);

		System.out.println(m1.toString());

	}

}

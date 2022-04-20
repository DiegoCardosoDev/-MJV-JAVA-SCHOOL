package br.com.diego.openbank;

import br.com.diego.openbank.model.Cliente;
import br.com.diego.openbank.model.MovimentacionModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@SpringBootApplication
public class OpenbankApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(OpenbankApplication.class, args);

		Cliente c1 = new Cliente("RAIMUNDO NONATO LOUREIRO CASTELO BRANCO","135.217.791-18");

		MovimentacionModel m1 = new MovimentacionModel();
		m1.setCliente(c1);
		m1.setDate(LocalDateTime.now());
		m1.setValor(200.0);
		m1.setTipoMov(TipoMov.DESPESA);
		m1.setEstornado(false);



		FileWriter arq = new FileWriter("/home/diegocardosodev/workstation/MJV-SCHOOL/PowerClasses/banco_central/movimentacoes/movimentacao.txt\n");
		PrintWriter save = new PrintWriter(arq);
		save.printf(m1.toString());
		save.close();

		System.out.println(m1.toString());


	}

}

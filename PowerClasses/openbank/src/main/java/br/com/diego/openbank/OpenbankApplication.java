package br.com.diego.openbank;
/**
 * @descrição
 * classe reponsável por rodar a aplicação
 */

import br.com.diego.openbank.model.Andress;
import br.com.diego.openbank.model.ClientModel;
import br.com.diego.openbank.model.MovimentacionModel;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class OpenbankApplication {


    public static void main(String[] args) throws IOException, CsvRequiredFieldEmptyException, CsvDataTypeMismatchException {
		SpringApplication.run(OpenbankApplication.class, args);

        /*instanciado objeto endereço*/
        Andress andress1 = new Andress("R.Capital 151, santo amaro,Sp");
		/*instanciado objeto cleinte*/
		ClientModel c1 = new ClientModel("RAIMUNDO NONATO LOUREIRO CASTELO BRANCO","135.217.791-18", andress1);

		/*instacia do objeto movimentações*/
		MovimentacionModel m1 = new MovimentacionModel();
		m1.setCliente(c1);
		m1.setDate(LocalDateTime.now());
		m1.setValor(200.0);
		m1.setTipoMov(TipoMov.DESPESA);
		m1.setEstornado(false);

		/*escrever e gerar o arquivo txt no caminho*/
        System.out.println("escrendo txt...");
		FileWriter arq = new FileWriter("/home/diegocardosodev/workstation/MJV-SCHOOL/PowerClasses/banco_central/movimentacoes/movimentacao.txt\n");
		PrintWriter save = new PrintWriter(arq);
		save.printf(m1.toString());
		save.close();

        System.out.println("escrendo csv..");
        Writer writer = Files.newBufferedWriter(Paths.get("/home/diegocardosodev/workstation/MJV-SCHOOL/PowerClasses/banco_central/movimentacoes/movimentacao.csv"));
        StatefulBeanToCsv<MovimentacionModel> beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
        beanToCsv.write(m1);
        writer.flush();
        writer.close();

		/*print no console*/
		System.out.println(m1.toString());


	}

}

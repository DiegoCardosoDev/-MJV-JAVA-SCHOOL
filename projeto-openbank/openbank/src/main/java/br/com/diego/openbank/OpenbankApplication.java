package br.com.diego.openbank;
/**
 * @descrição
 * classe reponsável por rodar a aplicação
 */

import br.com.diego.openbank.enums.TypeMov;
import br.com.diego.openbank.models.ClientModel;
import br.com.diego.openbank.generators.ContentGenerator;
import br.com.diego.openbank.generators.FileGenerator;
import br.com.diego.openbank.models.MovimentacionModel;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;


import java.io.*;
import java.time.LocalDateTime;


public class OpenbankApplication {


    public static void main(String[] args) throws IOException, CsvRequiredFieldEmptyException, CsvDataTypeMismatchException {

		ClientModel c1 = new ClientModel("RAIMUNDO NONATO LOUREIRO CASTELO BRANCO", "135.217.791-18");

		MovimentacionModel  m1 = new MovimentacionModel();
		m1.setDate(LocalDateTime.now());
		m1.setClientModel(c1);
		m1.setValue(1275.48);
		m1.setTipoMov(TypeMov.RECEITA);
		m1.setReversed(Boolean.FALSE);

		ContentGenerator contentGenerator = new ContentGenerator();
		String content = contentGenerator.generator(m1,c1);

		FileGenerator fileGenerator = new FileGenerator();
		fileGenerator.whriter(content);



	}

}

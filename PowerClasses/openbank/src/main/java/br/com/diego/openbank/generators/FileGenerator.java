package br.com.diego.openbank.generators;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class FileGenerator {

    public void whriter(String content){


        LocalDate now = LocalDate.now();
        String nomeArquivo = now.toString() + "_movimentacao.txt";
        try {
            File diretorio = new File(
                    "/home/diego-cardoso/Documentos/WORKSPACE/MJV-JAVA-SCHOOL/PowerClasses/banco_central/movimentacoes\n");
            if (!diretorio.exists())
                diretorio.mkdirs();

            Path path = Paths.get(diretorio.getAbsolutePath(), nomeArquivo);

            Files.write(path, content.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}

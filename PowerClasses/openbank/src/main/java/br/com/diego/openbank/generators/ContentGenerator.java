package br.com.diego.openbank.generators;

import br.com.diego.openbank.model.ClientModel;
import br.com.diego.openbank.model.MovimentacionModel;

public class ContentGenerator {


    public String generator(MovimentacionModel movimentacionModel, ClientModel clientModel ){

        StringBuilder sb = new StringBuilder();
        sb.append(movimentacionModel.getDate().toString().replaceAll("-", ""));

        String cpfCnpj = clientModel.getCpfCnpj().replaceAll("[\\D]", "");
        Long cpfCnpjLong = Long.valueOf(cpfCnpj);
        String cpfCnpjFormatado = String.format("%014d", cpfCnpjLong);
        sb.append(cpfCnpjFormatado);

        String name = clientModel.getName();
        if (name.length()>=30){
            sb.append(name.substring(0,30));

        }else {
            sb.append(String.format("%-29s", name));
        }

        sb.append(String.format("%010d", Long.valueOf(movimentacionModel.getValor().toString().replaceAll("[\\D]", ""))));
        sb.append(movimentacionModel.getTipoMov());

        if (movimentacionModel.getEstornado()){
            sb.append("1");

        }else {
            sb.append("0");
        }

        return sb.toString();




    }
}

package br.com.diego.agualuz.services;

import br.com.diego.agualuz.models.Cliente;
import br.com.diego.agualuz.models.Contrato;
import br.com.diego.agualuz.utils.Formatador;

public class GeraradorMsg {

    public void gerarMsg(Contrato contrato){

        StringBuilder sb = new StringBuilder();

       Cliente cliente = contrato.getCliente();
       String cpfFormater = Formatador.formater(cliente.getCpf());
        sb.append(String.format("senhor(a) %s cpf de Numero %s, ", cliente.getNome(), cpfFormater));
        sb.append(String.format("Informamos que conforme contrato com protocolo de númemro  %d ", contrato.getProtocolo()));
        System.out.println(sb.toString());
    }
}

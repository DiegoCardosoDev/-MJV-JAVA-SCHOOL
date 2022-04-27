package br.com.diego.agualuz;

import br.com.diego.agualuz.models.Cliente;
import br.com.diego.agualuz.models.Contrato;
import br.com.diego.agualuz.models.Endrereco;
import br.com.diego.agualuz.models.GeraradorMsg;


import java.time.LocalDateTime;

public class AguaLuzApplication {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		Endrereco endrereco = new Endrereco();
		Contrato contrato1 = new Contrato();

		contrato1.setDataHora(LocalDateTime.of(2022, 2, 21,16, 0));
		contrato1.setProtocolo(20222025687L);
		contrato1.setServico("Agua");
		contrato1.setValor(127.33);
		contrato1.setCliente(cliente);



		cliente.setNome("Gleyson Sampaio");
		cliente.setCpf("23476598727");
		cliente.setEndrereco(endrereco);


		endrereco.setCidade("São paulo - Sp");
		endrereco.setEstado("SP");
		endrereco.setBairro("Santo Antônio");
		endrereco.setRua("Rua das marias");
		endrereco.setNumero("243");
		endrereco.setComplemento("Bloco C");
		endrereco.setCep("27310657");

		GeraradorMsg  geraradorMsg = new GeraradorMsg();
		geraradorMsg.gerarMsg(contrato1);




	}

}

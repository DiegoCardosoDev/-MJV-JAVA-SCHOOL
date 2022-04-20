package br.com.diego.openbank.model;

public class ClientJuridic extends Cliente{

    private String name;
    private String cnpj;

    public ClientJuridic(String name, String cnpj) {
        this.name = name;
        this.cnpj = cnpj;
    }

    public ClientJuridic() {
    }
}

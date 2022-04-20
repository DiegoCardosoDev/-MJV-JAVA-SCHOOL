package br.com.diego.openbank.model;

public class ClientFisic extends Cliente{

    private String name;
    private String cpf;

    public ClientFisic(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public ClientFisic() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

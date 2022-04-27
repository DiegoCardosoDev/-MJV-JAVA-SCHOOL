package br.com.diego.openbank.models;

public class ClientModel {


    private String name;
    private  String cpfCnpj;
    Andress andress;

    public ClientModel(String name, String cpfCnpj) {
        this.name = name;
        this.cpfCnpj = cpfCnpj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Andress getAndress() {
        return andress;
    }

    public void setAndress(Andress andress) {
        andress = andress;
    }
}

package br.com.diego.openbank.model;
/*calsse do modelo cliente*/
public class ClientModel {

    /*atributos encapsulados*/
    private String name;
    private  String cpfCnpj;
    Andress andress;

    /*construtores*/
    public ClientModel(String name, String cpfCnpj, Andress andress) {
        this.name = name;
        this.cpfCnpj = cpfCnpj;
        this.andress = andress;
    }

    /*getters e setters*/
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
        this.andress = andress;
    }
}

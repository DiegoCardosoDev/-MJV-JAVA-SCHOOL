package models;

public class Person {
    private String name;
    private String cpf;
    private String endereco;

    /*constrututores*/
    public Person(String name, String cpf, String endereco) {
        this.name = name;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public Person() {
    }

    /*getters e setters*/
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /*metodo to string*/
    @Override
    public String toString() {
        return "Person[" +
                "name:'" + name + '\'' +
                ", cpf:'" + cpf + '\'' +
                ", endereco:'" + endereco + '\'' +
                ']';
    }
}

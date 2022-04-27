package br.com.diego.agualuz.models;

public class Cliente {

    private  String nome;
    private  String cpf;
    Endrereco  endrereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endrereco getEndrereco() {
        return endrereco;
    }

    public void setEndrereco(Endrereco endrereco) {
        this.endrereco = endrereco;
    }
}

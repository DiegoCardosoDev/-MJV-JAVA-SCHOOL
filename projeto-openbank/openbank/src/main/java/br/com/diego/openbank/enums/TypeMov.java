package br.com.diego.openbank.enums;

public enum TypeMov {

    RECEITA("R"),
    DESPESA("D");

    /*declaração do enum*/
    private final String type;
    /*construtor do enum*/
    TypeMov(String type) {
        this.type = type;
    }

    /*get para os enuns*/
    public String getType(){
        return this.type;
    }
}

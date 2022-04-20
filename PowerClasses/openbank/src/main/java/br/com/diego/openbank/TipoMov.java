package br.com.diego.openbank;

public enum TipoMov {

    RECEITA("R"),
    DESPESA("D");

    private final String type;
    TipoMov(String type) {
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}

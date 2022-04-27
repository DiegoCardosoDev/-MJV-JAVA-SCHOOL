package br.com.diego.agualuz.enums;

public enum TipoServico {

    AGUA("ÁGUA"),
    LUZ("LUZ");

    private final String tipoServico;

    TipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getTipoServico() {
        return tipoServico;
    }
}

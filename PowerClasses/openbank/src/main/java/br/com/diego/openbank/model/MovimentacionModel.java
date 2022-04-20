package br.com.diego.openbank.model;

import br.com.diego.openbank.TipoMov;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MovimentacionModel {

    private LocalDateTime date;
    private Boolean estornado;
    private Double valor;
    TipoMov tipoMov;
    ClientModel clientModel;

    public MovimentacionModel(ClientModel clientModel) {
        this.clientModel = clientModel;
    }

    public MovimentacionModel() {
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Boolean getEstornado() {
        return estornado;
    }

    public void setEstornado(Boolean estornado) {
        this.estornado = estornado;
    }

    public TipoMov getTipoMov() {
        return tipoMov;
    }

    public void setTipoMov(TipoMov tipoMov) {
        this.tipoMov = tipoMov;
    }

    public ClientModel getCliente() {
        return clientModel;
    }

    public void setCliente(ClientModel clientModel) {
        this.clientModel = clientModel;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    /*FORMATAÇÃO DE DATA PADRÃO PORTUGUES BR*/
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter
            .ofPattern("yyyyMMdd", new Locale("PT", "br"));



    @Override
    public String toString() {
        return
                date.format(dateTimeFormatter)+";"+ clientModel.getCpfCnpj() + ";" + clientModel.getName() + ";" + valor + ";" + tipoMov.getType() + ";"+ estornado
               ;
    }
}

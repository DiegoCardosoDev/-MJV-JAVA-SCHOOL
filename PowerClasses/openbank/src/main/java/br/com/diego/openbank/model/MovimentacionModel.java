package br.com.diego.openbank.model;

import br.com.diego.openbank.TypeMov;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MovimentacionModel {

    private LocalDateTime date;
    private Boolean estornado;
    private Double valor;
    TypeMov typeMov;
    ClientModel clientModel;

    public MovimentacionModel(LocalDateTime date, Boolean estornado, Double valor, TypeMov typeMov, ClientModel clientModel) {
        this.date = date;
        this.estornado = estornado;
        this.valor = valor;
        this.typeMov = typeMov;
        clientModel = clientModel;

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

    public TypeMov getTipoMov() {
        return typeMov;
    }

    public void setTipoMov(TypeMov typeMov) {
        this.typeMov = typeMov;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public ClientModel getClientModel() {
        return clientModel;
    }

    public void setClientModel(ClientModel clientModel) {
        this.clientModel = clientModel;
    }

    /*FORMATAÇÃO DE DATA PADRÃO PORTUGUES BR*/
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter
            .ofPattern("yyyyMMdd", new Locale("PT", "br"));




}

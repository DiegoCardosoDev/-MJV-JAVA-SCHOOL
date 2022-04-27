package br.com.diego.openbank.models;

import br.com.diego.openbank.enums.TypeMov;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MovimentacionModel {

    private LocalDateTime date;
    private Boolean reversed;
    private Double value;
    TypeMov typeMov;
    ClientModel clientModel;

    public MovimentacionModel(LocalDateTime date, Boolean reversed, Double value, TypeMov typeMov, ClientModel clientModel) {
        this.date = date;
        this.reversed = reversed;
        this.value = value;
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

    public Boolean getReversed() {
            return reversed;
    }

    public void setReversed(Boolean reversed) {
        this.reversed = reversed;
    }

    public TypeMov getTipoMov() {
        return typeMov;
    }

    public void setTipoMov(TypeMov typeMov) {
        this.typeMov = typeMov;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
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

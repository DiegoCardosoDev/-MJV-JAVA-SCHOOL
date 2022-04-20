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
    Cliente  cliente;

    public MovimentacionModel(Cliente cliente) {
        this.cliente = cliente;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    /*FORMATAÇÃO DE DATA PADRÃO PORTUGUES BR*/
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter
            .ofPattern("dd/MM/yyyy HH:mm:ss", new Locale("PT", "br"));
    @Override
    public String toString() {
        return "MovimentacionModel{" +
                "date=" + date.format(dateTimeFormatter) +
                ", estornado=" + estornado +
                ", valor=" + valor +
                ", tipoMov=" + tipoMov +
                ", cliente=" + cliente.getName()  +
                '}';
    }
}

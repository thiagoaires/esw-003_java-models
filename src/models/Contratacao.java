package models;

import java.util.Date;

public class Contratacao {
    private double valor;
    private Date dataContratacao;
    private Pacote pacote;
    public Contratacao(double valor, Date dataContratacao, Pacote pacote) {
        this.valor = valor;
        this.dataContratacao = dataContratacao;
        this.pacote = pacote;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public Pacote getPacote() {
        return pacote;
    }

    public void setPacote(Pacote pacote) {
        this.pacote = pacote;
    }

}

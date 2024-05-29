package models;

import java.util.Date;

public class Cliente {

    private String nome;
    private Date dataNascimento;
    private Contratacao contratacao;

    public Cliente(String nome, Date dataNascimento, Contratacao contratacao) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.contratacao = contratacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Contratacao getContratacao() {
        return contratacao;
    }

    public void setContratacao(Contratacao contratacao) {
        this.contratacao = contratacao;
    }



}


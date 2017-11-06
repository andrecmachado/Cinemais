package com.example.cinemais.model;

import java.io.Serializable;

public class Filme implements Serializable{

    private String nome;
    private String descricao;
    private String cinema;
    private int imagem;

    public Filme () {}

    public Filme (String nome, String descricao, /*String cinema,*/ int imagem) {
        this.nome = nome;
        this.descricao = descricao;
        /*this.cinema = cinema;*/
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCinema() {
        return cinema;
    }

    public void setCinema(String cinema) {
        this.cinema = cinema;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
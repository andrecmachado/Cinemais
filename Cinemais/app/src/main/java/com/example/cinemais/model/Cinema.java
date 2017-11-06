package com.example.cinemais.model;


import java.io.Serializable;

public class Cinema implements Serializable {

    private String nome;
    private double longitude;
    private double latitude;

    public Cinema () {}

    public Cinema (String nome, double longitude, double latitude) {
        this.nome = nome;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }
}

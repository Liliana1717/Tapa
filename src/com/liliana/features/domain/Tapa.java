package com.liliana.features.domain;

public class Tapa {

    private static String nombre;
    private String establecimiento;
    private String totalpuntos;
    private String mediavotos;
    private String numeroparticipantes;
    private String ingredientes;
    private String totalvotos;


    public Tapa(String nombre, String establecimiento, String totalpuntos, String mediavotos, String numeroparticipantes, String ingredientes, String totalvotos) {
        this.nombre = nombre;
        this.establecimiento = establecimiento;
        this.totalpuntos = totalpuntos;
        this.mediavotos = mediavotos;
        this.numeroparticipantes = numeroparticipantes;
        this.ingredientes = ingredientes;
        this.totalvotos = totalvotos;
    }

    public static String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getTotalpuntos() {
        return totalpuntos;
    }

    public void setTotalpuntos(String totalpuntos) {
        this.totalpuntos = totalpuntos;
    }

    public String getMediavotos() {
        return mediavotos;
    }

    public void setMediavotos(String mediavotos) {
        this.mediavotos = mediavotos;
    }

    public String getNumeroparticipantes() {
        return numeroparticipantes;
    }

    public void setNumeroparticipantes(String numeroparticipantes) {
        this.numeroparticipantes = numeroparticipantes;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getTotalvotos() {
        return totalvotos;
    }

    public void setTotalvotos(String totalvotos) {
        this.totalvotos = totalvotos;
    }
}








package com.lanzamientomd.lanzamiento.models;

public class Moneda {
    private String resultado;

    public String lanzar() {
        double randomValue = Math.random();
        if (randomValue < 0.5) {
            resultado = "cara";
        } else {
            resultado = "cruz";
        }
        return resultado;
    }


    public String getResultado() {
        return resultado;
    }
}
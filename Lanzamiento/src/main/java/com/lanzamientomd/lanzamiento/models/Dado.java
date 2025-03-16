package com.lanzamientomd.lanzamiento.models;

public class Dado {
    private int resultado;

    public int lanzar() {
        resultado = (int) (Math.random() * 6) + 1;
        return resultado;
    }

    public int getResultado() {
        return resultado;
    }
}
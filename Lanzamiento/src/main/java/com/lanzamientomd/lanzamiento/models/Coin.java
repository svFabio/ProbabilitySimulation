package com.lanzamientomd.lanzamiento.models;

public class Coin {
    private String result;

    public String flip() {
        result = (Math.random() < 0.5) ? "Cara" : "Cruz";
        return result;
    }

    public String getResult() {
        return result;
    }
}
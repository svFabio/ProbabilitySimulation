package com.lanzamientomd.lanzamiento.models;

public class Dice {
    private int result;

    public int roll() {
        result = (int) (Math.random() * 6) + 1;
        return result;
    }

    public int getResult() {
        return result;
    }
}
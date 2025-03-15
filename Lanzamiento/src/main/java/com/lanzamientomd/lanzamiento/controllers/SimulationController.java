package com.lanzamientomd.lanzamiento.controllers;

import com.lanzamientomd.lanzamiento.models.Coin;
import com.lanzamientomd.lanzamiento.models.Dice;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SimulationController {
    @FXML private Label coinResult1;
    @FXML private Label coinResult2;
    @FXML private Label coinProbability;
    @FXML private Label diceResult1;
    @FXML private Label diceResult2;
    @FXML private Label diceProbability;

    private Coin coin1 = new Coin();
    private Coin coin2 = new Coin();
    private Dice dice1 = new Dice();
    private Dice dice2 = new Dice();

    @FXML
    private void handleCoinFlip() {
        coinResult1.setText("Moneda 1: " + coin1.flip());
        coinResult2.setText("Moneda 2: " + coin2.flip());

        // Calcular probabilidad de que ambas monedas sean iguales
        if (coin1.getResult().equals(coin2.getResult())) {
            coinProbability.setText("Probabilidad: 25% (ambas iguales)");
        } else {
            coinProbability.setText("Probabilidad: 50% (distintas)");
        }
    }

    @FXML
    private void handleDiceRoll() {
        diceResult1.setText("Dado 1: " + dice1.roll());
        diceResult2.setText("Dado 2: " + dice2.roll());

        // Calcular probabilidad de que la suma sea 7
        int sum = dice1.getResult() + dice2.getResult();
        if (sum == 7) {
            diceProbability.setText("Probabilidad: 16.67% (suma 7)");
        } else {
            diceProbability.setText("Probabilidad: " + (1.0 / 6 * 100) + "% (suma " + sum + ")");
        }
    }
}
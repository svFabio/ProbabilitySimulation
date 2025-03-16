package com.lanzamientomd.lanzamiento.controllers;

import com.lanzamientomd.lanzamiento.models.Moneda;
import com.lanzamientomd.lanzamiento.models.Dado;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

public class ControladorSimulacion {
    @FXML private ImageView imagenMoneda1;
    @FXML private ImageView imagenMoneda2;
    @FXML private ImageView imagenDado1;
    @FXML private ImageView imagenDado2;
    @FXML private Label etiquetaProbabilidadMonedas;
    @FXML private Label etiquetaTirosMonedas;
    @FXML private Label etiquetaProbabilidadDados;
    @FXML private Label etiquetaTirosDados;

    private Moneda moneda1 = new Moneda();
    private Moneda moneda2 = new Moneda();
    private Dado dado1 = new Dado();
    private Dado dado2 = new Dado();

    private int tirosMonedas = 0;
    private int aciertosMonedas = 0;
    private int tirosDados = 0;
    private int aciertosDados = 0;

    @FXML
    private void manejarLanzamientoMonedas() {
        moneda1.lanzar();
        moneda2.lanzar();

        imagenMoneda1.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream(
                "/images/" + moneda1.getResultado().toLowerCase() + ".jpg"
        ))));
        imagenMoneda2.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream(
                "/images/" + moneda2.getResultado().toLowerCase() + ".jpg"
        ))));

        tirosMonedas++;
        if (moneda1.getResultado().equals(moneda2.getResultado())) {
            aciertosMonedas++;
        }

        double probabilidadMonedas = (double) aciertosMonedas / tirosMonedas * 100;
        etiquetaProbabilidadMonedas.setText(String.format("Probabilidad acumulada de que ambas monedas sean iguales: %.2f%%", probabilidadMonedas));

        etiquetaTirosMonedas.setText("Tiros de monedas: " + tirosMonedas);
    }

    @FXML
    private void manejarLanzamientoDados() {

        dado1.lanzar();
        dado2.lanzar();

        imagenDado1.setImage(new Image(getClass().getResourceAsStream(
                "/images/dado" + dado1.getResultado() + ".jpg"
        )));
        imagenDado2.setImage(new Image(getClass().getResourceAsStream(
                "/images/dado" + dado2.getResultado() + ".jpg"
        )));

        tirosDados++;
        if (dado1.getResultado() == dado2.getResultado()) {
            aciertosDados++;
        }

        double probabilidadDados = (double) aciertosDados / tirosDados * 100;
        etiquetaProbabilidadDados.setText(String.format("Probabilidad acumulada de que ambos dados sean iguales: %.2f%%", probabilidadDados));

        etiquetaTirosDados.setText("Tiros de dados: " + tirosDados);
    }
}

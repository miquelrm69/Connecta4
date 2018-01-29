/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;

/**
 *
 * @author Miquel
 */
public class Jugador {
    private final int MAX_FITXES = 21;
    private String nomJugador;
    private String simbolJugador;
    private int countFitxes = MAX_FITXES;
    private int jugadorType;

    public Jugador(String nom, Fitxa fitxaJugador) {
        if (nom != null && nom != "" && fitxaJugador.getSimbol() != null && fitxaJugador.getSimbol() != "") {
            nomJugador = nom;
            simbolJugador = fitxaJugador.getSimbol();
            if (simbolJugador == "X") {
                jugadorType = 1;
            } else {
                jugadorType = 2;
            }
        }
    }

    public int getJugadorType() {
        return jugadorType;
    }

    public void setSimbolJugador(String simbolJugador) {
        this.simbolJugador = simbolJugador;
    }

    public String getSimbolJugador() {
        return simbolJugador;
    }

    public String getNomJugador() {
        return nomJugador;
    }
}

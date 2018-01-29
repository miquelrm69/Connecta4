package main;

import java.awt.Color;

public class Fitxa {

    private String simbol;

    public Fitxa(String simbol) {
        if (simbol != null) {
            this.simbol = simbol;
        }
    }

    public void setSimbol(String simbol) {
        this.simbol = simbol;
    }

    public String getSimbol() {
        return simbol;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Miquel
 */
public class Taulell {
    private static int[][] gridTaulell;
    private String nomTaulell;
    private int files, columnes;
    public Taulell(String nomTaulell) throws IllegalStateException {
        if (nomTaulell != "" & nomTaulell != null) {
            this.nomTaulell = nomTaulell;
            files = 6;
            columnes = 7;
            gridTaulell =  new int[files][columnes];
            if (!setTaulellEmpty()) {
                throw new IllegalStateException("No s'ha pogut establir a 0 el Taulell");
            }
        }
    }

    private int comprovaLlocBuid(int columna) {
        for (int f = gridTaulell.length - 1; f >= 0; f--) {
            if (gridTaulell[f][columna] == 0) {
                return f;
            }
        }
        return -1;
    }

    private static boolean checkColumnaBuida(int columna) {
        boolean isEmpty = true;
        for (int f = gridTaulell.length - 1; f >= 0; f--) {
            if (gridTaulell[f][columna] == 0) {
                isEmpty = true;
            } else {
                isEmpty = false;
            }
        }
        return isEmpty;
    }

    public boolean insertaFitxa(char lletraColumna, Jugador jugador) {
        int fila;
        lletraColumna = Character.toUpperCase(lletraColumna);
        switch (lletraColumna) {
            case 'A':
                fila = comprovaLlocBuid(0);
                if (fila != -1 && checkColumnaBuida(0) ) {
                    gridTaulell[fila][0] = jugador.getJugadorType();
                    return true;
                }
                break;
            case 'B':
                fila = comprovaLlocBuid(1);
                if (fila != -1 && checkColumnaBuida(1)) {
                    gridTaulell[fila][1] = jugador.getJugadorType();
                    return true;
                }
                break;
            case 'C':
                fila = comprovaLlocBuid(2);
                if (fila != -1 && checkColumnaBuida(2)) {
                    gridTaulell[fila][2] = jugador.getJugadorType();
                    return true;
                }
                break;
            case 'D':
                fila = comprovaLlocBuid(3);
                if (fila != -1 && checkColumnaBuida(3)) {
                    gridTaulell[fila][3] = jugador.getJugadorType();
                    return true;
                }
                break;
            case 'E':
                fila = comprovaLlocBuid(4);
                if (fila != -1 && checkColumnaBuida(4)) {
                    gridTaulell[fila][4] = jugador.getJugadorType();
                    return true;
                }
                break;
            case 'F':
                fila = comprovaLlocBuid(5);
                if (fila != -1 && checkColumnaBuida(5)) {
                    gridTaulell[fila][5] = jugador.getJugadorType();
                    return true;
                }
                break;
            case 'G':
                fila = comprovaLlocBuid(6);
                if (fila != -1 && checkColumnaBuida(6)) {
                    gridTaulell[fila][6] = jugador.getJugadorType();
                    return true;
                }
                break;
        }
        return false;
    }

    public int[][] getGridTaulell() {
        return gridTaulell;
    }

    public void showNumericTaulell() {
        for (int f = 0; f < gridTaulell.length; f++) {
            for (int c = 0; c < gridTaulell[0].length; c++) {
                System.out.print(gridTaulell[f][c] + " ");
            }
        }
    }

    private boolean setTaulellEmpty() {
        for (int f = 0; f < gridTaulell.length; f++) {
            for (int c = 0; c < gridTaulell[0].length; c++) {
                gridTaulell[f][c] = 0;
                if (gridTaulell[f][c] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public int getFiles() {
        return files;
    }

    public int getColumnes() {
        return columnes;
    }

    public String getNomTaulell() {
        return nomTaulell;
    }

}

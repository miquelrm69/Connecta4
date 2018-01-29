package main;

public class checkGuanyador {

    private static int[][] gridTaulell;
    private static int countPlayer1, countPlayer2;

    public static boolean comprovaQuatreEnLinea(Taulell taulell) {
        gridTaulell = taulell.getGridTaulell();
        if (comprovaHoritzontal()) {
            return true;
        } else if (comprovaVertical()) {
            return true;
        } else if (comprovaDiagonalEsquerra()){
            return true;
        } else {
            return false;
        }
    }

    private static boolean comprovaHoritzontal() {
        countPlayer1 = 0;
        countPlayer2 = 0;
        for (int f = 0; f < gridTaulell.length; f++) {
            for (int c = 0; c < gridTaulell[0].length; c++) {
                if (gridTaulell[f][c] == 1) {
                    countPlayer2 = 0;
                    countPlayer1++;
                    if (countPlayer1 >= 4) {
                        return true;
                    }
                } else if (gridTaulell[f][c] == 2) {
                    countPlayer1 = 0;
                    countPlayer2++;
                    if (countPlayer2 >= 4) {
                        return true;
                    }
                } else if (gridTaulell[f][c] == 0) {
                    countPlayer2 = 0;
                    countPlayer1 = 0;
                }
            }
        }
        return false;
    }

    private static boolean comprovaVertical() {
        countPlayer1 = 0;
        countPlayer2 = 0;
        for (int c = 0; c < gridTaulell[0].length; c++) {
            for (int f = 0; f < gridTaulell.length; f++) {
                if (gridTaulell[f][c] == 1) {
                    countPlayer2 = 0;
                    countPlayer1++;
                    if (countPlayer1 >= 4) {
                        return true;
                    }
                } else if (gridTaulell[f][c] == 2) {
                    countPlayer1 = 0;
                    countPlayer2++;
                    if (countPlayer2 >= 4) {
                        return true;
                    }
                } else if (gridTaulell[f][c] == 0) {
                    countPlayer2 = 0;
                    countPlayer1 = 0;
                }
            }
        }
        return false;
    }

    private static boolean comprovaDiagonalEsquerra() {
        for (int c = 0; c < 4; c++) {
            countPlayer1 = 0;
            countPlayer2 = 0;
            for (int i = c; i <= 4; i++) {
                if (gridTaulell[c][i] == 0) {
                    break;
                } else if (gridTaulell[c][i] == 1) {
                    countPlayer1++;
                    if (countPlayer1 == 4) {
                        return true;
                    }
                } else if (gridTaulell[c][i] == 2) {
                    countPlayer2++;
                    if (countPlayer2 == 4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

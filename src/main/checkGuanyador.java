package main;

public class checkGuanyador {

    private static int[][] gridTaulell;
    private static int countPlayer1, countPlayer2;

    public static boolean comprovaQuatreEnLinea(Taulell taulell) { //Se pot millorar amb una unica sentencia IF????
        gridTaulell = taulell.getGridTaulell();
        if (comprovaHoritzontal()) {
            return true;
        } else if (comprovaVertical()) {
            return true;
        } else if (comprovaDiagonalEsquerra()){
            return true;
        } else if (comprovaDiagonalDreta()) {
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
                /*if (checkPosition(f, c)) {
                    return true;
                }*/
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
                /*if (checkPosition(f, c)) {
                    return true;
                }*/
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

    private static boolean comprovaDiagonalDreta() {
        for (int c = gridTaulell[0].length - 1; c >= 0; c--) {
            for (int f = 0; f < 4; f++) {
                for (int check = 0; check < 4; check++) {
                    if (f + check <= 5 && c - check >= 0) {
                        /*if (!checkPosition((f + check), (c - check))) {
                            break;
                        }
                        return true;*/
                        if (gridTaulell[f + check][c - check] == 0) {
                            countPlayer1 = 0;
                            countPlayer2 = 0;
                            break;
                        } else if (gridTaulell[f + check][c - check] == 1) {
                            countPlayer2 = 0;
                            countPlayer1++;
                            if (countPlayer1 == 4) {
                                return true;
                            }
                        } else if (gridTaulell[f + check][c - check] == 2) {
                            countPlayer1 = 0;
                            countPlayer2++;
                            if (countPlayer2 == 4) {
                                return true;
                            }
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        return false;
    }

    private static boolean comprovaDiagonalEsquerra() {
        for (int c = 0; c < 4; c++) {
           for (int f = 0; f < 3; f++) {
               for (int check = 0; check < 4; check++) {
                   if (f + check <= 5 && c + check <= 6) {
                       /*if (!checkPosition((f + check), (c + check))) {
                           break;
                       }
                       return true;*/
                       if (gridTaulell[f + check][c + check] == 0) {
                           countPlayer1 = 0;
                           countPlayer2 = 0;
                           break;
                       } else if (gridTaulell[f + check][c + check] == 1) {
                           countPlayer2 = 0;
                           countPlayer1++;
                           if (countPlayer1 == 4) {
                               return true;
                           }
                       } else if (gridTaulell[f + check][c + check] == 2) {
                           countPlayer1 = 0;
                           countPlayer2++;
                           if (countPlayer2 == 4) {
                               return true;
                           }
                       }
                   } else {
                       break;
                   }
               }
           }
        }
        return false;
    }

    /*private static boolean checkPosition(int f, int c) {
        if (gridTaulell[f][c] == 0) {
            countPlayer1 = 0;
            countPlayer2 = 0;
        } else if (gridTaulell[f][c] == 1) {
            countPlayer2 = 0;
            countPlayer1++;
            if (countPlayer1 == 4) {
                return true;
            }
        } else if (gridTaulell[f][c] == 2) {
            countPlayer1 = 0;
            countPlayer2++;
            if (countPlayer2 == 4) {
                return true;
            }
        }
        return false; //ESTA MALAMENT
    }*/
}

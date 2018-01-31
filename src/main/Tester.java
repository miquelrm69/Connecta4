package main;

public class Tester {
    public static void main(String[] args) {
        Taulell taulell = new Taulell("Prova");
        Fitxa fJugador1 = new Fitxa("Y");
        System.out.println(fJugador1.getSimbol());
        Jugador jugador1 = new Jugador("Miquel", fJugador1);
        System.out.println(jugador1.getJugadorType());
        int[][] testT = taulell.getGridTaulell();
        testT[5][2] = 1;
        testT[5][3] = 1;
        testT[4][2] = 1;
        testT[5][4] = 1;
        testT[5][5] = 1;
        testT[4][4] = 1;
        testT[3][3] = 1;
        testT[5][0] = 2;
        testT[4][0] = 2;
        testT[4][1] = 2;
        testT[5][3] = 2;
        testT[4][3] = 2;
        testT[5][1] = 1;
        testT[2][4] = 1;
        PrintTaulell.showTaulell(taulell);
        System.out.println("Guanyador: " + checkGuanyador.comprovaQuatreEnLinea(taulell));
    }
}

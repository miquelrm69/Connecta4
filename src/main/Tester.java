package main;

public class Tester {
    public static void main(String[] args) {
        Taulell taulell = new Taulell("Prova");
        Fitxa fJugador1 = new Fitxa("Y");
        System.out.println(fJugador1.getSimbol());
        Jugador jugador1 = new Jugador("Miquel", fJugador1);
        System.out.println(jugador1.getJugadorType());
        int[][] testT = taulell.getGridTaulell();
        testT[0][0] = 1;
        testT[1][1] = 1;
        testT[2][2] = 1;
        testT[3][3] = 1;
        PrintTaulell.showTaulell(taulell);
        System.out.println("Guanyador: " + checkGuanyador.comprovaQuatreEnLinea(taulell));
    }
}

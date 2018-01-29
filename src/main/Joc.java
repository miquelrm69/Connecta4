package main;

import java.util.Scanner;

public class Joc {

    public static Scanner input = new Scanner(System.in);
    private static Jugador jugador_1, jugador_2;
    private static Fitxa fJ1 = new Fitxa("X"), fJ2 = new Fitxa("Y");
    private static int tornJugador = 1;
    private static Taulell taulell;

    public static void main (String[] args) {
        menuInicial();
    }

    private static void menuPrincipal() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("------------------------------------");
        System.out.println("Benvinguts " + jugador_1.getNomJugador() + " i " + jugador_2.getNomJugador());
        System.out.println("Començam el joc!!");
        System.out.println(turnosJugadors());
    }

    public static void menuInicial() {
        System.out.println("***** Benvingut al Connecta 4 *****");
        System.out.println("Atencio Jugador 1!");
        System.out.print("Introdueix el teu nom: ");
        String nomJugador = input.next();
        jugador_1 = new Jugador(nomJugador, fJ1);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Atencio Jugador 2!");
        System.out.print("Introdueix el teu nom: ");
        nomJugador = input.next();
        jugador_2 = new Jugador(nomJugador, fJ2);
        if (jugador_1.getJugadorType() == 1 && jugador_1.getNomJugador() != "" || jugador_1.getNomJugador() != null) {
            if (jugador_2.getJugadorType() == 2 && jugador_2.getNomJugador() != "" || jugador_2.getNomJugador() != null) {
                System.out.print("Introduiu un nom (una paraula com a MAX) per al taulell del joc: ");
                String nomTaulell = input.next();
                if (nomTaulell != "" && nomTaulell != null) {
                    taulell = new Taulell(nomTaulell);
                    menuPrincipal();
                }
            }
        }
    }

    private static String turnosJugadors() {
        while (true) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("Nom del joc: " + taulell.getNomTaulell());
            System.out.println("\n\n");
            PrintTaulell.showTaulell(taulell);
            if (tornJugador == 1) {
                System.out.println("Torn per a " + jugador_1.getNomJugador());
                System.out.print("Introdueix una columna: ");
                char columna = input.next().charAt(0);
                if (taulell.insertaFitxa(columna, jugador_1)) {
                    if (!checkGuanyador.comprovaQuatreEnLinea(taulell)) {
                        tornJugador = 2;
                    } else {
                        System.out.println("\n\n\n\nJa hi ha un guanyador!");
                        PrintTaulell.showTaulell(taulell);
                        return showGuanyador(jugador_1);
                    }
                } else {
                    System.out.println("Has introduit una lletra incorrecte!");
                }
            } else if (tornJugador == 2) {
                System.out.println("Torn per a " + jugador_2.getNomJugador());
                System.out.print("Introdueix una columna: ");
                char columna = input.next().charAt(0);
                if (taulell.insertaFitxa(columna, jugador_2)) {
                    if (!checkGuanyador.comprovaQuatreEnLinea(taulell)) {
                        tornJugador = 1;
                    } else {
                        System.out.println("\n\n\n\nJa hi ha un guanyador!");
                        PrintTaulell.showTaulell(taulell);
                        return showGuanyador(jugador_2);
                    }
                } else {
                    System.out.println("Has introduit una lletra incorrecte!");
                }
            }
        }
    }

    private static String showGuanyador(Jugador winner) {
        return "El guanyador és " + winner.getNomJugador() + "!!";
    }

}

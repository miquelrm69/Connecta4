/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Arrays;

public class PrintTaulell {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static void showTaulell(Taulell taulell) {
        char[] lletresTaula = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int[][] gridTaulell = taulell.getGridTaulell();
        for (int f = 0; f < gridTaulell.length; f++) {
            for (int c = 0; c < gridTaulell[0].length; c++) {
                switch (gridTaulell[f][c]) {
                    case 0:
                        System.out.print(ANSI_CYAN_BACKGROUND + " [] " + ANSI_RESET);
                        break;
                    case 1:
                        System.out.print(ANSI_CYAN_BACKGROUND + ANSI_YELLOW + " X  " + ANSI_RESET);
                        break;
                    case 2:
                        System.out.print(ANSI_CYAN_BACKGROUND + ANSI_RED + " O  " + ANSI_RESET);
                        break;
                }
            }
            System.out.println();
        }
        for (int i = 0; i < lletresTaula.length; i++) {
            System.out.print(" " + lletresTaula[i] + "  ");
        }
        System.out.println();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Arrays;

public class PrintTaulell {
    public static void showTaulell(Taulell taulell) {
        char[] lletresTaula = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int[][] gridTaulell = taulell.getGridTaulell();
        for (int f = 0; f < gridTaulell.length; f++) {
            for (int c = 0; c < gridTaulell[0].length; c++) {
                switch (gridTaulell[f][c]) {
                    case 0:
                        System.out.print(" [] ");
                        break;
                    case 1:
                        System.out.print(" X  ");
                        break;
                    case 2:
                        System.out.print(" O  ");
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

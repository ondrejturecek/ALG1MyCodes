/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt;

import java.util.Scanner;

public class Vanoce {

    public static Scanner scanner = new Scanner(System.in);
    int rowsb = 1;
    public static int rows = 0;
    public static int pocet = 1;

    public static void main(String[] args) {
        boolean end = false;
        int answer;
        do {
            displayMenu(); //HadaniCisla.displayMenu()
            answer = volba();
            switch (answer) {
                case 1:
                    for (int i = 0; i < pocet; i++) {
                        System.out.println("  ");
                        hlava();
                        telo();
                        zadek();
                        ocas();
                    }
                    break;
                case 2:
                    velikost();
                    break;
                case 3:
                    pocet();
                    break;
                case 0:
                    end = true;
                    System.out.println("Konec");
                    break;
                default:
                    System.out.println("Spatna volba");
            }
        } while (!end); //end == false 
    }

    private static void displayMenu() {
        System.out.println("Pojďte si nekreslit rybu.");
        System.out.println("Vyber volbu stiskem:");
        System.out.println("1. Vykresli rybu");
        System.out.println("2. Změn velikost ryby");
        System.out.println("3. Změň počet ryb");
        System.out.println("0. Konec");
    }

    private static int volba() {
        int a = scanner.nextInt();
        return a;
    }
//

    private static void hlava() {
        String s = String.format("%1$" + (rows - 1) + "s", "");
        System.out.println(s + "   (_)");
        System.out.println(s + "   / \\");
        System.out.println(s + "  /   \\");
        System.out.println(s + " (°    \\");
        System.out.println(s + " /______\\");
    }

    private static void telo() {

// Starting number of ^ characters
        int startSymbols = 8; // Starting with 8 ^

        // Top half
        for (int j = 0; j < rows; j++) {
            // Print leading spaces
            for (int i = 0; i < rows - j - 1; i++) {
                System.out.print(" ");
            }
            System.out.print("(");
            // Print ^ characters for the current row
            int currentSymbols = startSymbols + j * 2;
            for (int i = 0; i < currentSymbols; i++) {
                System.out.print("^");
            }
            System.out.print(")");
            System.out.println("  ");
        }

        // Bottom half
        for (int j = 0; j < rows; j++) {
            // Print leading spaces
            for (int i = 0; i <= j - 1; i++) {
                System.out.print(" ");
            }
            System.out.print("(");
            // Print ^ characters for the current row
            int currentSymbols = startSymbols + (rows - 1 - j) * 2;
            for (int i = 0; i < currentSymbols; i++) {
                System.out.print("^");
            }
            System.out.print(")");
            System.out.println("  ");
        }

    }

    private static void zadek() {
        String s = String.format("%1$" + (rows - 1) + "s", "");
        System.out.println(s + " \\¨¨¨¨¨¨/");
        System.out.println(s + "  \\¨¨¨¨/");
        System.out.println(s + "   \\__/");
    }

    private static void ocas() {
        String s = String.format("%1$" + (rows - 1) + "s", "");
        System.out.println(s + "   /  \\");
        System.out.println(s + "  / /\\ \\");
        System.out.println(s + "  \\/  \\/");
    }

    private static int velikost() {
        System.out.println("Vítej v menu pro změnu velikosti.");
        System.out.println("zadej celé číslo pro určení velikosti ryby:");
        rows = volba();
        return rows;
    }

    private static void pocet() {
        System.out.println("Vítej v menu pro změnu počtu ryb.");
        System.out.println("Zadej celé číslo pro určení počtu ryb:");
        pocet = volba();
    }
}

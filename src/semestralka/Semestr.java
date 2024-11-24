/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralka;

import java.util.Scanner;

public class Semestr {

    public static Scanner scanner = new Scanner(System.in);
    public static int rowsb = 1;
    public static int rows = 0;
    public static int pocet = 1;
    public static int[][] matrix = new int[100][100];
    public static int size;

    public static void main(String[] args) {
        boolean start = true;
        int answer;

        do {
            mainMenu();
            answer = choice();
            switch (answer) {
                case 1:
                    christmas();
                case 2:
                    reduction();
                case 0:
                    start = false;
                    System.out.println("Konec");
                    break;
                default:
                    System.out.println("Spatna volba");
            }

        } while (start == true);

    }

    private static int choice() {
        int choice = scanner.nextInt();
        return choice;
    }

    private static void mainMenu() {
        System.out.println("Vítejte u mé semestrální práce.");
        System.out.println("Pro ovládání používejte zadávání celých kladných čísel.");
        System.out.println("Zadejte 1 pro spuštění vánoční úlohy.");
        System.out.println("Zadejte 2 pro spuštění semestrálního projektu.");
        System.out.println("Zadejte 0 pro ukončení aplikace.");
    }

    private static void christmas() {
        boolean end = false;
        int answer;
        do {
            displayMenu(); //HadaniCisla.displayMenu()
            answer = choose();
            switch (answer) {
                case 1:
                    for (int i = 0; i < pocet; i++) {
                        System.out.println("  ");
                        head();
                        boddy();
                        bottom();
                        tail();
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

    private static int choose() {
        int a = scanner.nextInt();
        return a;
    }
//

    private static void head() {
        String s = String.format("%1$" + (rows - 1) + "s", "");
        System.out.println(s + "   (_)");
        System.out.println(s + "   / \\");
        System.out.println(s + "  /   \\");
        System.out.println(s + " (°    \\");
        System.out.println(s + " /______\\");
    }

    private static void boddy() {

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

    private static void bottom() {
        String s = String.format("%1$" + (rows - 1) + "s", "");
        System.out.println(s + " \\¨¨¨¨¨¨/");
        System.out.println(s + "  \\¨¨¨¨/");
        System.out.println(s + "   \\__/");
    }

    private static void tail() {
        String s = String.format("%1$" + (rows - 1) + "s", "");
        System.out.println(s + "   /  \\");
        System.out.println(s + "  / /\\ \\");
        System.out.println(s + "  \\/  \\/");
    }

    private static int velikost() {
        System.out.println("Vítej v menu pro změnu velikosti.");
        System.out.println("zadej celé číslo pro určení velikosti ryby:");
        rows = choose();
        return rows;
    }

    private static void pocet() {
        System.out.println("Vítej v menu pro změnu počtu ryb.");
        System.out.println("Zadej celé číslo pro určení počtu ryb:");
        pocet = choose();
    }

    private static void reduction() {
        boolean begin = true;
        int answer;

        do {
            semestrMenu();
            answer = choice();
            switch (answer) {
                case 1:
                    System.out.println("Nejprve zadejte rozměr vaší čtvercové matice, kterou chcete redukovat.");
                    size = choice();
                    matrix(size, matrix);
                case 2:
                    reduce(size, matrix);
                case 0:
                    begin = false;
                    System.out.println("Konec");
                    break;
                default:
                    System.out.println("Spatna volba");
            }

        } while (begin == true);
    }

    private static void semestrMenu() {
        System.out.println("Vítejte v menu pro redukci Matice.");
        System.out.println("Stiskněte 1. pro zadání, nebo upravení, matice kterou chcete redukovat.");
        System.out.println("Stiskněte 2. pro provedéní redukce vámi zadané matice.");
        System.out.println("Stiskněte 0. pro návrat do hlaavního menu.");
    }

    private static int[][] matrix(int size, int[][] matrix) {
        System.out.println("Nejprve zadejte rozměr vaší čtvercové matice, kterou chcete redukovat.");

        System.out.println("nyní zadávejte postupně celočíselné hodnoty vaší matice");

        matrix = loadMatrix(size, matrix);
        System.out.println("  ");
        printMatrix(size, matrix);
        System.out.println("  ");

        return matrix;
    }

    public static int[][] loadMatrix(int size, int[][] matrix) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = choice();
            }
        }
        return matrix;
    }

    private static void printMatrix(int size, int[][] matrix) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("  ");
        }
    }

    private static void reduce(int size, int [] [] matrix) {
        System.out.println(size + " * " + size);
        System.out.println(matrix);
        
    }
}

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
        int[][] matrix;
        int size;
        int IndexNumber = 0;

        do {
            semestrMenu();
            answer = choice();
            if (answer > 0) {
                size = answer;
                matrix = new int[size][size];
                int[][] index = new int[size][2];
                index[0][0] = -1;
                index[0][1] = -1;

                matrix(size, matrix);
                findIndex(index, matrix);
                for (int i = 0; i < index.length; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(index[i][j]);
                    }
                    System.out.println("  ");
                }
                if (index[0][0] == -1) {
                    System.out.println("Redukce nelze provézt");
                    printMatrix(matrix);

                }
                IndexNumber = reduceIndexNumber(index, IndexNumber);
                int[][] reduceIndex = new int[index.length - IndexNumber][2];
                reduceIndex(index, reduceIndex, IndexNumber);
                int[][] reduced = new int[matrix.length - reduceIndex.length][matrix.length - reduceIndex.length];
                reducedMatrix(matrix, reduced, reduceIndex);
                System.out.println("původní matice řádu: " + size + "*" + size);
                printMatrix(matrix);
                System.out.println("Redukovaná matice");
                printReducedMatrix(reduced);
            } else {
                begin = false;
                System.out.println("Konec");
                break;
            }

        } while (begin == true);
    }

    private static void semestrMenu() {
        System.out.println("Vítejte v menu pro redukci Matice.");
        System.out.println("Zadejte celé kladné čílo rozměru matice.");
        System.out.println("Zadejte 0 nebo záporné číslo pro ukončení");
    }

    private static int[][] matrix(int size, int[][] matrix) {
        System.out.println("nyní zadávejte postupně celočíselné hodnoty vaší matice");
        matrix = loadMatrix(size, matrix);
        System.out.println("  ");
        printMatrix(matrix);
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

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("  ");
        }
    }

    private static int[][] findIndex(int[][] index, int[][] matrix) {
        boolean isOriginal = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] != 0) {
                    isOriginal = isOrigin(isOriginal, i, j, matrix);
                    if (isOriginal == true) {
                        for (int k = 0; k < index.length; k++) {
                            index[k][0] = i + 1;
                            index[k][1] = j + 1;
                            break;
                        }
                    }
                }
            }
        }
        return index;
    }

    private static boolean isOrigin(boolean isOriginal, int i, int j, int[][] matrix) {

        for (int k = 0; k < matrix.length; k++) {
            if (matrix[i][j] == matrix[i][k]) {
                continue;
            }
            if (matrix[i][k] != 0) {
                isOriginal = false;
                return isOriginal;
            }
        }
        for (int k = 0; k < matrix.length; k++) {
            if (matrix[i][j] == matrix[k][j]) {
                continue;
            }
            if (matrix[k][j] != 0) {
                isOriginal = false;
                return isOriginal;
            }
        }
        isOriginal = true;
        return isOriginal;
    }

    private static int reduceIndexNumber(int[][] index, int reduceIndexNumber) {
        int sumj0 = 0;
        int sumj1 = 0;

        for (int i = 0; i < index.length; i++) {
            if (index[i][0] == 0) {
                sumj0 = sumj0 + 1;
            }
        }
        for (int i = 0; i < index.length; i++) {
            if (index[i][1] == 0) {
                sumj1 = sumj1 + 1;
            }
        }
        if (sumj0 == sumj1) {
            reduceIndexNumber = sumj0;
        }
        return reduceIndexNumber;
    }

    public static int[][] reduceIndex(int[][] index, int[][] reduceIndex, int reduceIndexNumber) {

        for (int i = 0; i < index.length - reduceIndexNumber; i++) {
            for (int j = 0; j < 2; j++) {
                reduceIndex[i][j] = index[i][j] - 1;

            }

        }

        return reduceIndex;
    }

    public static int[][] reducedMatrix(int[][] matrix, int[][] reduced, int[][] reduceIndex) {
        int[] temp = new int[(matrix.length - reduceIndex.length) * (matrix.length - reduceIndex.length)];
        int z = -1;
        int y = -1;

        for (int l = 0; l < reduceIndex.length; l++) {
            for (int i = 0; i < matrix.length; i++) {
                if (i == reduceIndex[l][0]) {
                    continue;
                }
                for (int j = 0; j < matrix.length; j++) {
                    if (j == reduceIndex[l][1]) {
                        continue;
                    }
                    z = z + 1;
                    temp[z] = matrix[i][j];

                }
            }
        }
        for (int i = 0; i < reduced.length; i++) {
            for (int j = 0; j < reduced.length; j++) {
                y = y + 1;
                    reduced[i][j] = temp[y];

                

            }

        }
        return reduced;
    }

    private static void printReducedMatrix(int[][] reduced) {
        for (int i = 0; i < reduced.length; i++) {
            for (int j = 0; j < reduced.length; j++) {
                System.out.print(reduced[i][j] + " ");
            }
            System.out.println("  ");
        }
    }

}

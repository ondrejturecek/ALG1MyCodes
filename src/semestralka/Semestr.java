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

        Scanner scanner = new Scanner(System.in);

        do {
            semestrMenu();     // Vypíše menu s instrukcemi pro uživatele.
            answer = choice(scanner); // Načtení velikosti matice od uživatele.
            if (answer > 0) {  // Pokud uživatel zadá kladné číslo:
                size = answer;
                matrix = new int[size][size]; // Inicializace matice.
                matrix = loadMatrix(size, matrix, scanner); // Načtení matice od uživatele.
                System.out.println("\nPůvodní matice:");
                printMatrix(matrix); // Výpis původní matice.

                // Hlavní smyčka pro redukci
                while (true) {
                    int[][] indices = new int[matrix.length][2]; // Pole pro ukládání indexů prvků, které budou redukovány.
                    int indexCount = findIndices(matrix, indices); // Najde všechny redukovatelné prvky.

                    if (indexCount == 0) { // Pokud nejsou žádné redukovatelné prvky:
                        System.out.println("Žádné další prvky pro redukci. Matice zůstává:");
                        printMatrix(matrix);
                        break; // Ukončí smyčku redukce.
                    }

                    // Redukce matice
                    matrix = reducedMatrix(matrix, indices, indexCount);
                    System.out.println("\nRedukovaná matice:");
                    printMatrix(matrix);
                }
            } else { // Pokud uživatel zadá 0 nebo záporné číslo:
                begin = false;
                System.out.println("Konec.");
            }
        } while (begin);

        scanner.close();
    }

    private static void semestrMenu() {
        System.out.println("Vítejte v menu pro redukci matice.");
        System.out.println("Zadejte celé kladné číslo rozměru matice.");
        System.out.println("Zadejte 0 nebo záporné číslo pro ukončení.");
    }

    private static int[][] loadMatrix(int size, int[][] matrix, Scanner scanner) {
        System.out.println("Nyní zadávejte postupně celočíselné hodnoty vaší matice:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = choice(scanner);
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    private static int findIndices(int[][] matrix, int[][] indices) {
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0 && isUnique(i, j, matrix)) {
                    indices[count][0] = i; // Uložíme řádek
                    indices[count][1] = j; // Uložíme sloupec
                    count++;
                }
            }
        }

        return count; // Vrací počet nalezených indexů
    }

    private static boolean isUnique(int i, int j, int[][] matrix) {
        // Počet nenulových prvků v řádku a sloupci
        int nonZeroInRow = 0, nonZeroInCol = 0;

        for (int k = 0; k < matrix[i].length; k++) {
            if (matrix[i][k] != 0) {
                nonZeroInRow++;
            }
        }

        for (int k = 0; k < matrix.length; k++) {
            if (matrix[k][j] != 0) {
                nonZeroInCol++;
            }
        }

        // Prvek je unikátní, pokud je jediný nenulový v řádku a sloupci
        return nonZeroInRow == 1 && nonZeroInCol == 1;
    }

    private static int[][] reducedMatrix(int[][] matrix, int[][] indices, int indexCount) {
        // Určíme řádky a sloupce k odstranění
        boolean[] removeRows = new boolean[matrix.length];
        boolean[] removeCols = new boolean[matrix[0].length];

        for (int i = 0; i < indexCount; i++) {
            removeRows[indices[i][0]] = true;
            removeCols[indices[i][1]] = true;
        }

        // Spočítáme nový rozměr matice
        int newSize = matrix.length - countTrue(removeRows);

        int[][] reduced = new int[newSize][newSize];
        int rowIdx = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (removeRows[i]) {
                continue; // Přeskoč řádky k odstranění
            }
            int colIdx = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (removeCols[j]) {
                    continue; // Přeskoč sloupce k odstranění
                }
                reduced[rowIdx][colIdx] = matrix[i][j];
                colIdx++;
            }
            rowIdx++;
        }

        return reduced;
    }

    private static int countTrue(boolean[] array) {
        int count = 0; // Počítadlo, inicializováno na nulu.
        for (boolean value : array) { // Pro každou hodnotu v poli:
            if (value) {
                count++; // Pokud je hodnota `true`, zvýšíme počítadlo o 1.
            }
        }
        return count; // Vrátíme celkový počet hodnot `true`.
    }

    private static int choice(Scanner scanner) {
        System.out.print("> ");
        while (!scanner.hasNextInt()) {
            System.out.println("Zadejte celé číslo!");
            scanner.next();
        }
        return scanner.nextInt();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralka;

import java.util.Scanner;

public class GPT {

    public static void main(String[] args) {
        reduction();
    }

    private static void reduction() {
        boolean begin = true;
        int answer;
        int[][] matrix;
        int size;

        Scanner scanner = new Scanner(System.in);

        do {
            semestrMenu();
            answer = choice(scanner);
            if (answer > 0) {
                size = answer;
                matrix = new int[size][size];
                matrix = loadMatrix(size, matrix, scanner);
                System.out.println("\nPůvodní matice:");
                printMatrix(matrix);

                while (true) {
                    int[] index = findIndex(matrix);

                    // Pokud není žádný vhodný prvek k redukci
                    if (index[0] == -1) {
                        System.out.println("Žádné další prvky pro redukci. Matice zůstává:");
                        printMatrix(matrix);
                        break;
                    }

                    // Redukce matice
                    matrix = reducedMatrix(matrix, index);
                    System.out.println("\nRedukovaná matice:");
                    printMatrix(matrix);
                }
            } else {
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

    private static int[] findIndex(int[][] matrix) {
        int[] index = {-1, -1};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0 && isUnique(i, j, matrix)) {
                    index[0] = i;
                    index[1] = j;
                    return index; // Najdeme první vhodný prvek
                }
            }
        }
        return index; // Nenalezen žádný vhodný prvek
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

    private static int[][] reducedMatrix(int[][] matrix, int[] index) {
        int newSize = matrix.length - 1;
        int[][] reduced = new int[newSize][newSize];

        int rowIdx = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (i == index[0]) {
                continue;
            }

            int colIdx = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == index[1]) {
                    continue;
                }

                reduced[rowIdx][colIdx] = matrix[i][j];
                colIdx++;
            }
            rowIdx++;
        }

        return reduced;
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

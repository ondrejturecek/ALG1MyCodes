/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralka;

/**
 *
 * @author Dagmar Malá
 */
public class Test {

    public static void main(String[] args) {
        int[] index = new int[2];
        int indexi = 0;
        int indexj = 0;

        int[][] matrix = {
            {1, 0, 3},
            {0, 5, 0},
            {7, 0, 9}
        };
        System.out.println(matrix);
        System.out.println("  ");
        findIndexI(index, indexi, indexj, matrix);
//        printReduceMatrix(indexi, indexj, matrix);
        for (int i = 0; i < index.length; i++) {
            System.out.print(index[i] + " ");
        }
        System.out.println("  ");
        System.out.println("  ");
        
        printReduceMatrix(index, matrix);
    }

    private static int[] findIndexI(int[] index, int indexi, int indexj, int[][] matrix) {
        boolean isOriginal = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] != 0) {
                    indexi = i;
                    indexj = j;
                    isOriginal = isOrigin(isOriginal, indexi, indexj, matrix);

                    if (isOriginal == true) {
                        index[0] = i;
                        index[1] = j;
                    }
                }
            }
        }
        return index;
    }

    private static boolean isOrigin(boolean isOriginal, int indexi, int indexj, int[][] matrix) {
        int sumi = 0;
        int sumj = 0;
        boolean isOriginali = false;
        boolean isOriginalj = false;

        for (int i = 0; i < matrix.length; i++) {
            sumi = sumi + matrix[i][indexj];
        }
        if (sumi == matrix[indexi][indexj]) {
            isOriginali = true;
        }

        for (int j = 0; j < matrix.length; j++) {
            sumj = sumj + matrix[indexi][j];
        }
        if (sumj == matrix[indexi][indexj]) {
            isOriginalj = true;
        }

        if (isOriginali == true && isOriginalj == true) {
            isOriginal = true;
        }
        return isOriginal;
    }

    private static void printReduceMatrix(int[] index, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (i == index[0] - 1) {
                continue;
            }
            for (int j = 0; j < matrix.length; j++) {
                if (j == index[1] - 1) {
                    continue;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("  ");
        }

    }
}

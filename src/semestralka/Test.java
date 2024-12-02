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
        int [] [] matrix = {
            {0, 0, 0, 4},
            {0, 5, 0, 0},
            {7, 0, 9, 0},
            {6, 0, 4, 0}
        };
    
        findIndexI(index, matrix);
        printReduceMatrix(index, matrix);
    }

    private static int[] findIndexI(int[] index, int[][] matrix) {
        boolean isOriginal = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] != 0) {
                    isOriginal = isOrigin(isOriginal, i, j, matrix);

                    if (isOriginal == true) {
                        index[0] = i;
                        index[1] = j;
                    }else{
                        isOriginal = false;
                    }
                }
            }
        }
        return index;
    }

    private static boolean isOrigin(boolean isOriginal, int i, int j, int[][] matrix) {
        int sumi = 0;
        int sumj = 0;
        boolean isOriginali = false;
        boolean isOriginalj = false;

        for (int k = 0; k < matrix.length; k++) {
            sumi = sumi + matrix[k][j];
        }
        if (sumi == matrix[i][j]) {
            isOriginali = true;
        }

        for (int k = 0; k < matrix.length; k++) {
            sumj = sumj + matrix[i][k];
        }
        if (sumj == matrix[i][j]) {
            isOriginalj = true;
        }

        if (isOriginali == true && isOriginalj == true) {
            isOriginal = true;
        }else{
            isOriginal = false;
        }
        return isOriginal;
    }

    private static void printReduceMatrix(int[] index, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (i == index[0]) {
                continue;
            }
            for (int j = 0; j < matrix.length; j++) {
                if (j == index[1]) {
                    continue;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("  ");
        }

    }
}

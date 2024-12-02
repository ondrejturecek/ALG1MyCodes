/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulohy_08;

/**
 *
 * @author Dagmar Malá
 */
public class MatrixTools {

    public static void main(String[] args) {
        int[][] matrix = {
            {9, 6, 9, 6, 9},
            {6, 9, 6, 9, 6},
            {9, 6, 9, 6, 9},
            {6, 9, 6, 9, 6},
            {9, 6, 9, 6, 6,}
        };
        //int[][] normMatrix = new int[matrix.length][matrix.length];
        //normMatrix(matrix, normMatrix);
        //printMatrix(normMatrix);
        if(isSymetricD(matrix) == true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        if(isSymetricVd(matrix) == true){
                     System.out.println("true");
        }else{
            System.out.println("false");
        }
        System.out.println(isSymetricY(matrix));
        System.out.println(isSymetricX(matrix));
    }

    public static int[][] normMatrix(int[][] matrix, int[][] normMatrix) {
        int maxAbs = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (Math.abs(matrix[i][j]) > maxAbs) {
                    maxAbs = Math.abs(matrix[i][j]);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                normMatrix[i][j] = matrix[i][j] / maxAbs;
            }

        }
        return normMatrix;
    }

    private static void printMatrix(int[][] normMatrix) {
        for (int i = 0; i < normMatrix.length; i++) {
            for (int j = 0; j < normMatrix.length; j++) {

                System.out.printf("%5d", normMatrix[i][j]);
            }
            System.out.println("  ");
        }

    }

    private static boolean isSymetricD(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }

            }

        }
        return true;
    }

    private static boolean isSymetricVd(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j > 0; j--) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }

            }

        }
        return true;
    }

    private static boolean isSymetricY(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length / 2; j++) {
                if (matrix[i][j] != matrix[i][matrix[i].length - 1 - j]) {
                    return false;
                }

            }

        }
        return true;
    }

    private static boolean isSymetricX(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix[matrix.length - 1 - i][j]) {
                    return false;
                }

            }

        }
        return true;
    }
}

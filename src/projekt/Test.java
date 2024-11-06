/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt;

import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        // Prompt user for the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        // Starting number of ^ characters
        int startSymbols = 8; // Starting with 8 ^
        
        // Top half
        for (int j = 0; j < rows; j++) {
            // Print leading spaces
            for (int i = 0; i < rows - j; i++) {
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
            for (int i = 0; i <= j + 1; i++) {
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
        
        scanner.close();
    }
}

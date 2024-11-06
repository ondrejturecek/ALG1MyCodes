/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt;

/**
 *
 * @author Dagmar Malá
 */
public class Telo {
    public static void main(String[] args) {
                int x = 9;

        for (int j = 0; j < x; j++) {
            for (int i = 0; i < x - j; i++) {
                System.out.print(" ");
            }
            System.out.print("(");
            for (int i = 0; i <= j; i++) {
                System.out.print("^");
            }
            for (int i = 0; i <= j; i++) {
                System.out.print("^");
            }
            System.out.print(")");
            System.out.println("  ");
        }
        
        for (int j = 0; j < x - 1; j++) {
            for (int i = 0; i <= j + 1; i++) {
                System.out.print(" ");
            }
            System.out.print("(");
            for (int i = 0; i < x - j - 1; i++) {
                System.out.print("^");
            }
            for (int i = 0; i < x - j - 1; i++) {
                System.out.print("^");
            }
            System.out.print(")");
            System.out.println("  ");
    }
    
    }
}
    
 
    



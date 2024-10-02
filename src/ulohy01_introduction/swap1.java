/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulohy01_introduction;

/**
 *
 * @author Dagmar Malá
 */
public class swap1 {
    public static void main(String[] args) {
    int a = 34;
    int b = 89; 
    System.out.println(a + "," + b);
    
    //1.
    System.out.println(b + "," + a);
        
    //2.
    int c; 
    c = a;//záloha a
    a = b;//prepsani acka beckem
    b = c;//prepsani b
    
    System.out.println(a +"," + b);
    
    //3.
    a = 34;
    b = 89;
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println(a + "," + b);
    
    }
    
    
}

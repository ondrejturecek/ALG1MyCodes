/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulohy02;

import java.util.Scanner;

/**
 *
 * @author Dagmar Malá
 */
public class Kruh {
    public static void main(String[] args) {
        //01
        Scanner sc = new Scanner(System.in);
        System.out.println("zadej polomer");
        double r = sc.nextDouble();//3;
        final double PI = Math.PI;//3.14159265358979323846;
        
       double area = PI * Math.pow(r,2);
       double circumference = 2 * PI * r;
       double roundarea = Math.round(area);
       double roundcircumference = Math.round(circumference);
       
        //System.out.println(roundarea);
        //System.out.println(roundcircumference);
        System.out.format("Obsah rovna se: %.2f, \nObvod rovna se: %.2f.\n", area, circumference);
    }
         
}

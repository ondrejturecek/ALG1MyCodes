/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulohy_03;

/**
 *
 * @author Dagmar Malá
 */
public class PrestupnyRok {

    public static void main(String[] args) {
        int rok = 2001;
        
        System.out.println(((rok % 4) == 0) && (!((rok % 100) == 0) || ((rok % 400) == 0)) ? 366 : 365);
    }
    
}

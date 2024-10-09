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
public class přestupnýrok {

    public static void main(String[] args) {
        final int prestup = 366;
        final int norm = 365;
        int rok = 2004;
        int del400 = rok % 400;
        int del100 = rok % 100;
        int del4 = rok % 4;

        if (del4 == 0) {
            
            if (del100 == 0) {

                if (del400 == 0) {
                    System.out.println("rok má " + prestup);
                } else System.out.println("rok má " + norm);
            
            } else System.out.println("rok má " + prestup);
            
        }else System.out.println("rok má " + norm);
    }
}

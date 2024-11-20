/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulohyy_07_pole;

/**
 *
 * @author Dagmar Malá
 */
public class VycetPlatidel {
    public static void main(String[] args) {
        final double[] PLATIDLA = {5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        double[] pocet = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        double castka = 9999;
        
        
        for (int i = 0; i <= PLATIDLA.length - 1; i++) {
          if  (castka >= PLATIDLA[i]){
              pocet[i] = pocet[i] + Math.floor((castka / PLATIDLA[i]));
              castka = castka - (PLATIDLA[i] * pocet[i]); 
          }
        }
        for (int i = 0; i <= pocet.length - 1; i++) {
            System.out.print(pocet[i] + " ");
        }
    }
}

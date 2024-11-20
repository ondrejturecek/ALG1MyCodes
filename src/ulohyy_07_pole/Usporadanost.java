/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulohyy_07_pole;

import static ulohyy_07_pole.ArrayTools.testVzestupnost;
import static ulohyy_07_pole.LoadAray.loadArray;
import static ulohyy_07_pole.LoadAray.sc;


/**
 *
 * @author Dagmar Malá
 */
public class Usporadanost {
    public static void main(String[] args) {
       
        
        System.out.println("Zadej pocet hodnot");
        int n = sc.nextInt();
        System.out.println("Zadavej postupne hodnoty");
        int[] numbers = new int[n];
        loadArray(numbers);
        
        boolean vzestupnost = testVzestupnost(numbers);
        
        if (vzestupnost){
            System.out.println("je vzestupné");
        }else{
            System.out.println("není vzestupné");
        }
            
    }

}

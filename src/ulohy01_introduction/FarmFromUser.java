/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulohy01_introduction;

import java.util.Scanner;

/**
 *
 * @author Dagmar Malá
 */
public class FarmFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Zadej pocet hus a počet kraliku");
        int pocetHus = scanner.nextInt();
        int pocetKraliku = scanner.nextInt();
        final int NOHY_HUS = 2;
        final int NOHY_KRALIKU = 4;
        
        int pocetZvirat = pocetHus + pocetKraliku;
        int pocetNohouHus = pocetHus * NOHY_HUS;
        int pocetNohouKraliku = pocetKraliku * NOHY_KRALIKU;
        int pocetNoh = pocetNohouHus + pocetNohouKraliku;
        
        String farm = "Na farme je " + pocetZvirat + " zvirat a mají " + pocetNoh + " nohou.";
        System.out.println(farm);
    }
}

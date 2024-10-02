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
public class Farm {
    public static void main(String[] args) {
        int pocetHus = 5;
        int pocetKraliku = 4;
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

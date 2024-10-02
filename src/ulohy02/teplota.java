/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulohy02;

/**
 *
 * @author Dagmar Malá
 */
public class teplota {
    public static void main(String[] args) {
        float teplota_6 = 10;
        float teplota_12 = 20;
        float teplota_18 = 15;
        final int POCET_TEPLOT = 3;
        final int VÁHA_TEPLOTA18 = 2;
        
        float prumer = (teplota_6 + teplota_12 + VÁHA_TEPLOTA18 * teplota_18)/POCET_TEPLOT;
        
        System.out.println(prumer);
    }
}

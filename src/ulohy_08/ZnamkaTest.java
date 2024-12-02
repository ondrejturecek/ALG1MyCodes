/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulohy_08;

import static semestralka.Semestr.scanner;

/**
 *
 * @author Dagmar Malá
 */
public class ZnamkaTest {

    public static void main(String[] args) {
        int zaci;
        int pocetZnamek;

        System.out.println("Zadejte počet žáků");
        zaci = choice();
        double [] prumery = new double[zaci];
        
        System.out.println("Zadejte počet známek kolik mají žáci");
        pocetZnamek = choice();
        int[][] znamky = new int[zaci][pocetZnamek];
        
        System.out.println("zadavejte znamky");
        loadMatrix(znamky);
        vypocetPrumeru(prumery, znamky);
        
        System.out.println("prumery zaku");
        printPrumer(prumery);
    }
    
       private static int choice() {
        int choice = scanner.nextInt();
        return choice;
    }

    public static int[][] loadMatrix(int[][] znamky) {
        for (int i = 0; i < znamky.length; i++) {
            for (int j = 0; j < znamky [i].length; j++) {
                znamky[i][j] = choice();
            }
        }
        return znamky;
    }
    public static double[] vypocetPrumeru(double[] prumery, int [] [] znamky){
        int sumi = 0;
        
        for (int i = 0; i < znamky.length; i++) {
            for (int j = 0; j < znamky [i].length; j++) {
                sumi = sumi + znamky [i] [j];
            }
            prumery[i] = sumi/znamky[i].length;
            sumi = 0;
        }
        return prumery;
    }

    private static void printPrumer(double[] prumery) {
        for (int i = 0; i < prumery.length; i++) {
            System.out.println(prumery[i]);
        }
    }
}

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
public class alkohol {
    public static void main(String[] args) {
        double q1 = 0.5;
        double qcm = q1*1000;
        double p = 5.0;
        double m = 75.0;
        final double RHO = 0.8; // g/cm3
        final double RM = 0.7;
        final double BM = 0.1;
        
        double met = Math.round((qcm*p*RHO)/100);
        double prom = Math.round((met)/(m*RM));
        double vet = Math.round(m*BM); 
        double cas = Math.round(met/vet);
        
        System.out.println("hmotnost vypitého ethanolu:" + met + " g");
        System.out.println("promile po konzumaci:" + prom + "‰");
        System.out.println("g odbourané za hodinu:" + vet + " g/h");
        System.out.println("0‰ za:" + cas + " h");
    }
}

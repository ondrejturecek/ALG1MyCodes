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
public class VectorTools {
    
    public static double calcDistance(double ax, double bx, double ay, double by) {
        double distx = ax - bx;
        double disty = ay - by;
        double distanc = Math.sqrt(Math.pow(distx, 2) + Math.pow(disty, 2));
        return distanc;
    }
}
    

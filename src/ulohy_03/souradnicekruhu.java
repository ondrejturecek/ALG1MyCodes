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
public class souradnicekruhu {
    public static void main(String[] args) {
        int x = 4;
        int y = 3;
        int sx = 0;
        int sy = 0;
        int r = 1;
        
        int lx = x - sx;
        int ly = y - sy;
        double l = Math.sqrt((lx*lx)+(ly*ly));
        
        if (l == r){
            System.out.println("bod je na kružnici");
        }else if (l > r){
            System.out.println("bod je vně kružnice");
        }else 
            System.out.println("bod je vnu kružnice");
        }
    }


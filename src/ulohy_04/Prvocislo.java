/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulohy_04;

import java.util.Scanner;

/**
 *
 * @author Dagmar Malá
 */
public class Prvocislo {

    public static void main(String[] args) {
        boolean continu = true;
        
        while (continu = true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Zadejte cislo");
            int cislo = scan.nextInt();
            int i = 2;

            boolean isPrime = true;

            if (cislo == 1) {
                isPrime = false;
            }

            while (i <= Math.sqrt(cislo) && isPrime) {

                if (cislo % i == 0) {
                    isPrime = false;
                    //break;
                }
                i++;
            }
            System.out.println(isPrime);
            System.out.println("chcete pokračovat? stisknete 1");
            int pokračuj = scan.nextInt();
            continu = pokračuj == 1;
        }

    }
    public static boolean isPrime(int cislo){
            int i = 2;

            boolean isPrime = true;

            if (cislo == 1) {
                isPrime = false;
            }

            while (i <= Math.sqrt(cislo) && isPrime) {

                if (cislo % i == 0) {
                    isPrime = false;
                    //break;
                }
                i++;
        }
            return isPrime;
    }
}

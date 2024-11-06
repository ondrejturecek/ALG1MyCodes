/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulohy_06_library;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Dagmar Malá
 */
public class NaturalNumberTools {

    //test prvočíselnosti
    public static boolean isPrime(int number) {
        int n = 2;
        boolean jePrvocislo = true;
        if (number <= 1) {
            jePrvocislo = false;
        }
        while (n <= Math.sqrt(number)) {
            if (number % n == 0) {
                jePrvocislo = false;
                return jePrvocislo;
            }
            n++;
        }
        return jePrvocislo;
    }

    public static int findGreatestDivider(int a, int b) {
        if (a == b) {
            return a;
        } else {
            int min = (a < b) ? a : b;
            int max = (a > b) ? a : b;

            for (int i = min; i > 2; i--) {
                if (max % i == 0 && min % i == 0) {
                    return i;
                }
            }
            return 1;
        }
    }

    public static int numberOfDividers(int a) {
        int nod = 0;
        for (int i = a; i > 0; i--) {
            if (a % i == 0) {
                nod = nod + 1;
            }
        }
        return nod;
    }

    public static int lowestMultiplier(int a, int b) {
        int glm = a * b;
        int max = (a > b) ? a : b;
        int d = glm;

        for (int i = glm; i >= max; i--) {
            if (i % a == 0 && i % b == 0) {
                d = i;
            }
        }
        if (d != glm) {
            return d;
        }
        return glm;
    }
    
    public static int generateRandomNumber(int min, int max){
                
        int randomNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
        
        return randomNumber;
    }
    
    
    //testovací main

    public static void main(String[] args) {
        System.out.println(lowestMultiplier(30, 15));
    }
}

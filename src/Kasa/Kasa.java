/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasa;

import static semestralka.Semestr.scanner;

public class Kasa {

    public static void main(String[] args) {
        boolean start = true;
        float suma = 0;
        
        int potravin = 0;
        float spotravin = 0;
        int drogerie = 0;
        float cena;
        int pocet;
        int typ;
        float min = 999999999;
        final double BANKA = 0.02;
        int stravenka;

        while (start == true) {
            System.out.println("Zadejte cenu zboží");
            cena = choice();
            if (cena == 0) {
                start = false;
                break;
            }
            if (cena < min) {
                min = cena;
            }
            System.out.println("Zadejte počet zboží");
            pocet = choose();

            System.out.println("Zadejte typ položky");
            typ = choose();
            if (typ == 1) {
                potravin = potravin + 1;
                spotravin = spotravin + cena * pocet;
            } else if (typ == 2) {
                drogerie = drogerie + 1;
            } else {
                System.out.println("spatny typ");
            }

            suma = suma + cena * pocet;
            System.out.printf("Pruběžná suma je: %.2f \n ", suma);

        }
        String zprava = (suma >= 200)
                ? "Máte nárok na " + (int) (suma / 200) + " samolepek."
                : "Nemáte nárok na samolepky.";
        System.out.println(zprava);
        int asum = Math.round(suma);
        System.out.printf("Celková suma: %.2f \n ", suma);
        System.out.println("zaokrouhlená suma " + asum);
        System.out.println("Počet potravin " + potravin);
        System.out.printf("Cena potravin: %.2f \n ", spotravin);
        System.out.println("Počet drogerie " + drogerie);

        System.out.println("Zadejte typ placení");
        int platba = choose();
        float tmp = suma; 
        if (platba == 1) {
            System.out.println("Banka vrátí: " + BANKA * suma + " Kč");
        } else if (platba == 2) {
            for (int i = 1; i < 6; i++) {
                System.out.println("Použili jste " + i + " z " + " 5 staravenek");
                stravenka = choose();
                tmp = suma - stravenka;
                if (spotravin - stravenka * i < 0) {
                    suma = suma - spotravin;
                    break;
                }
            }
            System.out.println("Je potřeba doplatit " + suma);
        }
    }

    private static float choice() {
        float choice = scanner.nextFloat();
        return choice;
    }

    private static int choose() {
        int choice = scanner.nextInt();
        return choice;
    }
}

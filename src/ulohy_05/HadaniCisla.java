package ulohy_05;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class HadaniCisla {

    public static Scanner sc = new Scanner(System.in);
    public static int min = 1;
    public static int max = 100;

    public static void main(String[] args) {
        boolean end = false;
        int answer;
        do {
            displayMenu(); //HadaniCisla.displayMenu()
            answer = choose();
            switch (answer) {
                case 1: changeRange();
                    break;
                case 2: pcPlays();
                    break;
                case 3: userPlays();
                    break;
                case 0: end = true;
                    System.out.println("Konec");
                    break;
                default:
                    System.out.println("Spatna volba");
            }
        } while (!end); //end == false 
    }

    private static void displayMenu() {
        System.out.println("Vyber volbu");
        System.out.println("1. Změn rozsah");
        System.out.println("2. Pocitač hádá");
        System.out.println("3. Uzivatel hádá");
        System.out.println("0. Konec");
    }

    private static int choose() {
        int a = sc.nextInt();
        return a;
    }

    private static void changeRange() {
        System.out.println("Základní interval je 1 - 100");
        System.out.println("0 pokud ho chceš nechat");
        System.out.println("1 pokud ho chceš změnit");
        int answer = choose();

        if (answer == 0) {
            return;
        } else if (answer == 1) {
            System.out.println("Zadaj minimum: ");
            min = choose();
            System.out.println("Zadej maximum: ");
            max = choose();
        }

    }

    private static void pcPlays() {
        System.out.println("Mysli si číslo v rozsahu od " + min + " do " + max);
        int lower = min;
        int upper = max;
        int middle;
        boolean found = false;

        do {
            middle = (lower + upper) / 2;

            System.out.println("Myslel jsi si " + middle + "?");
            System.out.println("Odpovez: ");
            System.out.println(" 0: Je to myšlené číslo");
            System.out.println(" 1: Myšlené číslo je větší");
            System.out.println("-1: Myšlené číslo je menší");
            int answer = choose();

            if (answer == 0) {
                System.out.println("Uhodl jsem");
                found = true;
            } else if (answer == 1) {
                lower = middle + 1;
            } else if (answer == -1) {
                upper = middle - 1;
            } else {
                System.out.println("Spatna volba");
            }
        } while (!found && lower <= upper);

        if (!found) {
            System.out.println("Myšlené číslo není v rozsahu");
        }
    }

    private static void userPlays() {
        int randomNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
        boolean found = false;
        System.out.println("Myslim si číslo v rozsahu od " + min + " do " + max);
        System.out.println("Zkus ho uhodnout");

        do {
            System.out.println("Tipni si cislo.");
            int answer = choose();

            if (answer == randomNumber) {
                System.out.println("Trefil jsi se");
                found = true;
            } else if (answer < randomNumber) {
                System.out.println("Hledane cislo je vetsi");
            } else {
                System.out.println("Hledane cislo je mensi");
            }
        } while (!found);

    }
}

//    //test
//    public static void main(String[] args) {
//        changeRange();
//    }


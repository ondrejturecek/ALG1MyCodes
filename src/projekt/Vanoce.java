/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt;

    import java.util.Scanner;

public class Vanoce {
    public static Scanner scanner = new Scanner(System.in);
    
    
    public static void main(String[] args) {

        boolean end = false;
        int answer;
        do {
            displayMenu(); //HadaniCisla.displayMenu()
            answer = volba();
            switch (answer) {
                case 1: hlava();
                        telo();
                        zadek();
                        ocas();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    end = true;
                    System.out.println("Konec");
                    break;
                default:
                    System.out.println("Spatna volba");
            }
        } while (!end); //end == false 
    }

    private static void displayMenu() {
        System.out.println("Pojďte si nekreslit rybu.");
        System.out.println("Vyber volbu");
        System.out.println("1. Vykresli rybu");
        System.out.println("2. Změn velikost těla ryby");
        System.out.println("3. Změň velikost ocasu");
        System.out.println("4. Změň počet ryb");
        System.out.println("0. Konec");
    }

    private static int volba(){
        int a = scanner.nextInt();
        return a;
    }
//
    private static void hlava(){
        System.out.println("   (_)");
        System.out.println("   / \\");
        System.out.println("  /   \\");
        System.out.println(" (°    \\");
        System.out.println(" /______\\");
    }
    private static void telo(){
        System.out.println("(^^^^^^^^)");
    }
    private static void zadek(){
        System.out.println(" \\¨¨¨¨¨¨/");
        System.out.println("  \\¨¨¨¨/");
        System.out.println("   \\__/");
    }
    private static void ocas(){
        System.out.println("   /  \\");
        System.out.println("  / /\\ \\");
        System.out.println("  \\/  \\/");
    }
//    public static void telo(){
//
//        int x = 13;
//
//        for (int j = 0; j < x; j++) {
//            for (int i = 0; i < x - j; i++) {
//                System.out.print(" ");
//            }
//            for (int i = 0; i <= j; i++) {
//                System.out.print("^ ");
//            }
//            System.out.println("  ");
//        }
//        
//        for (int j = 0; j < x - 1; j++) {
//            for (int i = 0; i <= j + 1; i++) {
//                System.out.print(" ");
//            }
//            for (int i = 0; i < x - j - 1; i++) {
//                System.out.print("^ ");
//            }
//            System.out.println("  ");
//        }
//    }
}

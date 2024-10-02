/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulohy02;

import java.util.Scanner;

/**
 *
 * @author Dagmar Malá
 */
public class usekovarychlost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej max rychlost v km/h:");
        float maxSpead = sc.nextFloat();//km/h
        System.out.println("Zadej délku useku v km:");
        float lenght = sc.nextFloat();//km
        System.out.println("Zadej cas vjezdu:");
        int hoursA = sc.nextInt();
        int minutesA = sc.nextInt();
        int secondsA = sc.nextInt();
        System.out.println("Zadej cas vyjezdu:");
        int hoursB = sc.nextInt();
        int minutesB = sc.nextInt();
        int secondsB = sc.nextInt();
        final int SECONDS_IN_MINUTE = 60;
        final int SECONDS_IN_HOUR = 60*SECONDS_IN_MINUTE;

//processing
        double finalSecondsA = hoursA * SECONDS_IN_HOUR + minutesA * SECONDS_IN_MINUTE + secondsA;
        double finalSecondsB = hoursB * SECONDS_IN_HOUR + minutesB * SECONDS_IN_MINUTE + secondsB;
        double finalSecondsT = finalSecondsB - finalSecondsA;
        double time = finalSecondsT / SECONDS_IN_HOUR;
        double spead = lenght/time;
        double dif = spead - maxSpead;
        boolean isdif = dif>=0;
                
        
//output
        System.out.println("výsledky:");
        System.out.println(time + " h");
        System.out.println(spead + " km/h");
        System.out.println("prekrocil o " + dif + " km/h");
    }
            
}

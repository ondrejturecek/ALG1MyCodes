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
public class hodiny {
    public static void main(String[] args) {
        int hoursA = 3;
        int minutesA = 30;
        int secondsA = 20;
        final int SECONDS_IN_MINUTE = 60;
        final int SECONDS_IN_HOUR = 60*SECONDS_IN_MINUTE;

//processing
 
        int finalSecondsA = hoursA * SECONDS_IN_HOUR + minutesA * SECONDS_IN_MINUTE + secondsA;
        float hodiny = finalSecondsA / SECONDS_IN_HOUR;

    }
}

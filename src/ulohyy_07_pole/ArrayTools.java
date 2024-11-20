/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulohyy_07_pole;

import static ulohyy_07_pole.LoadAray.loadArray;

/**
 *
 * @author Dagmar Malá
 */
public class ArrayTools {

    public static int soucet(int[] numbers) {
        int sum = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static int maximalniHodnota(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int findexMin(int[] numbers) {
        int min = numbers[0];
        int findex = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                findex = i;
            }
        }
        return findex;
    }

    public static int lindexMin(int[] numbers) {
        int min = numbers[0];
        int lindex = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] <= min) {
                min = numbers[i];
                lindex = i;
            }
        }
        return lindex;
    }

    public static boolean testVzestupnost(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] pole = {1, 2, 3, 4, 5};
        System.out.println(testVzestupnost(pole));
        
    }
}

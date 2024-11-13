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

    public static int indexMin(int[] numbers) {
        int min = numbers[0];
        int index = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] pole = loadArray();
        int index = indexMin(pole) + 1;
        System.out.println("index min =  " + index);
    }
}

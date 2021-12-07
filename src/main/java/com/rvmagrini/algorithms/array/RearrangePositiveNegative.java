package com.rvmagrini.algorithms.array;

import java.util.Arrays;

public class RearrangePositiveNegative {

    public static void main(String[] args) {

        int[] intArray = { -1, -5, 6, 7, -8, 10, -12, 15, 3, 9};
        System.out.println("Rearranged array alternating positive and negative: " + Arrays.toString(rearrangeArray(intArray)));

    }

    public static int[] rearrangeArray(int[] array) {

        for (int i=0; i<array.length-1; i++) {
            for (int j=i+1; j<array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(array));

        for (int i=0; i<array.length; i+=2) {
            if (array[i] < 0) {
                int j = i+1;
                while (j < array.length) {
                    if (array[j] > 0) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                        break;
                    } else {
                        j++;
                    }
                }
            }
        }
        return array;
    }

}

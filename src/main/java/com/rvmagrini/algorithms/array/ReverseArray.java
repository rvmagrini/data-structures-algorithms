package com.rvmagrini.algorithms.array;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] intArray = { 4, 9, 6, 8, 15, 11, 14 };
        System.out.println("Reversed Array: " + Arrays.toString(reverseArray(intArray)));

    }

    public static int[] reverseArray(int[] array) {
        int end = array.length - 1;

        for (int i=0; i<array.length/2; i++) {
            int temp = array[i];
            array[i] = array[end - i];
            array[end - i] = temp;
        }

        return array;
    }

}

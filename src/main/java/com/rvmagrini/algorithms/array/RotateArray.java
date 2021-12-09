package com.rvmagrini.algorithms.array;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        int[] intArray1 = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("Rotated Array - 3 times: " + Arrays.toString(rotateArray(intArray1, 3)));
        int[] intArray2 = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("Rotated Array - 2 times: " + Arrays.toString(rotateArray(intArray2, 2)));
        int[] intArray3 = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("Rotated Array - 5 times: " + Arrays.toString(rotateArray(intArray3, 5)));

    }

    public static int[] rotateArray(int[] array, int times) {
        int length = array.length;
        if (times % length == 0) {
            return array;
        }

        // Reversing entire array
        for (int i=0; i<length/2; i++) {
            int swapBucket = array[i];
            array[i] = array[length-1-i];
            array[length-1-i] = swapBucket;
        }

        times = times % length;

        // Reversing first x elements (x = times)
        for (int i=0; i<times/2; i++) {
            int swapBucket = array[i];
            array[i] = array[times-1-i];
            array[times-1-i] = swapBucket;
        }

        // Reversing the rest
        for (int i=0; i<(length-times)/2; i++) {
            int swapBucket = array[i+times];
            array[i+times] = array[length-1-i];
            array[length-1-i] = swapBucket;
        }

        return array;
    }
}

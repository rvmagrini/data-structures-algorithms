package com.rvmagrini.algorithms.array;

import java.util.Arrays;

public class SortSquareValues {

    public static void main(String[] args) {

        int[] intArray = { -4, -1, 0, 3, 10, 14 };
        System.out.println("Array: " + Arrays.toString(intArray));
        System.out.println("Array of Sorted Square Values: " + Arrays.toString(sortSquareValues(intArray)));

    }

    public static int[] sortSquareValues(int[] array) {
        int length = array.length;
        int[] sortedArray = new int[length];
        int startPointer = 0;
        int endPointer = length-1;

        for (int i=length-1; i>=0; i--) {
            if (Math.abs(array[startPointer]) > Math.abs(array[endPointer])) {
                sortedArray[i] = array[startPointer] * array[startPointer];
                startPointer++;
            } else {
                sortedArray[i] = array[endPointer] * array[endPointer];
                endPointer--;
            }
        }
        return sortedArray;
    }

}

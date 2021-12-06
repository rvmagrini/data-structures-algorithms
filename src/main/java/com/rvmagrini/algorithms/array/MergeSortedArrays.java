package com.rvmagrini.algorithms.array;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {

        int[] intArray1 = { 1, 5, 6, 7, 8, 10, 12, 15};
        int[] intArray2 = { 2, 3, 4, 9, 11, 13, 14};
        System.out.println("Merged array: " + Arrays.toString(mergeSortedArrays(intArray1, intArray2)));

    }

    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        int[] merged = new int[length1 + length2];
        int pointer1 = 0;
        int pointer2 = 0;
        int pointerMerged = 0;

        while (pointer1 < length1 && pointer2 < length2) {
            if (array1[pointer1] < array2[pointer2]) {
                merged[pointerMerged] = array1[pointer1];
                pointer1++;
            } else {
                merged[pointerMerged] = array2[pointer2];
                pointer2++;
            }
            pointerMerged++;
        }

        while (pointer1 < length1) {
            merged[pointerMerged] = array1[pointer1];
            pointer1++;
            pointerMerged++;
        }

        while (pointer2 < length2) {
            merged[pointerMerged] = array2[pointer2];
            pointer2++;
            pointerMerged++;
        }

        return merged;
    }

}

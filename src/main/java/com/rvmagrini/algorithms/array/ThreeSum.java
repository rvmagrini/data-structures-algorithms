package com.rvmagrini.algorithms.array;

import java.util.Arrays;

public class ThreeSum {

    public static void main(String[] args) {

        int[] intArray = { 2, 4, 3, 7, 1, 0, 5, -1 };
        findThreeSum(intArray, 6);

    }

    public static void findThreeSum(int[] array, int target) {
        System.out.println("Array: " + Arrays.toString(array));

        for (int i=0; i<array.length-1; i++) {
            if (array[i] > array[i+1]) {
                int swapBucket = array[i];
                array[i] = array[i+1];
                array[i+1] = swapBucket;
                i = -1;
            }
        }
        System.out.println("Sorting: " + Arrays.toString(array));
        System.out.println("Triplets that sum to " + target + ":");

        for (int first=0; first<array.length-2; first++) {
            int second = first + 1;
            int last = array.length-1;
            while (second < last) {
                int sum = array[first] + array[second] + array[last];
                if (sum == target) {
                    System.out.println("[ " + array[first] + ", " + array[second] + ", " + array[last] + " ]");
                    second++;
                    last--;
                } else if (sum < target) {
                    second++;
                } else {
                    last--;
                }
            }
        }
    }

}

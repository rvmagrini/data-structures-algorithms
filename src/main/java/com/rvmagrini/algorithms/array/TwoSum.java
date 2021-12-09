package com.rvmagrini.algorithms.array;

public class TwoSum {

    public static void main(String[] args) {

        int[] intArray = { 2, 11, 5, 10, 7, 8 };
        findTwoSumIndexes(intArray, 9);
        findTwoSumIndexes(intArray, 15);
        findTwoSumIndexes(intArray, 14);

    }

    public static void findTwoSumIndexes(int[] array, int target) {
        int length = array.length;
        for (int i=0; i<length-1; i++) {
            for (int j=i+1; j<length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println("Indexes of integers that sum to " + target + ": [ " + i + ", " + j + " ]");
                    return;
                }
            }
        }
        System.out.println("There isn't two integers that sum to " + target);
    }

}

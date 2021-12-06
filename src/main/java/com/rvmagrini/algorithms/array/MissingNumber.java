package com.rvmagrini.algorithms.array;

public class MissingNumber {

    public static void main(String[] args) {

        int[] intArray = { 3, 1, 5, 6, 4, 2, 7, 8, 10 };
        System.out.println("Missing number: " + findMissingNumber(intArray));

    }

    public static int findMissingNumber(int[] array) {

        int range = array.length + 1;
        int sum = range * (range + 1) / 2;
        int missing;

        for (int number : array) {
            sum -= number;
            }
        missing = sum;
        return missing;
        }

}

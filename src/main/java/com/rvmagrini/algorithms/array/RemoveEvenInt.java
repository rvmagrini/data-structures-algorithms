package com.rvmagrini.algorithms.array;

import java.util.Arrays;

public class RemoveEvenInt {

    public static void main(String[] args) {

        int[] intArray = { 4, 9, 6, 8, 15, 11, 12, 19, 21 };
        System.out.println("Odd Array: " + Arrays.toString(removeEvenInt(intArray)));

    }

    public static int[] removeEvenInt(int[] array) {
        int oddCount = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                oddCount++;
            }
        }

        int oddArrayIndex = 0;
        int[] oddArray = new int[array.length - oddCount];
        for (int number : array) {
            if (number % 2 != 0) {
                oddArray[oddArrayIndex] = number;
                oddArrayIndex++;
            }
        }
        return oddArray;
    }

}

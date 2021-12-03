package com.rvmagrini.algorithms.array;

public class SecondMaxMinValue {

    public static void main(String[] args) {

        int[] intArray = { 21, 4, 6, 21, 9, 24, 24, 4, 6, 2 };
        System.out.println("Second Max Value: " + findSecondMaxValue(intArray));
        System.out.println("Second Min Value: " + findSecondMinValue(intArray));

    }

    public static int findSecondMaxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int number : array) {
            if (number > max) {
                secondMax = max;
                max = number;
            }

            if (number > secondMax && number < max) {
                secondMax = number;
            }
        }
        return secondMax;
    }

    public static int findSecondMinValue(int[] array) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int number : array) {
            if (number < min) {
                secondMin = min;
                min = number;
            }

            if (number < secondMin && number > min) {
                secondMin = number;
            }
        }
        return secondMin;
    }

}

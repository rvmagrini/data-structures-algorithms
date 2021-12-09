package com.rvmagrini.algorithms.array;

public class MaxSumSubArray {

    public static void main(String[] args) {

        int[] intArray = { 2, 7, 3, 5, 8, 1 };
        System.out.println("Solution 1");
        System.out.println("Max sum of SubArray of size 2: " + findMaxSumSubArray1(intArray, 2));
        System.out.println("Max sum of SubArray of size 3: " + findMaxSumSubArray1(intArray, 3));
        System.out.println("Max sum of SubArray of size 4: " + findMaxSumSubArray1(intArray, 4));

        System.out.println("Solution 2");
        System.out.println("Max sum of SubArray of size 2: " + findMaxSumSubArray2(intArray, 2));
        System.out.println("Max sum of SubArray of size 3: " + findMaxSumSubArray2(intArray, 3));
        System.out.println("Max sum of SubArray of size 4: " + findMaxSumSubArray2(intArray, 4));

    }

    public static int findMaxSumSubArray1(int[] array, int size) {
        int length = array.length;
        int maxSum = 0;
        int windowSum = 0;
        int start = 0;

        for (int end=0; end<length; end++) {
            windowSum += array[end];
            if (end >= size-1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= array[start];
                start++;
            }
        }

        return maxSum;
    }

    public static int findMaxSumSubArray2(int[] array, int size) {
        int length = array.length;
        int maxSum = array[0];

        for (int i=1; i<size; i++) {
            maxSum += array[i];
        }

        int windowSum = maxSum;
        for (int i=1; i<length-size+1; i++) {
            windowSum = windowSum - array[i-1] + array[i+size-1];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}

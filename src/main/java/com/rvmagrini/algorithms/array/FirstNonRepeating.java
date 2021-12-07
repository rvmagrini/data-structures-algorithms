package com.rvmagrini.algorithms.array;

public class FirstNonRepeating {

    public static void main(String[] args) {

        int[] intArray = { 1, 8, 10, 12, 13, 1, 8, 12};
        System.out.println("First non repeating value: " + findFirstNonRepeatingValue(intArray));

    }

    public static int findFirstNonRepeatingValue(int[] array) {

        for (int i=0; i<array.length; i++) {
            int count = 0;
            for (int j=0; j<array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
                if (count < 2 && j == array.length-1) {
                    return array[i];
                }
            }
        }
        System.out.println("Value not found, all values are repeating");
        return -1;
    }

}

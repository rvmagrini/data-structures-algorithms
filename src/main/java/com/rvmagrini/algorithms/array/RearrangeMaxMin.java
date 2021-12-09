package com.rvmagrini.algorithms.array;

import java.util.Arrays;

public class RearrangeMaxMin {

    public static void main(String[] args) {

        int[] intArray = { -12, -5, -3, -1, 4, 7, 10, 11 };
        System.out.println("Rearranged Array in max-min: " + Arrays.toString(rearrangeArrayMaxMin(intArray)));

    }

    public static int[] rearrangeArrayMaxMin(int[] array) {
        int[] rearranged = new int[array.length];
        int maxPointer = array.length-1;
        int minPointer = 0;

        for (int i=0; i<array.length; i+=2) {
            if (array[maxPointer] == array[minPointer]) {
                rearranged[i] = array[maxPointer];
                break;
            }
            rearranged[i] = array[maxPointer];
            rearranged[i+1] = array[minPointer];
            maxPointer--;
            minPointer++;
        }

        return rearranged;
    }

}

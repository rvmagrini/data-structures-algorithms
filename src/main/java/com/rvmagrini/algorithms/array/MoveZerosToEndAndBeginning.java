package com.rvmagrini.algorithms.array;

import java.util.Arrays;

public class MoveZerosToEndAndBeginning {

    public static void main(String[] args) {

        int[] intArray = { 0, 1, 5, 0, 8, 0, 6, 2, 0, 9 };
        System.out.println("Zeros to End: " + Arrays.toString(moveZerosToEnd(intArray)));
        System.out.println("Zeros to Beginning: " + Arrays.toString(moveZerosToBeginning(intArray)));

    }

    public static int[] moveZerosToEnd(int[] array) {
        int zeroPointer = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i] != 0 && array[zeroPointer] == 0) {
                int temp = array[i];
                array[i] = array[zeroPointer];
                array[zeroPointer] = temp;
            }
            if (array[zeroPointer] != 0) {
                zeroPointer++;
            }
        }
        return array;
    }

    public static int[] moveZerosToBeginning(int[] array) {
        int zeroPointer = array.length-1;
        for (int i=array.length-1; i>=0; i--) {
            if (array[i] != 0 && array[zeroPointer] == 0) {
                int temp = array[i];
                array[i] = array[zeroPointer];
                array[zeroPointer] = temp;
            }
            if (array[zeroPointer] != 0) {
                zeroPointer--;
            }
        }
        return array;
    }

}

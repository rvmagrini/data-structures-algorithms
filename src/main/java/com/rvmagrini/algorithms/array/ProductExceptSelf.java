package com.rvmagrini.algorithms.array;

import java.util.Arrays;

public class ProductExceptSelf {

    public static void main(String[] args) {
        int[] intArray = new int[] { 1, 2, 3, 4, 5 };
        System.out.println("Array: " + Arrays.toString(intArray));
        System.out.println("Find Product Array 1: " + Arrays.toString(findProductArrayExceptSelf1(intArray)));
        System.out.println("Find Product Array 2: " + Arrays.toString(findProductArrayExceptSelf2(intArray)));
    }

    public static int[] findProductArrayExceptSelf1(int[] array) {
        int length = array.length;
        int[] productArray = new int[length];

        int leftProduct = 1;
        for (int i=0; i<length; i++) {
            productArray[i] = leftProduct;
            leftProduct *= array[i];
        }

        int rightProduct = 1;
        for (int i=length-1; i>=0; i--) {
            productArray[i] *= rightProduct;
            rightProduct *= array[i];
        }

        return productArray;
    }

    public static int[] findProductArrayExceptSelf2(int[] array) {
        int length = array.length;
        int[] leftProduct = new int[length];
        int[] rightProduct = new int[length];
        int[] productArray = new int[length];

        leftProduct[0] = 1;
        rightProduct[length-1] = 1;

        for (int i=1; i<length; i++) {
            leftProduct[i] = array[i-1] * leftProduct[i-1];
        }

        for (int i=length-2; i>=0; i--) {
            rightProduct[i] = array[i+1] * rightProduct[i+1];
        }

        for (int i=0; i<length; i++) {
            productArray[i] = leftProduct[i] * rightProduct[i];
        }

        return productArray;
    }

}

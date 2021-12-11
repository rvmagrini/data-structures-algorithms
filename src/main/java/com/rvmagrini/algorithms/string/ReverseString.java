package com.rvmagrini.algorithms.string;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println(reverseString("hello"));
        System.out.println(reverseString("there"));

    }

    public static String reverseString(String string) {
        char[] strChar = string.toCharArray();
        int startPointer = 0;
        int endPointer = string.length()-1;

        while (startPointer < endPointer) {
            char swapBucket = strChar[startPointer];
            strChar[startPointer] = strChar[endPointer];
            strChar[endPointer] = swapBucket;
            startPointer++;
            endPointer--;
        }

        return String.valueOf(strChar);
    }
}

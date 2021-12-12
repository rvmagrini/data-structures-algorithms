package com.rvmagrini.algorithms.string;

public class ReverseOnlyLetters {

    public static void main(String[] args) {

        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.out.println(reverseOnlyLetters("1:Arr-2:Cha-3:Str"));

    }

    public static String reverseOnlyLetters(String string) {
        int length = string.length();
        char[] strArray = string.toCharArray();

        int startPointer = 0;
        int endPointer = length-1;
        while (startPointer < endPointer) {
            if (Character.isLetter(strArray[startPointer]) && Character.isLetter(strArray[endPointer])) {
                char swapBucket = strArray[startPointer];
                strArray[startPointer] = strArray[endPointer];
                strArray[endPointer] = swapBucket;
                startPointer++;
                endPointer--;
            } else if (!Character.isLetter(strArray[startPointer])) {
                startPointer++;
            } else {
                endPointer--;
            }
        }
        return String.valueOf(strArray);
    }

}

package com.rvmagrini.algorithms.string;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println("Is '1mA... daM1' a valid Palindrome? -> " + isPalindrome("1mA... daM1"));
        System.out.println("Is 'A man, a plan, a canal: Panama' a valid Palindrome? -> " + isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println("Is 'race a car' a valid Palindrome? -> " + isPalindrome("race a car"));

    }

    public static boolean isPalindrome(String string) {
        StringBuilder alphaNumStrBuilder = new StringBuilder();
        for (char c : string.toCharArray()) {
            if (Character.isDigit(c) || Character.isLetter(c)) {
                alphaNumStrBuilder.append(c);
            }
        }

        String alphaNumStr = alphaNumStrBuilder.toString().toLowerCase();
        int startPointer = 0;
        int endPointer = alphaNumStr.length()-1;
        while (startPointer < endPointer) {
            if (alphaNumStr.charAt(startPointer) != alphaNumStr.charAt(endPointer)) {
                return false;
            }
            startPointer++;
            endPointer--;
        }
        return true;
    }

}

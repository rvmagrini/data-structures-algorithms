package com.rvmagrini.algorithms.string;

public class Pangram {

    public static void main(String[] args) {

        System.out.println("'The quick brown fox jumps over the lazy dog' uses every letter of the alphabet? -> " + isPangram("The quick brown fox jumps over the lazy dog."));
        System.out.println("'The quick fox jumps over the dog' uses every letter of the alphabet? -> " + isPangram("The quick fox jumps over the dog."));
    }

    public static boolean isPangram(String string) {
        String str = string.toLowerCase();
        int length = string.length();

        if (length < 26) {
            return false;
        }

        for (char c='a'; c<='z'; c++) {
            if (str.indexOf(c) < 0) {
                return false;
            }
        }
        return true;
    }

}

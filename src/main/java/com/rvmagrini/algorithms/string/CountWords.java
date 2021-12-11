package com.rvmagrini.algorithms.string;

public class CountWords {

    public static void main(String[] args) {

        System.out.println(countWords("Count the number of words."));
        System.out.println(countWords(""));
        System.out.println(countWords("Please count words."));

    }

    public static int countWords(String string) {
        int words = 0;
        int length = string.length();

        if (length == 0) {
            return words;
        }

        if (string.charAt(0) != ' ') {
            words++;
        }

        for (int i=0; i<length; i++) {
            if (string.charAt(i) == ' ' && string.charAt(i+1) != ' ') {
                words++;
            }
        }

        return words;
    }

}

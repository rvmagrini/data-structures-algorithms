package com.rvmagrini.algorithms.string;

public class WordsLength {

    public static void main(String[] args) {

        printWordsLength("Hello world... Is there anybody out there?");

    }

    public static void printWordsLength(String string) {
        char[] chars = string.toCharArray();

        for (int i=0; i<string.length(); i++) {
            StringBuilder word = new StringBuilder();
            while (i < chars.length && chars[i] != ' ') {
                if (Character.isLetter(chars[i])) {
                    word.append(chars[i]);
                }
                i++;
            }

            if (word.length() > 0) {
                System.out.println(word + ": " + word.length() + " chars");
            }
        }
    }

}

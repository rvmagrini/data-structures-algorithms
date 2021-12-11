package com.rvmagrini.algorithms.string;

public class CountCharacterOccurrence {

    public static void main(String[] args) {

        System.out.println("a: " + countCharOccurrence("a", "Count how many 'a' characters this sentence has"));
        System.out.println("o: " + countCharOccurrence("o", "Count how many 'o' characters this sentence has"));
        System.out.println("c: " + countCharOccurrence("c", "Count how many 'c' characters this sentence has"));

    }

    public static int countCharOccurrence(String character, String string) {
        int length = string.length();
        int lengthWithoutChar = string.replace(character, "").length();
        return length - lengthWithoutChar;
    }

}
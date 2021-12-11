package com.rvmagrini.algorithms.string;

public class Anagram {

    public static void main(String[] args) {

        System.out.println("'acb' and 'aac': " + isAnagram("acb", "aac"));
        System.out.println("'aca' and 'aac': " + isAnagram("aca", "aac"));

    }

    public static boolean isAnagram(String string1, String string2) {
        int[] countChars = new int[256];
        for (int i=0; i<string1.length(); i++) {
            countChars[string1.charAt(i)]++;
            countChars[string2.charAt(i)]--;
        }

        for (int c : countChars) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }

}

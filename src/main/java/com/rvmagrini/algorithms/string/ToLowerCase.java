package com.rvmagrini.algorithms.string;

public class ToLowerCase {

    public static void main(String[] args) {

        System.out.println(toLowerCase("iMPLEmenting To LoWer CaSe funCTION"));

    }

    public static String toLowerCase(String string) {
        StringBuilder lowerCase = new StringBuilder();

        for (char c: string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                lowerCase.append((char) (c+32));
            } else {
                lowerCase.append(c);
            }
        }

        return lowerCase.toString();
    }

}

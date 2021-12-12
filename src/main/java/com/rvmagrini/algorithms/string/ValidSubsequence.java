package com.rvmagrini.algorithms.string;

public class ValidSubsequence {

    public static void main(String[] args) {

        System.out.println("Is 'bdi' subsequence of 'abcdefghij'? -> " + isSubsequence("bdi", "abcdefghij"));
        System.out.println("Is 'aid' subsequence of 'abcdefghij'? -> " + isSubsequence("aid", "abcdefghij"));
        System.out.println("Is 'dfj' subsequence of 'abcdefghij'? -> " + isSubsequence("dfj", "abcdefghij"));
        System.out.println("Is 'fji' subsequence of 'abcdefghij'? -> " + isSubsequence("fji", "abcdefghij"));

    }

    public static boolean isSubsequence(String sequence, String string) {
        int strPointer = 0;
        int seqPointer = 0;

        while (seqPointer < sequence.length() && strPointer < string.length()) {
            if (sequence.charAt(seqPointer) == string.charAt(strPointer)) {
                seqPointer++;
            }
            strPointer++;
        }

        return seqPointer == sequence.length();
    }

}

package com.rvmagrini.algorithms.stack;

import com.rvmagrini.datastructures.stack.MyStack;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println(reverseString("Reversing string using MyStack"));
        System.out.println(reverseString("Hello"));
    }

    public static String reverseString(String string) {
        MyStack<Character> stringStack = new MyStack<>();
        char[] charsArray = string.toCharArray();

        for (char c : charsArray) {
            stringStack.push(c);
        }

        for (int i=0; i<string.length(); i++) {
            charsArray[i] = stringStack.pop();
        }

        return new String(charsArray);
    }

}

package com.rvmagrini.algorithms.stack;

import com.rvmagrini.datastructures.stack.MyStack;

public class RemoveAdjacentDuplicates {

    public static void main(String[] args) {

        System.out.println(removeAdjacentDuplicates("abbaca"));
        System.out.println(removeAdjacentDuplicates("lkktttl"));

    }

    public static String removeAdjacentDuplicates(String string) {
        MyStack<Character> stack = new MyStack<>();

        for (Character c : string.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                if (stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }

        StringBuilder str = new StringBuilder();
        while (!stack.isEmpty()) {
            str.insert(0, stack.pop());
        }

        return str.toString();
    }

}

package com.rvmagrini.algorithms.stack;

import com.rvmagrini.datastructures.stack.MyStack;

public class ValidParentheses {

    public static void main(String[] args) {

        String str = "{[()]}";
        System.out.println(str + ": " + isValid(str));

        String str2 = "{[(]}";
        System.out.println(str2 + ": " + isValid(str2));

        String str3 = "(){[({})]}[]";
        System.out.println(str3 + ": " + isValid(str3));

    }

    public static boolean isValid(String string) {
        MyStack<Character> stack = new MyStack<>();

        for (char c : string.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    if ((c == '}' && stack.peek() == '{') ||
                            (c == ']' && stack.peek() == '[') ||
                            (c == ')' && stack.peek() == '(') ) {
                        stack.pop();
                    }
                }
            }
        }

        return stack.isEmpty();
    }

}

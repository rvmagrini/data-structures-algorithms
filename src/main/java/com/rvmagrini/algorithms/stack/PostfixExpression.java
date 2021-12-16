package com.rvmagrini.algorithms.stack;

import com.rvmagrini.datastructures.stack.MyStack;

public class PostfixExpression {

    public static void main(String[] args) {

        System.out.println(evaluatePostfixExpression("2 3 + 1 -"));
        System.out.println(evaluatePostfixExpression("2 3 4 * +"));
        System.out.println(evaluatePostfixExpression("3 4 5 + * 6 1 2 + / -"));

    }

    public static int evaluatePostfixExpression(String string) {
        MyStack<Integer> stack = new MyStack<>();

        for (char c : string.toCharArray()) {
            if (c == ' ') {
                continue;
            }

            if (Character.isDigit(c)) {
                stack.push(c - 48);
            } else {
                int firstPop = stack.pop();
                int secPop = stack.pop();

                if (c == '*') {
                    stack.push(secPop * firstPop);
                } else if (c == '/') {
                    stack.push(secPop / firstPop);
                } else if (c == '+') {
                    stack.push(secPop + firstPop);
                } else if (c == '-') {
                    stack.push(secPop - firstPop);
                }
            }
        }

        return stack.pop();
    }

}

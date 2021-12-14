package com.rvmagrini.algorithms.stack;

import com.rvmagrini.datastructures.stack.MyStack;

public class SortStack {

    public static void main(String[] args) {

        MyStack<Integer> intStack = new MyStack<>();
        intStack.push(2);
        intStack.push(4);
        intStack.push(1);
        intStack.push(7);
        intStack.push(3);
        intStack.push(6);
        intStack.push(5);
        System.out.println(intStack);
        System.out.println("Sorted " + sortStack(intStack));

    }

    public static MyStack<Integer> sortStack(MyStack<Integer> stack) {
        MyStack<Integer> sortedStack = new MyStack<>();

        if (!stack.isEmpty()) {
            sortedStack.push(stack.pop());
        }

        while (!stack.isEmpty()) {
            int popped = stack.pop();

            while (!sortedStack.isEmpty() &&
                popped < sortedStack.peek()) {
                stack.push(sortedStack.pop());
            }
            sortedStack.push(popped);
        }

        while (!sortedStack.isEmpty()) {
            stack.push(sortedStack.pop());
        }

        return stack;
    }

}


package com.rvmagrini.algorithms.stack;

import com.rvmagrini.datastructures.stack.MyStack;

import java.util.EmptyStackException;

public class StackWithGetMinMax extends MyStack<Integer> {

    private final MyStack<Integer> minStack;
    private final MyStack<Integer> maxStack;

    public StackWithGetMinMax() {
        this.minStack = new MyStack<>();
        this.maxStack = new MyStack<>();
    }

    @Override
    public void push(Integer value) {
        if (maxStack.isEmpty() && minStack.isEmpty()) {
            maxStack.push(value);
            minStack.push(value);
        } else {
            maxStack.push(Math.max(value, maxStack.peek()));
            minStack.push(Math.min(value, minStack.peek()));
        }

        super.push(value);
    }

    @Override
    public Integer pop() {
        if (maxStack.isEmpty() || minStack.isEmpty()) {
            throw new EmptyStackException();
        } else {
            maxStack.pop();
            minStack.pop();
        }

        return super.pop();
    }

    public Integer getMin() {
        return minStack.peek();
    }

    public Integer getMax() {
        return maxStack.peek();
    }

    public static void main(String[] args) {

        StackWithGetMinMax stackMinMax = new StackWithGetMinMax();
        stackMinMax.push(40);
        stackMinMax.push(10);
        stackMinMax.push(0);
        stackMinMax.push(30);
        stackMinMax.push(20);

        System.out.println(stackMinMax);
        System.out.println("GetMax: " + stackMinMax.getMax());
        System.out.println("Max " + stackMinMax.maxStack);
        System.out.println("GetMin: " + stackMinMax.getMin());
        System.out.println("Min " + stackMinMax.minStack);

    }

}

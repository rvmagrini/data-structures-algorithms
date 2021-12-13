package com.rvmagrini.datastructures.stack;

import java.util.EmptyStackException;

public class MyStack<T> {

    private ListNode<T> top;
    private int length;

    private static class ListNode<T> {
        private ListNode<T> next;
        private T value;

        public ListNode(T value) {
            this.value = value;
        }
    }

    public MyStack() {
        top = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void push(T value) {
        ListNode<T> newNode = new ListNode<>(value);
        newNode.next = top;
        top = newNode;
        length++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        T topValue = top.value;
        top = top.next;
        length--;
        return topValue;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return top.value;
    }

    @Override
    public String toString() {
        String toString;
        if (isEmpty()) {
            toString = "Stack [top=" + top + ", length=" + length + "]: Stack is empty";
        } else {
            toString = "Stack [top=" + top.value + ", length=" + length + "]";
            toString += ": (" + top.value + ")";
            ListNode<T> currentNode = top.next;
            while (currentNode != null) {
                toString += " | " + currentNode.value;
                currentNode = currentNode.next;
            }
            toString += " | null";
        }
        return toString;
    }

    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        System.out.println(myStack);
        myStack.push(5);
        myStack.push(10);
        myStack.push(20);
        System.out.println("Pushed: 5, 10, 20");
        System.out.println(myStack);
        System.out.println("Popped: " + myStack.pop());
        System.out.println(myStack);
        System.out.println("Peeked: " + myStack.peek());
        System.out.println("Popped: " + myStack.pop());
        System.out.println("Popped: " + myStack.pop());
        System.out.println(myStack);

    }
}

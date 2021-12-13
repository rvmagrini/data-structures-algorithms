package com.rvmagrini.datastructures.stack;

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
        myStack.top = new ListNode<>(5);
        myStack.length++;
        System.out.println(myStack);
    }
}

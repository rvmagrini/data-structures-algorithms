package com.rvmagrini.datastructures.queue;

public class MyQueue<T> {

    private ListNode<T> front;
    private ListNode<T> rear;
    private int length;

    public static class ListNode<T> {
        private ListNode<T> next;
        private T value;

        public ListNode(T value) {
            this.value = value;
        }
    }

    public MyQueue() {
        front = null;
        rear = null;
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
            toString = "Queue [front=" + front + ", rear=" + rear + ", length=" + length + "]: Queue is empty";
        } else {
            toString = "Queue [front=" + front.value + ", rear=" + rear.value + ", length=" + length + "]: (front) " + front.value;
            ListNode<T> currentNode = front.next;
            while (currentNode != null) {
                toString += " - " + currentNode.value;
                currentNode = currentNode.next;
            }
            toString += " (rear)";
        }
        return toString;
    }


    public static void main(String[] args) {

        MyQueue<Integer> myQueue = new MyQueue<>();
        System.out.println(myQueue);
        myQueue.front = new ListNode<>(1);
        myQueue.rear = new ListNode<>(2);
        myQueue.front.next = myQueue.rear;
        myQueue.length = 2;
        System.out.println(myQueue);

    }

}

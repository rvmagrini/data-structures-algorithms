package com.rvmagrini.datastructures.queue;

import java.util.NoSuchElementException;

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

    public void enqueue(T value) {
        ListNode<T> newNode = new ListNode<>(value);

        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }

        rear = newNode;
        length++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        T dequeued = front.value;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        length--;
        return dequeued;
    }

    public T first() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        return front.value;
    }

    public T last() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        return rear.value;
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

        // Enqueue
        System.out.println("Enqueued 1, 2, 3, 4, 5");
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        System.out.println(myQueue);

        // Dequeue
        System.out.println("Dequeued: " + myQueue.dequeue());
        System.out.println("Dequeued: " + myQueue.dequeue());
        System.out.println(myQueue);

        // First & Last elements
        System.out.println("First element: " + myQueue.first());
        System.out.println("Last element: " + myQueue.last());

    }

}

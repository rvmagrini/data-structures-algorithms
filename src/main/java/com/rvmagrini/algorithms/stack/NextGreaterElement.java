package com.rvmagrini.algorithms.stack;

import com.rvmagrini.datastructures.stack.MyStack;

import java.util.Arrays;

public class NextGreaterElement {

    public static void main(String[] args) {
        
        int[] intArray = { 9, 4, 7, 3, 4, 8, 1 };
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(createArrayWithNextGreaterElement(intArray)));

    }

    public static int[] createArrayWithNextGreaterElement(int[] array) {
        int[] nextGreaterArray = new int[array.length];
        MyStack<Integer> stack = new MyStack<>();
        
        for (int i=array.length-1; i>=0; i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() &&
                        stack.peek() <= array[i]) {
                    stack.pop();
                }
            }
            
            if (stack.isEmpty()) {
                nextGreaterArray[i] = -1;
            } else {
                nextGreaterArray[i] = stack.peek();
            }

            stack.push(array[i]);
        }

        return nextGreaterArray;
    }

}

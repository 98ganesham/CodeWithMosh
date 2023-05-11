package com.codewithmosh1;
import java.util.Stack;

import java.util.Queue;

public class Reversing{
    public static  void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while (!queue .isEmpty())
            stack.push(queue.remove());
        while(!stack.isEmpty())
            queue.add(stack.pop());
    }
}
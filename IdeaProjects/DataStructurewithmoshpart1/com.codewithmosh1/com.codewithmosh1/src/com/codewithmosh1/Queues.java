package com.codewithmosh1;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

import static com.codewithmosh1.Reversing.reverse;

public class Queues{
    public static void main(String [] args){
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    queue.add(2);
    queue.add(1);
    queue.add(4);
    queue.add(10);
    queue.add (11);
    queue.add(100);
    queue.add(77);
    queue.add(-12);
    queue.add(-15);
   var first = queue.remove(99);
        System.out.println(first);
        System.out.println(queue);

    }
}
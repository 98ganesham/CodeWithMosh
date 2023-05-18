package com.codewithmosh1;

import java.util.Arrays;

public class QueuewithArray{
    private int [] items ;
    private int count;
    private int rear;
    private int front;
    public QueuewithArray(int capacity){
        items = new int [capacity];
    }
    public void enqueue (int item){
        if(count == items.length)
            throw new IllegalStateException();
        items[rear++] = item;
        count++;

    }
    public int dequeue(){
        var item = items[front];
        items[front++] = 0;
        count--;
        return item ;
    }
    @Override
    public String toString(){
       return  Arrays.toString(items);
    }
}



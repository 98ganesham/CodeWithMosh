package com.codewithmosh1;


import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueues {
    private int[] items = new int[10];
    private int count;
    public void add(int item){
        if (isfull())
            throw new IllegalStateException();
        var i = shiftItemsToInsert (item);
           items[i]= item;
           count++;
    }
    public boolean isfull(){
        return count == items.length;
    }
    public int shiftItemsToInsert(int item){
        int i;
        for ( i = count - 1; i >=0; i--){
            if (items[i]> item)
                items[i +1] = items[i];
            else
                break;

        }
        return i + 1;
    }
    public int remove(){
        if(isEmpty())
            throw new IllegalStateException();
        return items[--count];
    }
    public boolean isEmpty(){
        return count == 0;
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }
}

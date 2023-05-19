package com.codewithmosh1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int [] numbers = {5,3,8,4,1,2,0};
        Heapify.heapify(numbers);
        System.out.println(Heapify.gethKLargest(numbers,7 ));
    }
}

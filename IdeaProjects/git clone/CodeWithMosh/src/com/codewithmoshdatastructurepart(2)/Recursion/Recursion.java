package com.codewithmosh1;
public class Recursion {
    public static void main(String [] args){
        System.out.println(factorial(4));
    }
    public static int factorial (int n){
        if( n == 0)
            return 1;
        return n*factorial(n-1);

    }
}


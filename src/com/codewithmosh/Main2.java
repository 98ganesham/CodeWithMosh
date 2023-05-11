package com.codewithmosh;

import com.sun.jdi.IntegerValue;

import java.util.Stack;

public class Main2 {
    public static void main(String [] arg) {
        String str = "abcd";
        StringReversing reverser = new StringReversing();
        var result = reverser.reverse(str);
        System.out.println(result);
    }
}

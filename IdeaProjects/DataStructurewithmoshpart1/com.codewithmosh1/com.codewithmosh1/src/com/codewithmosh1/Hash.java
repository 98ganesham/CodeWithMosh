package com.codewithmosh1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Hash{
    public static void main(String[]str){
        HashTable table = new HashTable();
        table.put(1, "A");
        table.put(2, "C");
        table.put(3, "B");
        table.put(4, "D");
        table.put(5, "E");
        table.remove(5);

        System.out.println(table.get(5));

    }
}

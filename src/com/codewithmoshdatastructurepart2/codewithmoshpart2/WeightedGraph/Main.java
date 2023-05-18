package com.codewithmosh1;

import com.Array;

public class Main{
    public static void main(String [] names) {
        var graph =  new WeightedGraph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addEdge("A", "B", 3 );
        graph.print();
    }
}
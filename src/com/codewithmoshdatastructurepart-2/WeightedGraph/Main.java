package com.codewithmosh1;
import java.util.*;
public class Main{
    public static void main(String [] args) {
        var graph = new WeightedGraph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addEdge("A", "B", 0);
        graph.addEdge("B", "C", 0);
        graph.addEdge("C", "A", 0);
//        graph.addEdge("A", "C", 10);
//        var path = graph.getShortestPath("A", "C" );
//        System.out.println(path);
        System.out.println(graph.hasCycle());

    }
}


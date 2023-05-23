package com.codewithmosh1;

import com.codewithmosh.Trie;

public class Main {
    public static void main(String[] args){
        var graph = new Graph();
        graph.addNode("X");
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("P");
        graph.addEdge("X", "A");
        graph.addEdge("X", "B");
        graph.addEdge("A", "P");
        graph.addEdge("B", "P");
        //       graph.removeEdge("B","C");
//        graph.removeNode("C");
        //graph.print();
        //graph.traverseDepthFirstbyRec("D");
//        graph.traverseDepthFirst("A");
//       graph.traverseBreadthFirst("A");
         var list =  graph.topologicalSort();
        System.out.println(list);

    }
}

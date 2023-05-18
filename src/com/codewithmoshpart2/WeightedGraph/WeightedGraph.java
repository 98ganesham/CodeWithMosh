package com.codewithmosh1;

import java.util.*;

public class WeightedGraph{
    private class Node{
        private String label;
        private Node(String label){
            this.label = label;
        }
        private List<Edge> edges = new ArrayList<>();
        @Override
        public String toString() {
            return label;
        }
        private String getLabel(){
            return label;
        }
        public void addEdge(Node to, int weight){
            edges.add(new Edge(this, to, weight));
        }
        public List<Edge> getEdges(){
            return edges;
        }
    }
    private class Edge{
        private Node from;
        private Node to;
        private int weight;


        public Edge(Node from, Node to, int weigth){
            this.from = from;
            this.to = to;
            this.weight= weight;
        }
        @Override
        public String toString() {
            return from + "->" + to;

        }
    }
    private Map<String, Node> nodes = new HashMap<>();
    public void addNode(String label){
        nodes.putIfAbsent(label,new Node(label));
    }
    public void addEdge(String from, String to, int weight){
        var fromNode  = nodes.get(from);
        if (fromNode == null)
            throw new IllegalArgumentException();
        var toNode = nodes.get(to);
        if(toNode == null)
            throw new IllegalArgumentException();
        fromNode.addEdge(toNode, weight);
        toNode.addEdge(fromNode, weight);
    }
    public void print(){
            for ( var node: nodes.values()){
                var edges = node.getEdges();
                if(!edges.isEmpty())
                    System.out.println( node + " is  connected to " + edges);
            }
    }
    private class NodeEntry{
        private Node node;
        private int priority;
        public NodeEntry(Node node, int priority) {
            this.node = node;
            this.priority = priority;
        }

    }


}


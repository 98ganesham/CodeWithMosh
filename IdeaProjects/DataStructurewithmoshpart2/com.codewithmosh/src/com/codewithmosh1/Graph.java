package com.codewithmosh1;

import java.util.*;

public class Graph {
    public void graph1(){
        System.out.println(nodes.values());
    }
    private class Node{
        private String label;
        private Node(String label){
            this.label = label;
        }
        @Override
        public String toString() {
           return label;
        }
        private String getLabel(){
            return label;
        }
    }


    private Map<String, Node> nodes = new HashMap<>();
    private Map<Node, List<Node>> adjacencyList = new HashMap<>();
    public void addNode(String label){
        var node = new Node(label);
        nodes.putIfAbsent(label, node);
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }
    public void addEdge(String from, String to){
        var fromNode  = nodes.get(from);
        if (fromNode == null)
            throw new IllegalArgumentException();
        var toNode = nodes.get(to);
        if(toNode == null)
            throw new IllegalArgumentException();
        adjacencyList.get(fromNode).add(toNode);
    }
    public void print(){
        for ( var source: adjacencyList.keySet()){
            var tragerts = adjacencyList.get(source);
            if(!tragerts.isEmpty())
                System.out.println( source+ " is  connected to " + tragerts);
        }
    }
    public void removeNode(String label){
        var node = nodes.get(label);
        if ( node == null)
            return;
        for (var n: adjacencyList.keySet())
            adjacencyList.get(n).remove(node);
        adjacencyList.remove(node);
        nodes.remove(node);
    }
    public void removeEdge(String from, String to){
        var fromNode = nodes.get(from);
        var toNode = nodes.get(to);
        if(fromNode == null || toNode == null)
            return;
        adjacencyList.get(fromNode).remove(toNode);
    }
    public void traverseDepthFirstRC(String root){
        var node = nodes.get(root);
        if(node ==null)
            return;
        traverseDepthFirstRC(nodes.get(root), new HashSet<>());
    }
    private void traverseDepthFirstRC(Node root, Set<Node> visited){
        System.out.println(root);
        visited.add(root);
        for(var node:adjacencyList.get(root))
            if(!visited.contains(node))
                traverseDepthFirstRC(node,visited);
    }
    public void traverseDepthFirst(String root){
        var node = nodes.get(root);
        if(node == null)
            return;
        Set<Node> visited = new HashSet<>();
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()){
            var current = stack.pop();
            if( visited.contains(current))
                continue;
            System.out.println(current);
            visited.add(current);
            for(var neighbour: adjacencyList.get(current)){
                if(!visited.contains(neighbour))
                    stack.push(neighbour);
            }
        }
    }
    public void traverseBreathFirst(String root){
        var node = nodes.get(root);
        if(node == null)
            return;
        Set<Node> visited = new HashSet<>();
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);
        while(!queue.isEmpty()){
            var current = queue.remove();
            if(visited.contains(current))
                continue;
            System.out.println(current);
            visited.add(current);
            for(var neighbour:adjacencyList.get(current))
                if(!visited.contains(neighbour))
                    queue.add(neighbour);
        }
    }
    public List<String> TopologicalSort(){
        Stack<Node> stack = new Stack<>();
        Set<Node> visited = new HashSet<>();
        for (var node: nodes.values())
            TopologicalSort(node , visited, stack);
        List<String> sorted = new ArrayList<>();
        while(!stack.isEmpty())
            sorted.add(stack.pop().label);
        return sorted;
    }
    private void TopologicalSort(Node node, Set<Node> visited, Stack<Node>stack){
        if(visited.contains(nodes))
            return;
        visited.add(node);
        for(var neighbour: adjacencyList.get(node))
            TopologicalSort(neighbour, visited, stack);
        stack.push(node);
    }
    public boolean hasCycle(){
        Set<Node> all = new HashSet<>();
        all.addAll(nodes.values());
        Set<Node> visiting = new HashSet<>();
        Set<Node> visited = new HashSet<>();
        while(!all.isEmpty()){
            var current = all.iterator().next();
            hasCycle(current, all , visiting, visited);
        }
            return true;
    }
    private boolean hasCycle(Node node, Set<Node> all , Set<Node> visited, Set<Node> visiting){
        all.remove(node);
        visiting.add(node);
        for(var neighbour: adjacencyList.get(nodes)){
            if(visited.contains(neighbour))
                continue;
            if(visiting.contains(neighbour))
                return true;
            if(hasCycle())
                return true;
        }
        visiting.remove(node);
        visited.add(node);
        return false;


    }
}


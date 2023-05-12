package com.codewithmosh;

import java.sql.SQLOutput;

public class Tree{
    private class Node{
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node (int value){
            this .value = value;
        }
        @Override
        public  String toString(){
            return "Node="+ value;

        }

    }
    private Node root;
    public void insert(int value){
        var node = new Node(value);
        if (root == null){
            root = new Node(value);
            return;
        }
        var current = root;
        while(true){
            if(value< current.value){
                if(current.leftChild== null){
                    current.leftChild= node;
                    break;
                }
                current= current.leftChild;}
            else{
                if(current.rightChild== null){
                    current.rightChild= node;
                    break;}
                current = current.rightChild;
            }
        }
    }
    public boolean find(int value){
        var current = root;
        while (current != null){
            if(value < current.value)
                current = current.leftChild;
            else if(value > current. value)
                current = current.rightChild;
            else
                return true;
        }
        return false;
    }
    public void traversePreOrder(){traversePreOrder(root);}
    private void traversePreOrder(Node root){
        if(root == null)
            return;
        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }
    public void traverseInOrder(){traverseInOrder(root);}
    private void traverseInOrder(Node root){
        if (root == null)
            return;
        traverseInOrder(root.leftChild);
        System.out.println(root.value);
        traverseInOrder(root.rightChild);
    }
    public void traversePostOrder(){
        traversePostOrder (root);}
    private void traversePostOrder(Node root){
        if (root ==null)
            return;
        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.println(root.value);
    }
    public int height(){
        return height(root);
    }
    private int height(Node root){
        if(isLeaf(root))
            return root.value;
        return  1 + Math.max (height( root.leftChild), height(root.rightChild));
    }

    private boolean isLeaf(Node node){
        return node.leftChild == null && node.rightChild == null;
    }
    public int min(){
        if(root == null)
            throw new IllegalStateException();
        var current = root;
        var last = current;
        while (current != null){
            last = current;
            current = current.leftChild;
        }
       return last .value;
    }

    private int min(Node root){
        if(isLeaf(root))
            return root.value;
        var left = min (root.leftChild);
        var right= min (root.rightChild);
        return Math.min(Math.min(left, right), root.value);
    }
    public boolean equals(Tree other){
        if(other == null)
            return false;
        return equals(root, other.root);

    }
    private boolean equals(Node first, Node second){

        if(first == null && second == null)
            return true;
        if(first != null && second != null)
            return first.value == second.value
            && equals(first.leftChild, second.leftChild) && equals(first.rightChild, second.rightChild);
        return false;
    }
}
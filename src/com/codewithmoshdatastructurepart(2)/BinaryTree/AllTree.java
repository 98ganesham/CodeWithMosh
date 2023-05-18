package com.codewithmosh1;
public class AllTree{
    private class Node {
        private int value;
        private Node leftChild;

        private Node rightChild;
        public Node (int value){
            this.value = value;
        }
        @Override
        public String toString(){
            return"Node="+value;
        }
    }
    private Node root;
    public void insert(int value){
        var node = new Node(value);
        if(root == null){
            root = node ;
            return;

        }
        var current = root;
        while(true){
            if (value < current.value){
                if(current.leftChild == null){
                   current.leftChild = node;
                   break;
                }
                current = current.leftChild;
            }
            else{
                if(current.rightChild== null){
                        current.rightChild = node;
                        break;
                }
                current = current.rightChild;
            }
        }
    }
}
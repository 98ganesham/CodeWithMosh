package com.codewithmosh1;

import java.util.HashMap;

public class Trie{
    private class Node{
        private char value;
        private HashMap<Character, Node>children = new HashMap<>();
        private boolean isEndOfWord;
        public Node (char vale){
            this.value = value;
        }
        public boolean hasChild(char ch){
            return children.containsKey(ch);
        }
        public void addChild(char ch){
            children.put(ch, new Node(ch));
        }
        public Node getChild(char ch){
            return children.get(ch);}
        public Node[] getChildren(){
            return children.values().toArray(new Node[0]);
        }
    }
    private Node root = new Node(' ');
    public void insert(String Word) {
        var current = root;
        for (var ch : Word.toCharArray()) {
            if (!current.hasChild(ch))
                current.addChild(ch);
            current = current.getChild(ch);
       }
        current.isEndOfWord = true;
   }
    public boolean contains(String Word) {
        if (Word == null)
            return false;
        var current = root;
        for (var ch : Word.toCharArray()){
            if (!current.hasChild(ch))
                return false;
            current = current.getChild(ch);

        }
        return current.isEndOfWord;
    }
    public void traverse(){
        traverse(root);
    }
    private void traverse(Node root){
    System.out.println(root.value);
    for(var child : root.getChildren())
        traverse(child);
    }
    public void remove(String Word){
        remove(root, Word, 0 );
    }
    private void remove(Node root, String Word, int index){
        if(index == Word.length()){
            System.out.println(root.value);
            return;
        }
        var ch = Word.charAt(index);
        var child = root.getChild(ch);
        if (child == null)
            return;
        remove(child, Word, index+ 1);
        System.out.println(root.value);
    }

}

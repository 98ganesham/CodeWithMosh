package com.codewithmosh;

//      tree.traversePreOrder();
//        tree.traverseInOrder();
//      tree.traversePostOrder();
public class BinaryTree{
    public static void main (String [] args){
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        tree.insert(8);
        System.out.println(tree.min());
        Tree tree2 = new Tree();


        tree2.insert(7);
        tree2.insert(4);
        tree2.insert(9);
        tree2.insert(1);
        tree2.insert(6);
        //tree2.insert(8);
        tree2.insert(10);
        tree2.insert(8);
        System.out.println(tree.equals(null));
    }

}

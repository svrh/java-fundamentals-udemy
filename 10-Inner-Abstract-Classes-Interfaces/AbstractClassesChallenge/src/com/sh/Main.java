package com.sh;

public class Main {

    public static void main(String[] args) {
//        MyLinkedList list = new MyLinkedList(null);
//        list.traverse(list.getRoot());
//
//        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
//
//        String[] data = stringData.split(" ");
//        for (String s : data) {
//            list.addItem(new Node(s));
//        }
//
//        list.traverse(list.getRoot());
//        list.removeItem(new Node("Canberra"));
//        list.traverse(list.getRoot());
//        list.removeItem(list.getRoot());
//        list.removeItem(list.getRoot());
//        list.removeItem(list.getRoot());
//        list.removeItem(list.getRoot());
//        list.removeItem(list.getRoot());
//        list.removeItem(list.getRoot());
//        list.traverse(list.getRoot());

        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String[] data = stringData.split(" ");
        for (String s : data) {
            tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("Canberra"));
        tree.traverse(tree.getRoot());
        tree.removeItem(tree.getRoot());
        tree.removeItem(tree.getRoot());
        tree.removeItem(tree.getRoot());
        tree.removeItem(tree.getRoot());
        tree.removeItem(tree.getRoot());
        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());
    }
}

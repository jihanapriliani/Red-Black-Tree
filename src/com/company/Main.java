package com.company;

public class Main {

    public static void main(String[] args) {
	    RedBlackTree rbt = new RedBlackTree();


        System.out.println("Menambahkan 2 ke dalam tree");
        rbt.insertNode(2);
        new TreePrinter(rbt.getRoot()).print(System.out);
        System.out.println();

        System.out.println("Menambahkan 14 ke dalam tree");
        rbt.insertNode(14);
        new TreePrinter(rbt.getRoot()).print(System.out);
        System.out.println();

        System.out.println("Menambahkan 3 ke dalam tree");
        rbt.insertNode(3);
        new TreePrinter(rbt.getRoot()).print(System.out);
        System.out.println();

        System.out.println("Menambahkan 100 ke dalam tree");
        rbt.insertNode(100);
        new TreePrinter(rbt.getRoot()).print(System.out);
        System.out.println();
    }
}

package com.company;

import java.io.PrintStream;

public class TreePrinter {
    private Node tree;

    TreePrinter(Node tree) {
        this.tree = tree;
    }

    String traversePreOrder(Node root) {
        if (root == null) return "";

        StringBuilder sb = new StringBuilder();
        sb.append(root.getData() + " : " + (root.isColor() == true ? "black" : "red"));

        String pointerRight = "└── r ── ";
        String pointerLeft = (root.getRight() != null) ? "├── l ── " : "└── l ── ";

        traverseNodes(sb, "", pointerLeft, root.getLeft(), root.getRight() != null);
        traverseNodes(sb, "", pointerRight, root.getRight(), false);

        return sb.toString();
    }

    void traverseNodes(StringBuilder sb, String padding, String pointer, Node node, boolean hasRightSibling) {
        if (node != null) {
            sb.append("\n");
            sb.append(padding);
            sb.append(pointer);
            sb.append(node.getData() + " : " + (node.isColor() == true ? "black" : "red"));

            StringBuilder paddingBuilder = new StringBuilder(padding);
            if (hasRightSibling) {
                paddingBuilder.append("│  ");
            } else {
                paddingBuilder.append("   ");
            }

            String paddingForBoth = paddingBuilder.toString();
            String pointerRight = "└── r ── ";
            String pointerLeft = (node.getRight() != null) ? "├── l ── " : "└── l ── ";

            traverseNodes(sb, paddingForBoth, pointerLeft, node.getLeft(), node.getRight() != null);
            traverseNodes(sb, paddingForBoth, pointerRight, node.getRight(), false);
        }
    }


    void print(PrintStream os) {
        os.print(traversePreOrder(this.tree));
    }

}

package com.lelakowski.tree;

import com.lelakowski.node.Node;

import java.util.LinkedList;

public class Tree implements ITree {
    private Node root;

    public Tree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    @Override
    public String toString() {
        return "LeafyTree{" +
                "root=" + root +
                '}';
    }

    @Override
    public int maxDepth() {
        return depth(root);
    }

    private int depth(Node node) {
        int deepest = 0;
        if (node.getChildren() != null) {
            for (Node child : node.getChildren()) {
                deepest = Math.max(deepest, depth(child));
            }
        }
        return deepest + 1;
    }

    @Override
    public void grow() {
        LinkedList<Node> children = root.getChildren();
        children.forEach(this::expandLeaves);
    }

    @Override
    public void cut() {
        this.root = new Node(null);
    }

    private void expandLeaves(Node newLeaf) {
        if (newLeaf.isLeaf()) {
            newLeaf.addChild();
            newLeaf.addChild();
        } else {
            LinkedList<Node> children = newLeaf.getChildren();
            children.forEach(this::expandLeaves);
        }
    }
}

package com.lelakowski.node;

import java.util.LinkedList;

public class Node implements INode<Node> {

    private Node parent;
    private LinkedList<Node> children = new LinkedList<>();

    public Node(Node parent) {
       this.parent = parent;
    }

    @Override
    public Node getParent() {
        return parent;
    }

    @Override
    public boolean isLeaf() {
        return children.isEmpty();
    }

    @Override
    public Node addChild() {
        Node child = new Node(this);
        children.add(child);
        return child;
    }

    @Override
    public Node addChild(Node child) {
        children.add(child);
        return child;
    }

    @Override
    public LinkedList<Node> getChildren() {
        if (children.isEmpty()) return null;
        return children;
    }

    @Override
    public String toString() {
        return "LeafyNode{children=" + children +'}';
    }
}

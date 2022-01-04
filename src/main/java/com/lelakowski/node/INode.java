package com.lelakowski.node;

import java.util.LinkedList;

public interface INode<N> {
    /**
     *
     * @return parent of node
     */
    N getParent();

    /**
     *
     * @return a logical value whether the node is a leaf
     */
    boolean isLeaf();

    /**
     * Create new node from current position
     * @return the newly created node.
     */
    N addChild();

    /**
     * Add a node as a child to the current node
     * @param child - the node that should be added.
     * @return the newly created node.
     */
    N addChild(N child);

    /**
     * Return the list of children
     * @return list of children
     */
    LinkedList<N> getChildren();
}

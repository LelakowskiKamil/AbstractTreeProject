package com.lelakowski;

import com.lelakowski.node.Node;
import com.lelakowski.tree.Tree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TreeSuite {

    @Test
    @DisplayName("Calculate .maxDepth()")
    void test1() {
        Node root = new Node(null);
        Node child1 = root.addChild();
        Node child2 = root.addChild();
        Node child3 = root.addChild();
        Node child11 = child1.addChild();
        Node child12 = child1.addChild();
        Node child13 = child1.addChild();
        Node child21 = child2.addChild();
        Node child31 = child3.addChild();
        Node child311 = child31.addChild();
        Tree tree = new Tree(root);
        int actualMaxDepth = tree.maxDepth();
        Assertions.assertEquals(4,actualMaxDepth);
    }

    @Test
    @DisplayName("Another calculate .maxDepth()")
    void test2() {
        Node root = new Node(null);

        Tree tree = new Tree(root);
        int actualMaxDepth = tree.maxDepth();
        Assertions.assertEquals(1,actualMaxDepth);
    }

    @Test
    @DisplayName("Calculate depth after use .grow()")
    void test4() {
        Node root = new Node(null);
        Node child1 = root.addChild();
        Node child2 = root.addChild();
        Node child3 = root.addChild();
        Node child11 = child1.addChild();
        Node child12 = child1.addChild();
        Node child13 = child1.addChild();
        Node child21 = child2.addChild();
        Node child31 = child3.addChild();
        Node child311 = child31.addChild();
        Tree tree = new Tree(root);

        int actualMaxDepth = tree.maxDepth();
        Assertions.assertEquals(4,actualMaxDepth);

        tree.grow();

        int depthAfterGrow = tree.maxDepth();
        Assertions.assertEquals(5,depthAfterGrow);
    }

    @Test
    @DisplayName("Calculate depth after use .cut()")
    void test5() {
        Node root = new Node(null);
        Node child1 = root.addChild();
        Node child2 = root.addChild();
        Node child3 = root.addChild();
        Node child11 = child1.addChild();
        Node child12 = child1.addChild();
        Node child13 = child1.addChild();
        Node child21 = child2.addChild();
        Node child31 = child3.addChild();
        Node child311 = child31.addChild();
        Tree tree = new Tree(root);

        int actualMaxDepth = tree.maxDepth();
        Assertions.assertEquals(4,actualMaxDepth);

        tree.cut();

        int depthAfterGrow = tree.maxDepth();
        Assertions.assertEquals(1,depthAfterGrow);
    }

}
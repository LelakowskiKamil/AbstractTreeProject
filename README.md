# Abstract Tree 
OOP Tree model example

# Used libraries:
* junit-jupiter - for junit tests

# About:
The tree consists of nodes forming a tree structure. Each node can have many child nodes. Each node child can only have one parent. The last node are called leaves and they have no children.

# Interface methods

```sh
public interface INode<N> {
    N getParent();
    boolean isLeaf();
    N addChild();
    N addChild(N child);
    LinkedList<N> getChildren();
}
```
I used an interface with a generic parameter to visualize the behavior of the node, so that the classes implementing this interface would have a common method base. Currently, there is one node representation, but the project is open to implementations of other node types.

```sh
public interface ITree {
    int maxDepth();
    void grow();
    void cut();
}
```
I used the interface to illustrate the behavior of the tree. The methods are not related to the tree type.

## Test
I used the JUnit library to test the implementation methods of the Tree class;
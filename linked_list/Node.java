package se.esmoa.linked_list;

public class Node {

    // create a private variables for data and next node(data)
    private int data;
    private Node nextNode;

    // initial a constructor method for creating a Node object
    public Node(int data) {
        this.data = data;
    }

    // initial a method for getting and setting the value of data and nextNode
    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }


    // override the toString() function for printing the value of nodes
    @Override
    public String toString() {
        return "" + this.data;
    }
}

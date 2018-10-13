package se.esmoa.doubly_linkedList;

public class Doubly_Node {
    private int data;   // this var is member var. In other words, this is the type of data we gonna store in our list
    private Doubly_Node nextNode;
    private Doubly_Node previousNode;

    public Doubly_Node(int Data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Doubly_Node getNextNode() {
        return nextNode;
    }

    public Doubly_Node getPreviousNode() {
        return previousNode;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNextNode(Doubly_Node nextNode) {
        this.nextNode = nextNode;
    }

    public void setPreviousNode(Doubly_Node previousNode) {
        this.previousNode = previousNode;
    }
}

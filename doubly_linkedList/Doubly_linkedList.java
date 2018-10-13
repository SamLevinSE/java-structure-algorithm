package se.esmoa.doubly_linkedList;

public class Doubly_linkedList {
    private Doubly_Node head; // member variable for head

    public void insertAtHead(int data){
        Doubly_Node newNode = new Doubly_Node(data);
        newNode.setNextNode(this.head);
        if (this.head != null) {
            this.head.setPreviousNode(newNode);
        }
        this.head = newNode;
    }
}

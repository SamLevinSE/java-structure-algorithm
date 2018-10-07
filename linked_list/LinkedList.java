package se.esmoa.linked_list;

public class LinkedList {

    // create a Node variable for the head element / first element of the list
    private Node head;

    // create a method for inserting an element into the LinkedList
    public void insertAtHead(int data){

        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }


    // override the toString function for printing the LinkedList type lists
    @Override
    public String toString(){

        String result = "{";
        Node current = this.head;
        while (current != null){
            result += current.toString() + ",";
            current = current.getNextNode();
        }
        result += "}";

        return result;
    }
}

package se.esmoa.linked_list;

public class LinkedList {

    // create a Node variable for the head element / first element of the list
    private Node head;


    // create a method for inserting an element into the LinkedList
    public void insertAtHead(int data) {

        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }


    // searching for an item in the linked list
    public Node searchfor(int data) {

        Node current = this.head;
        while (current != null) {
            if (current.getData() == data) {
                return current;
            }
            current = current.getNextNode();
        }
        return null;
    }


    // deleting the headNode
    public void deleteTheHead() {
        this.head = this.head.getNextNode();
    }


    // create a method for counting the length of linkedList
    public int LinkedListLength() {

        int length = 0;
        Node current = this.head;
        while (current != null) {
            length += 1;
            current = current.getNextNode();
        }
        return length;
    }


    // override the toString function for printing the LinkedList type lists
    @Override
    public String toString() {

        String result = "{";
        // we want to start from the first Node (index 0)
        Node current = this.head;
        while (current != null) {
            result += current.toString() + ",";
            // change the current Node to the next Node in the list
            current = current.getNextNode();
        }
        result += "}";
        return result;
    }
}

package se.esmoa;

/**
 * You can make just one Public Class in each file
 * If you change the name of file, you need to change the Public Class name too
 * the type of return value of functions must be specified and void means that this method doesn't have a return
 * Public means that it's possible to access this method from other classes
 * Static means that you can be accessed just from the class and not from the instances of the class
 * Interface does force a class to have some spacial method(s). In this case we need the keyword: "implements"
 * Interfaces are almost equivalent to protocols and magic methods in Python
 */

import se.esmoa.doubly_linkedList.Doubly_linkedList;
import se.esmoa.linked_list.LinkedList;
import se.esmoa.sorting.BubbleSort;
import se.esmoa.sorting.InsertionSort;
import se.esmoa.sorting.SelectionSort;

import java.awt.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

//        // getting (Scanning) an input from users.
//        System.out.print("How much you want to increase the speed? ");
//        Scanner inputScan = new Scanner(System.in);
//        int input = inputScan.nextInt(); // .next is for String type


//        // Creating a new object from the Car class
//        Car audi = new Car(
//                22,
//                "1BC33D",
//                Color.blue,
//                true);
//        audi.changePaintColor(Color.WHITE);
//        System.out.println("The car with license plate '" + audi.licencePlate + "'");
//        System.out.println("Speed increased to " + Car.speedingUp(50, input));


//        // printing the return value of arrayMethod
//        System.out.println(Arrays.arrayMethod());


//        // bubble sorting before and after
//        int[] bList = {3, 6, 9, 0, 5, 8, 1, 6};
//        BubbleSort.bubbleSort(bList);
//        for (int i = 0; i < bList.length; i++) {
//            System.out.println(bList[i]);
//        }


//        // selection sorting
//        int[] aList = {3, 5, 8, 2, 4, 1, 0, 1};
//        SelectionSort.selectionSorting(aList);
//        for (int i = 0; i < aList.length; i++) {
//            System.out.println(aList[i]);
//        }


//        // insertion sorting
//        int[] cList = {3, 5, 8, 2, 4, 1, 0, 1};
//        InsertionSort.insertionSort(cList);
//        for (int i = 0; i < cList.length; i++) {
//            System.out.println(cList[i]);
//        }


//        // create a new empty LinkedList
//        LinkedList list = new LinkedList();
//        // insert a data into the list
//        list.insertAtHead(1);
//        list.insertAtHead(2);
//        list.insertAtHead(3);
//        list.insertAtHead(4);
//        list.insertAtHead(5);
//        list.insertAtHead(5);
//        // search the list for an item.
//        System.out.println(list.searchfor(3));
//        // delete the head Node
//        list.deleteTheHead();
//        // for printing this list, we have to override the toString() function in both Node and LinkedList classes
//        System.out.println(list);
//        // for printing the length of a linkedList, we need to create a function
//        System.out.println(list.LinkedListLength());


//        Doubly_linkedList doublyLinkedList = new Doubly_linkedList();
//        doublyLinkedList.insertAtHead(5);
//        doublyLinkedList.insertAtHead(9);
//        doublyLinkedList.insertAtHead(1);
//        doublyLinkedList.insertAtHead(5);
//        doublyLinkedList.insertAtHead(4);
//        doublyLinkedList.insertAtHead(3);
//        System.out.println(doublyLinkedList.toString());

    }
}

package se.esmoa.sorting;

public class BubbleSort {

    public static int[] bubbleSort(int[] list){
        // create a temporary int variable for storing the smallest number in between two numbers (list[j] vs list[j+1])
        int smallest;

        // looping throw the whole list for once
        for (int i = 0; i < list.length-1; i++){
            for (int j = 0; j < list.length-1-i; j++){ // looping throw each and every int
                if (list[j] > list[j+1]){ // check which of two numbers (current number vs next number) is smallest
                    smallest = list[j+1];
                    list[j+1] = list[j];
                    list[j] = smallest;
                }
            }
        }
        return list;
    }
}

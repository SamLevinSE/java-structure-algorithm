package se.esmoa.sorting;

public class InsertionSort {

    public static int[] insertionSort(int[] list){

        // loop throw whole list
        for (int i = 0; i < list.length; i++) {

            // store the minimum number and its index in two variables
            int minIndex = i;
            int minValue = list[i];

            // loop again for compering the min value with other numbers in the list
            for (int j = i; j < list.length; j++) {
                if (minValue > list[j]) {
                    minValue = list[j];
                    minIndex = j;
                }
            }
            // swap the value of current number [i] with the smallest [j]
            list[minIndex] = list[i];
            list[i] = minValue;
        }
        return list;
    }
}

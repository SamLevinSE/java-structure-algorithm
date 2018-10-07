package se.esmoa.sorting;

public class SelectionSort {

    public static int[] selectionSorting(int[] list) {

        // sorting throw the list for first time to find the first numbers
        // 3, 5, 8, 2, 4, 1, 0, 1
        for (int i = 0; i < list.length - 2; i++) {

            int minIndex = i;
            // looping and searching for the smallest number
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[minIndex]) {
                    minIndex = j;
                }
            }
            int smallest = list[minIndex];
            list[minIndex] = list[i];
            list[i] = smallest;
        }
        return list;
    }
}

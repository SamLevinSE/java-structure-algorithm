package se.esmoa.sorting;

public class MargeSortReverse {
    public void mergeSortReverse(int[] list) {

        // if there is just one element in the list, the element is sorted and we don't need to do anything
        if (list.length == 1) return;

        if (list.length > 1) {
            // create two new list (temp)
            int[] leftList = new int[list.length / 2];
            int[] rightList = new int[list.length - leftList.length];

            // copy the first half part of original array to the left array
            System.arraycopy(list, 0, leftList, 0, leftList.length);
            // copy the second half part of original array to the right array
            System.arraycopy(list, list.length / 2, rightList, 0, list.length - leftList.length);

            // call the mergeSortReverse function (This is called recursive)
            mergeSortReverse(leftList);
            mergeSortReverse(rightList);

            // sort and merge the lists
            merge(list, leftList, rightList);
        }
    }

    private void merge(int[] list, int[] leftList, int[] rightList) {

        // we need an index for each of the lists (Original list, left list, and right list)
        int listI = 0, leftI = 0, rightI = 0;

        // We need to merge the list until there is an element in the list
        while (leftI < leftList.length && rightI < rightList.length) {
            // add the smallest int from two lists (right and left) to the original list
            if (leftList[leftI] >= rightList[rightI]) {
                list[listI] = leftList[leftI];
                leftI++;
            } else {
                list[listI] = rightList[rightI];
                rightI++;
            }
            listI++;
        }

        // add the other number which is the biggest number to the list after the smallest number (previous loop)
        while (leftI < leftList.length) {
            list[listI] = leftList[leftI];
            leftI++;
            listI++;
        }
        while (rightI < rightList.length) {
            list[listI] = rightList[rightI];
            rightI++;
            listI++;
        }
    }

    // this function is for printing the list
    public static String display(int[] list) {
        StringBuilder result = new StringBuilder("{");
        for (int i = 0; i < list.length; i++) {
            result.append(list[i]);
            if (i < list.length - 1) {
                result.append(",");
            }
        }
        result.append("}");
        return result.toString();
    }
}

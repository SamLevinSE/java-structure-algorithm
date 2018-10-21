package se.esmoa.Recursion;

public class MergeSort {

    public void mergeSort(int[] list) {
        if (list.length == 1) return;
        if (list.length > 1) {
            // Create temp arrays
            int[] left = new int[list.length / 2];
            int[] right = new int[list.length - left.length];

            System.arraycopy(list, 0, left, 0, list.length / 2);
            mergeSort(left);
            System.arraycopy(list, list.length / 2, right, 0, ((list.length) - (list.length / 2)));
            mergeSort(right);

            merge(left, right, list);
        }
    }


    private void merge(int[] leftList, int[] rightList, int[] list) {
        int leftI = 0, rightI = 0, listI = 0;

        while (leftI < leftList.length && rightI < rightList.length) {
            if (leftList[leftI] <= rightList[rightI]) {
                list[listI] = leftList[leftI];
                leftI++;
            } else {
                list[listI] = rightList[rightI];
                rightI++;
            }
            listI++;
        }

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

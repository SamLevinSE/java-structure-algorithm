package se.esmoa;

class QueensProblem {

    private int numberOfQueens; // number of rows = number of columns
    private int[] queensArray;

    QueensProblem(int numberOfQueens) {
        queensArray = new int[numberOfQueens];
        this.numberOfQueens = numberOfQueens;
    }

    void solveQueenProblem() {
        arrangeQueens(0);
    }

    private void arrangeQueens(int rowIndex) {
        for (int i = 0; i < numberOfQueens; i++) {
            if (boundingFunction(rowIndex, i)) {
                queensArray[rowIndex] = i;
                if (rowIndex == numberOfQueens - 1) {
                    printQueens();
                } else {
                    arrangeQueens(rowIndex + 1);
                }
            }
        }
    }

    private void printQueens() {
        for (int i = 0; i < numberOfQueens; i++) {
            for (int j = 0; j < numberOfQueens; j++) {
                if (queensArray[i] == j) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // check the bounding function (for rows, columns, and diag)
    private boolean boundingFunction(int rowIndex, int columnIndex) {
        for (int i = 0; i < rowIndex; i++) {
            if (queensArray[i] == columnIndex) { // If they are in the same column
                return false;
            }
            if (i - rowIndex == queensArray[i] - columnIndex) {
                return false;
            }
            if (i - rowIndex == columnIndex - queensArray[i]) {
                return false;
            }

        }
        return true;
    }
}

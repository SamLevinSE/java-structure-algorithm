package se.esmoa.Recursion;

/**
 * In this class we try to solve a Tower Of Hanoi in recursive way
 */

public class TowerOfHanoi {


    public void towerOfHanoi(int numberOfDisks, char from, char to, char by) {
        if (numberOfDisks == 1) {
            System.out.println(String.format("Moving disk %d from %s to %s", numberOfDisks, from, to));
        } else {
            towerOfHanoi(numberOfDisks - 1, from, by, to);
            System.out.println(String.format("Moving disk %d from %s to %s", numberOfDisks, from, to));
            towerOfHanoi(numberOfDisks - 1, by, to, from);
        }
    }
}

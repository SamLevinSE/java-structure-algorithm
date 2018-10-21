package se.esmoa.Recursion;

/**
 * Calling a method inside itself
 */

public class Recursion {

    public int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}

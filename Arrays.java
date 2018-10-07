package se.esmoa;

public class Arrays {

    // this public method will return a string and since it is static, you can call it inside another class
    static String arrayMethod() {

        // creating an empty array with a fix size of 2
        boolean[] booleans = new boolean[2];
        booleans[0] = true; // adding  a value to an array by index
        booleans[1] = false;

        // creating and initializing a new array.
        String[] weekDays = {"Monday", "Tuesdayyy"};
        weekDays[1] = "Tuesday";

        return weekDays[1];

    }

}

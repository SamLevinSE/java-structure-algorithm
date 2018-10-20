package se.esmoa.Quese_Stack;


/**
 * Stack is  last in, first out list
 * It have a fixed length
 */

public class StackClass {

    private int topIndex = -1;

    private int maxLen = 9;
    private int[] stackList = new int[maxLen];

    // push method will push a new element into the list at topIndex
    public void push(int element) {
        if (topIndex < maxLen - 1) {
            topIndex++;
            stackList[topIndex] = element;
        }
    }

    // peek method will return the element at topIndex
    public String peek() {
        return "The top index is: " + stackList[topIndex];
    }

    // pop method will remove the element at index topIndex
    public void pop() {
        if (topIndex > -1) {
            stackList[topIndex] = 0;
            topIndex--;
        }
    }

    // Overriding the toString method for printing the elements of our stack list.
    @Override
    public String toString() {
        int current = 0;
        StringBuilder result = new StringBuilder("{");
        while (current <= topIndex) {
            result.append(stackList[current]);
            current++;
            if (current <= topIndex) {
                result.append(", ");
            }
        }
        result.append("}");
        return result.toString();
    }


}

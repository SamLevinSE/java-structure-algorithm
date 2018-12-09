package se.esmoa.Queue_Stack;

/**
 * First in first out or FIFO
 */

public class QueueClass {

    private int headQueue, tailQueue = -1;
    private int maxLen = 10;
    private String[] queueList = new String[maxLen];

    // adding an element at index tailQueue
    public void enQueue(String element) {
        if (headQueue == -1) {
            headQueue++;
        }
        if ((tailQueue == maxLen - 1) && (headQueue > 0)) {
            tailQueue = 0;
            if (queueList[tailQueue] == null) {
                queueList[tailQueue] = element;
            }
        } else if (tailQueue < maxLen - 1) {
            tailQueue++;
            queueList[tailQueue] = element;
        }
    }

    // removing the element at index headQueue
    public void deQueue() {
        queueList[headQueue] = null;
        headQueue++;
    }

    // this method will return the value of headQueue index
    public String peek() {
        return "The element at the head of queue is: " + queueList[headQueue];
    }

    // Since we are creating our own type(QueueClass), we need to override the toString method for printing the elements
    @Override
    public String toString() {
        int current = 0;
        StringBuilder result = new StringBuilder("{");
        while (current <= maxLen - 1) {
            if (queueList[current] != null){
                result.append(queueList[current]);
            }
            current++;
            if (current <= maxLen -1) {
                result.append(", ");
            }
        }
        result.append("}");
        return result.toString();
    }
}

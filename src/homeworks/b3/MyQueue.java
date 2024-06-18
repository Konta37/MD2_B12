package homeworks.b3;

public class MyQueue {
    private int capacity;
    private String[] queueArr;
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new String[this.capacity];
    }

    public boolean isQueueFull(){
        return currentSize == capacity;
    }

    public boolean isQueueEmpty(){
        return currentSize == 0;
    }

    public void enqueue(String item) {
        if (isQueueFull()) {
            System.out.println("Overflow! Unable to add element: " + item);
        } else {
            tail = (tail + 1) % capacity;
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue!");
        }
    }

    public String dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow! Unable to remove element from Queue");
            return null;
        } else {
            String removedElement = queueArr[head];
            head = (head + 1) % capacity;
            currentSize--;
            return removedElement;
        }
    }

    public String peek(int index) {
        return queueArr[(head + index) % capacity];
    }
}

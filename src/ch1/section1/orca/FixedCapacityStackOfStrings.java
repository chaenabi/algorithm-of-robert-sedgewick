package ch1.section1.orca;

public class FixedCapacityStackOfStrings {
    private String[] arr;
    private int size;

    public FixedCapacityStackOfStrings(int capacity) {
        this.arr = new String[capacity];
        this.size = 0;
    }

    public void push(String item) {
        if (size >= this.arr.length) throw new FullStackException("Stack is full");

        arr[size++] = item;
    }

    public String pop() {
        if (size <= 0) throw new NoElementException("Stack is empty");

        return arr[--size];
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() { return size == arr.length; }  // Example 1.3.1
    public int size() {
        return size;
    }
}

package ch1.section1.bingdal.exam;

public class ResizingArrayQueueOfStrings<T>{

    T[] items;
    private T first;
    private T last;
    private int size;

    public ResizingArrayQueueOfStrings(int size) {
        this.items = (T[]) new ResizingArrayQueueOfStrings[size];
    }

    public void enqueue(T item) {
        if(!isFull()) {
            items[size] = item;
           if (isEmpty()) {
               last = item;
               first = last;
           }
           else {
               last = item;
               items[size] = last;
           }
        }
        else if(isFull()) {
            items = resizeSize(items.length * 2);
            last = item;
        }
        size++;
    }

    public T dequeue() { // [0]null , b , c
        T temp = first;
        first = null;
        for(int i = 0; i < items.length;i++) {
            items[i] = items[i+1];
        }
        temp = items[0];

        if(size == items.length / 4) {
            items = resizeSize(items.length / 2);
        }
        --size;
        return temp;
    }

    public boolean isFull() {
        return size == items.length;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public T[] resizeSize(int size) {
        T[] temp = (T[]) new ResizingArrayQueueOfStrings[size];
        for(int i = 0; i < items.length;i++) {
            temp[i] = items[i];
        }

        return temp;
    }

    public T getFirst() {
        return first;
    }
    public T getLast() {
        return last;
    }
}

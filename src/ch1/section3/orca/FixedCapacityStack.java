package ch1.section3.orca;

import java.util.Iterator;

public class FixedCapacityStack<Item> implements Iterable<Item> {
    private Item[] arr;
    private int size;

    public FixedCapacityStack(int capacity) {
        arr = (Item[]) new Object[capacity];
        size = 0;
    }

    private void resize(int max) {
        Item[] newArr = (Item[]) new Object[max];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public void push(Item item) {
        if (isFull()) resize(2 * arr.length);
        this.arr[size++] = item;
    }

    public Item pop() {
        Item poppedItem = this.arr[--size];
        arr[size] = null; // 로이터링 방지
        if (size > 0 && size <= arr.length / 4) resize(arr.length / 2);
        return poppedItem;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public int size() { return size; }

    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator(size);
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private int index;
        public ReverseArrayIterator(int size) {
            this.index = size;
        }

        @Override
        public boolean hasNext() {
            return index > 0;
        }

        @Override
        public Item next() {
            return arr[--index];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}

package ch1.section3.orca;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item> {

    private Node first;
    private Node last;
    private int size;

    public void enqueue(Item item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        if (isEmpty()) first = last;
        else oldLast.next = last;
        size++;
    }

    public Item dequeue() {
        if (isEmpty()) throw new NoElementException("Queue is empty");
        Item item = first.item;
        first = first.next;
        size--;
        return item;
    }

    public boolean isEmpty() { return size == 0; }
    public int size() { return size; }

    @Override
    public Iterator<Item> iterator() {
        return new QueueIterator(first);
    }

    private class Node {
        Item item;
        Node next;
    }

    private class QueueIterator implements Iterator<Item> {
        private Node first;

        public QueueIterator(Node first) {
            this.first = first;
        }

        @Override
        public boolean hasNext() {
            return first != null;
        }

        @Override
        public Item next() {
            Item item = first.item;
            first = first.next;
            return item;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}

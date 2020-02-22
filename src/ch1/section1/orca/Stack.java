package ch1.section1.orca;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item> {

    private Node first;
    private int size;

    public void push(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        size++;
    }

    public Item pop() {
        if (size == 0) throw new NoElementException("Stack is empty.");

        Item poppedItem = first.item;
        first = first.next;
        size--;

        return poppedItem;
    }

    public boolean isEmpty() { return size == 0; }
    public int size() { return size; }

    public Item peek() {
        if (isEmpty()) throw new NoElementException("Stack is empty.");

        return first.item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new StackIterator(first);
    }

    private class Node {
        Item item;
        Node next;
    }

    private class StackIterator implements Iterator<Item> {
        private Node firstNode;

        public StackIterator(Node firstNode) {
            this.firstNode = firstNode;
        }

        @Override
        public boolean hasNext() {
            return firstNode != null;
        }

        @Override
        public Item next() {
            Item item = firstNode.item;
            firstNode = firstNode.next;
            return item;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}

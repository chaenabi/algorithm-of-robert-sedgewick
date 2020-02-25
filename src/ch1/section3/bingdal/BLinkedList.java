package ch1.section1.bingdal;

import javax.xml.soap.Node;
import java.util.Iterator;

// Stack implementation
// based on LinkedList
public class BLinkedList {


    public static void main(String[] args) {

        BLinkedListImpl<String> bLinkedList = new BLinkedListImpl<>();
        String text = example.text;
        String[] splitText = text.split(" ");

        for (int i = 0; i < splitText.length; i++) {
            if (!splitText[i].equals("-")) {
                bLinkedList.push(splitText[i]);
            } else {
                if (!bLinkedList.isEmpty()) System.out.println(bLinkedList.pop() + " ");
            }
        }
        System.out.println(bLinkedList.getSize());

        for (String s : bLinkedList)
            System.out.println(s);

    }
}

class BLinkedListImpl<T> implements Iterable<T>{
    private Node firstNode;
    private int size;

    class Node {
        T t;
        Node next;
    }

    public boolean isEmpty() {
        return this.firstNode == null;
    }
    public int getSize() {
        return size;
    }

    public void push(T t) {
        Node initialNode = this.firstNode;
        this.firstNode = new Node();
        firstNode.t = t;
        firstNode.next = initialNode;
        size++;
    }

    public T pop() {
        T t = firstNode.t;
        firstNode = firstNode.next;
        size--;
        return t;
    }

    public Iterator<T> iterator() {
        return new BLinkedListIterator();
    }


    class BLinkedListIterator implements Iterator<T> {

        private Node current = firstNode;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T t = current.t;
            this.current = current.next;
            return t;
        }
    }
}


package ch1.section1.bingdal.exam;

import java.util.Iterator;

class BQueueImpl<T> {
    private Node firstNode;
    private Node lastNode;
    private int size;

    class Node {
        T item;
        Node next;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public int getSize() {
        return this.size;
    }

    public void enqueue(T item) {
        Node newNode = new Node(); // 들어온 값을 담을 새로운 Node 객체 생성.
        newNode.item = item;  // 만들어진 Node 객체에 값을 넣는다.
        newNode.next = null; // 차후에 새로이 만들어질 Node 객체와 연결하기 위한 next 변수.
        if(isEmpty()) firstNode = newNode; // 가장 처음 enqueue 에만 작동.
        else lastNode.next = newNode; // 원래의 노드에 lastNode 를 이어주는 역할. 2번째부터 작동.
        lastNode = newNode;
        this.size++;
    }

    public T dequeue() {
        T item = firstNode.item;
        this.firstNode = firstNode.next;
        this.size--;
        if(isEmpty()) this.lastNode = null;
        return item;


    }

    public T dequeue2() { //dequeue 와 같은 결과를 반환함.
        T item = null;
        if (!isEmpty()) {
            item = firstNode.item;
            this.firstNode = firstNode.next;
            size--;
        }
        return item;

    }


    public Iterator<T> iterator() {
        return new BLinkedListIterator();
    }


    class BLinkedListIterator implements Iterator<T> {

        private Node current = firstNode;

        @Override
        public boolean hasNext() {
            return this.current != null;
        }

        @Override
        public T next() {
            T t = current.item;
            this.current = current.next;
            return t;
        }
    }
}

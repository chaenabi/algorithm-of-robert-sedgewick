package ch1.section1.bingdal.exam;

import java.util.Iterator;

class FixedStack<Item>{

    private Item[] array;
    private int size;

    public FixedStack (int size){
        this.array = (Item[]) new Object[size];
        this.size = 0;
    }
    public void push(Item item) {
        if(isFull()) resize(array.length*2);
        this.array[size++] = item;
    }



    public Item pop() {
        array[size] = null;
        if(size > 0 && size == array.length / 4)
            resize(array.length/2);
        return array[--size];
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public Item peek() {
        return array[size];
    }

    public boolean isFull() {
        return array.length == size;
    }

    public void resize(int maxSize) {
        Item[] temp = (Item[])  new Object[maxSize];
        for(int i = 0; i < size; i++) {
            temp[i] = this.array[i];
        }
        this.array = temp;
    }

    class ReverseArrayIterator implements Iterator<Item> {

        private int i = getSize();

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return array[--i];
        }
    }

    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }


}

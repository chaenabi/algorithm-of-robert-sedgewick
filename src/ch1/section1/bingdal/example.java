package ch1.section1.bingdal;

import java.util.Iterator;

public class example {
    static String text = "to be or not to - be - - that - - - is";
    public static void main(String[] args) {

        FixedStack<String> stringFixedStack = new FixedStack<String>(1);
        String[] splitText = text.split(" ");

        for(int i = 0 ; i < splitText.length; i++) {
            if (!splitText[i].equals("-")) {
                stringFixedStack.push(splitText[i]);
            } else {
                if(!stringFixedStack.isEmpty()) System.out.println(stringFixedStack.pop() + " ");
                System.out.println("peek(): "+stringFixedStack.peek());
                System.out.println("size(): "+stringFixedStack.getSize());
            }
        }
//        System.out.println(stringFixedStack.getSize());

        Iterator<String> iterator = stringFixedStack.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());

    }

}

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


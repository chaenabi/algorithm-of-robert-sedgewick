package ch1.section3.orca;

public class Example1_3_14 {
    private static ResizingArrayQueueOfStrings queue;
    public static void main(String[] args) {
        queue = new ResizingArrayQueueOfStrings();

        queue.enqueue("Hello");
        queue.enqueue("World");
        System.out.println(queue.size());

        queue.enqueue("Goodbye");
        queue.enqueue("World");
        System.out.println(queue.size());

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());

        queue.enqueue("abc");
        queue.enqueue("vs");
        queue.enqueue("absdfc");
        queue.enqueue("abasdc");
        queue.enqueue("absdc");
        queue.enqueue("abasdc");
        queue.enqueue("aadsbc");
        queue.enqueue("aadsbc");

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());

    }


    private static class ResizingArrayQueueOfStrings {

        private String[] arr;
        private int size;
        private int first;
        private int last;

        public ResizingArrayQueueOfStrings() {
            arr = new String[1];
            size = 0;
            first = 0;
            last = 0;
        }

        public ResizingArrayQueueOfStrings(int capacity) {
            arr = new String[capacity];
            size = 0;
            first = 0;
            last = 0;
        }

        public void enqueue(String item) {
            if (!isFull()) arr[last++] = item;
            else {
                resize(2 * arr.length);
                arr[last++] = item;
            }
            size++;
        }

        public String dequeue() {
            if (isEmpty()) throw new NoElementException("Queue is empty");

            String item = arr[first];
            arr[first] = null;
            first++;
            size--;

            if (size == arr.length / 4) {
                resize(arr.length / 2);
            }

            return item;
        }

        private void resize(int capacity) {
            String[] newArr = new String[capacity];

            for (int i = 0; i < size; i++) {
                newArr[i] = arr[first + i];
            }

            arr = newArr;
            first = 0;
            last = size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        private boolean isFull() {
            return arr.length == size;
        }


        private int size() {
            return size;
        }
    }
}

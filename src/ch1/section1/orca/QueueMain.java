package ch1.section1.orca;

public class QueueMain {
    public static void main(String[] args) {
        String text = "to be or not to - be - - that - - - is";
        String[] strArr = text.split(" ");

        Queue<String> queue = new Queue<>();

        for (int i = 0; i < strArr.length; i++) {
            switch(strArr[i]) {
                case "-":
                    if (!queue.isEmpty()) System.out.print(queue.dequeue() + " ");
                    break;
                default :
                    queue.enqueue(strArr[i]);
                    break;
            }
        }
        System.out.println("(" + queue.size() + " left on queue)");

        for (String item : queue) {
            System.out.println(item);
        }
        System.out.println();
    }
}

package ch1.section1.bingdal.exam;

import java.util.Iterator;

public class BQueue {

    public static void main(String[] args) {

        BQueueImpl<String> bq = new BQueueImpl<>();
        String text = "to be or not to - be - - that - - - is";
        String[] splitText = text.split(" ");

        for (int i = 0; i < splitText.length; i++) {
            if (!splitText[i].equals("-")) {
                bq.enqueue(splitText[i]);
            } else {
                if (!bq.isEmpty()) System.out.print(bq.dequeue2() + " ");
            }
        }
        System.out.println();
        System.out.println(bq.getSize() + " size ");

        Iterator<String> iterator = bq.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

    }

}




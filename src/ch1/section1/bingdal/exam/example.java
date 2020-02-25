package ch1.section1.bingdal.exam;

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
        System.out.println(stringFixedStack.getSize());

        Iterator<String> iterator = stringFixedStack.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());

    }

}


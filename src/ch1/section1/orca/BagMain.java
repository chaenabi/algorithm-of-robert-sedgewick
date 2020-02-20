package ch1.section1.orca;

public class BagMain {
    public static void main(String[] args) {
        Bag<String> bag = new Bag<>();

        bag.add("hello");
        bag.add("world");
        bag.add("bye");

        for (String str : bag) {
            System.out.println(str);
        }
    }
}

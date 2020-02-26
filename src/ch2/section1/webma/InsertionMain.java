package ch2.section1.webma;

public class InsertionMain {
    public static void main(String[] args) {
        String[] arr = {"E", "X", "A", "M", "P", "L", "E"};
        Insertion.show(arr);
        Insertion.sortWithoutExch(arr);
        Insertion.show(arr);
    }
}

package ch2.section2.webma;

public class MergeBUMain {
    public static void main(String[] args) {
        Comparable[] a = {5, 3, 4, 2, 6, 2, 3, 1};
        MergeBU.sort(a);
        for (Comparable comparable : a) {
            System.out.print(comparable + " ");
        }
    }
}

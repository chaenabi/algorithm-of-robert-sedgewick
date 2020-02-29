package ch2.section3.orca;

public class QuickMain {
    public static void main(String[] args) {
        Comparable[] a = {1, 3, 5, 2, 4, 10, 9, 6, 7, 32, 12, 15};
        for (Comparable comparable : a) {
            System.out.print(comparable + " ");
        }
        System.out.println();
        System.out.println();
        Quick.sort(a);
        System.out.println();
        System.out.println();
        for (Comparable comparable : a) {
            System.out.print(comparable + " ");
        }
        System.out.println();
    }
}

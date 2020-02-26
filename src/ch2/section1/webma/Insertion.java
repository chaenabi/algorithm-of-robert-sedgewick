package ch2.section1.webma;

public class Insertion extends Example {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
                exch(a, j, j-1);
            }
        }
    }

    public static void sortWithoutExch(Comparable[] a) {
        int N = a.length;
        Comparable tmp;
        int i, j;
        for (i = 0; i < N; i++) {
            tmp = a[i];
            for (j = i; j > 0 && less(tmp, a[j-1]); j--) {
                a[j] = a[j - 1];
            }
            a[j] = tmp;
        }
    }
}


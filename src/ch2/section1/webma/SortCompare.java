package ch2.section1.webma;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class SortCompare {
    public static double time(String alg, Double[] a) {
        Stopwatch timer = new Stopwatch();
        if (alg.equals("Insertion")) Insertion.sort(a);
        else if (alg.equals("InsertionWithoutExch")) Insertion.sortWithoutExch(a);
        else if (alg.equals("Selection")) Selection.sort(a);
        else if (alg.equals("Shell")) Shell.sort(a);
        else if (alg.equals("Merge")) { }
        else if (alg.equals("Quick")) { }
        else if (alg.equals("Heap")) { }
        return timer.elapsedTime();
    }

    public static double timeRandomInput(String alg, int N, int T) {
        double total = 0.0;
        Double[] a = new Double[N];
        for (int t = 0; t < T; t++) {
            for (int i = 0; i < N; i++) {
                a[i] = StdRandom.uniform();
            }
            total += time(alg, a);
        }
        return total;
    }
}

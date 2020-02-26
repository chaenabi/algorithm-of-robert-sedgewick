package ch2.section1.bingdal;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class BSortCompare {

    public static double time(String alg, Comparable[] a) {
        BInsertion bInsertion = new BInsertion();
        BSelection bSelection = new BSelection();
        BShell bShell = new BShell();

        Stopwatch timer = new Stopwatch();
        if (alg.equals("Insertion")) bInsertion.sort(a);
        if (alg.equals("Selection")) bSelection.sort(a);
        if (alg.equals("Shell")) bShell.sort(a);
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
    public static void main(String[] args) {
        String alg1 = "Insertion";
        String alg2 = "Selection";
        String alg3 = "Shell";

        int N = Integer.parseInt("1000");
        int T = Integer.parseInt("10");

       // double t1 = timeRandomInput(alg1, N, T);
        double t2 = timeRandomInput(alg2, N, T);
        double t3 = timeRandomInput(alg3, N, T);

        StdOut.printf("For %d random Doubles\n %s is ", N, alg3);
        StdOut.printf("%.1f time faster than %s\n", t2 / t3, alg2);

    }
}

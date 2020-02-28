package ch2.section3.bingdal;

import ch2.section1.bingdal.BSortTemplate;
import edu.princeton.cs.algs4.StdRandom;

public class BQuickSort  extends BSortTemplate {

    public void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length-1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if(hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi){
        int i = lo, j = hi+1;
        Comparable v = a[lo];
        while(true) {
            while (less(a[++i], v)) if (i==hi) break;
            while (less(v, a[--j])) if (j == lo ) break;
            if( i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;

    }

    public static void main(String[] args) {
        BQuickSort bQuickSort = new BQuickSort();
        Comparable[] comparables = {1,2,3,4};
        bQuickSort.sort(comparables);
    }

}

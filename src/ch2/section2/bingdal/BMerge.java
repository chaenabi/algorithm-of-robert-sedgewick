package ch2.section2.bingdal;

abstract public class BMerge {
    protected static Comparable[] comparables = {2,3,5,1,2,3,4,6};
    protected static Comparable[] aux;

    protected static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    protected static void merge(Comparable[] a, int lo, int mid, int hi) {

        int i = lo, j = mid + 1; // a[lo...hi]를 aux[lo...hi]에 복제
        for (int k = lo; k <= hi; k++)
            aux[k] = a[k];

        for (int k = lo; k <= hi; k++) {// 다시 a[lo...hi]로 병합
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }

    public abstract void sort(Comparable[] a);

    public void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

}

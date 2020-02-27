package ch2.section2.bingdal;

//상향식 병합 정렬
public class BBottomUpMerge extends BMerge {

    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        aux = new Comparable[N];
        for (int size=1; size < N; size = size+ size)
            for(int lo = 0; lo < N-size; lo+= size+size)
                merge(a, lo, lo + size, Math.min(lo + size + size -1, N-1));
    }

    public static void main(String[] args) {
        //Comparable[] comparables

        int size = comparables.length;
        BBottomUpMerge bbum = new BBottomUpMerge();
        bbum.sort(comparables);
        for(Comparable n : comparables) {
            System.out.print(n);
        }

    }

}

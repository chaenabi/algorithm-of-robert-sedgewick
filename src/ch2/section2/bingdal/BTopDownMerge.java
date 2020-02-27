package ch2.section2.bingdal;

// 하향식 병합 정렬
public class BTopDownMerge extends BMerge {
    @Override
    public void sort(Comparable[] a) {

        aux = new Comparable[a.length];
        sort(a, 0, a.length -1);
    }

    public static void main(String[] args) {
        //Comparable[] comparables

        int size = comparables.length;
        BTopDownMerge btdm = new BTopDownMerge();
        btdm.sort(comparables);
        for(Comparable n : comparables) {
            System.out.print(n);
        }

    }
}

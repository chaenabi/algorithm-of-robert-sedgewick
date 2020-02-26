package ch2.section1.webma;

public class SortCompareMain {
    public static void main(String[] args) {
        String alg1 = "InsertionWithoutExch";
        String alg2 = "Shell";
        int N = 10000;
        int T = 100;

        double t1 = SortCompare.timeRandomInput(alg1, N, T);
        double t2 = SortCompare.timeRandomInput(alg2, N, T);
        System.out.printf("For %d random Doubles\n %s is", N, alg2);
        System.out.printf(" %.1f times faster than %s\n", t1/t2, alg1);
    }
}

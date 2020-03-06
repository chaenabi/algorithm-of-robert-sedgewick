package DynamicProgramming.chapter1;

public class Section1_1 {


    public static void main(String[] args) {
        printGuGuDan(2,9); // 2단부터 9단까지 출력
        printTable(3); // 3단 출력
    }

    static void printGuGuDan(int start, int end) {
        if(start >= end + 1) return;

        printTable(start);
        printGuGuDan(start +1, end);
    }

    static void printTable(int n) {
       int i = 1;
        printTable(n,i);
    }

    static void printTable(int n,int i) {
        if(i >= 10 || i <= 0) return;
        System.out.printf("%d * %d = %d\n", n, i, (n*(i) ));

        printTable(n, i+1);
    }



}

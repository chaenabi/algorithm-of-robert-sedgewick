package ch2.section4.bingdal;

public class BMaxPriorityQueue<Key extends Comparable<Key>> {

    private Key[] pq; // 힙정렬된 완전 이진 트리
    private int N = 0; // pq[1..N]만 사용하고 pq[0]는 버려둠

    public BMaxPriorityQueue(int maxN) {
        pq = (Key[]) new Comparable[maxN + 1];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public  void  insert(Key v) {
        pq[++N] = v;
        swim(N);
    }

    public Key delMax() {
        Key max = pq[1]; // 꼭대기에서 최대 키 얻기
        exch(1, N--);    // 마지막 항목과 교환
        pq[N+1] = null; // 로이터링(안쓰는 메모리 점유) 방지
        sink(1); //힙 속성 복구
        return max;
    }

    private boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }
    private void exch(int i, int j) {
        Key t = pq[i];
        pq[i] = pq[j];
        pq[j] = t;
    }

    private void swim(int k) {
        while (k > 1 && less(k/2, k)) {
            exch(k/2, k);
            k = k/2;
        }
    }

    private void sink(int k) {
        while (2*k <= N) {
            int j = 2*k;
            if(j < N && less(j, j+1)) j++;
            if(!less(k,j)) break;
            exch(k, j);
            k = j;
        }
    }

}

class Main {

    public static void main(String[] args) {
        BMaxPriorityQueue<Integer> bMaxPriorityQueue = new BMaxPriorityQueue<>(10);

        bMaxPriorityQueue.insert(1);
        bMaxPriorityQueue.insert(2);
        bMaxPriorityQueue.insert(3);
        bMaxPriorityQueue.insert(4);

        while(!bMaxPriorityQueue.isEmpty())
         System.out.print(bMaxPriorityQueue.delMax() + " ");


    }
}

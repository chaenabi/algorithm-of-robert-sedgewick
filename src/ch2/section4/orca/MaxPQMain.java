package ch2.section4.orca;

public class MaxPQMain {
    public static void main(String[] args) {
        MaxPQ<String> pq = new MaxPQ<>(5);
        pq.insert("A");
        pq.insert("Z");
        pq.insert("D");
        pq.insert("E");
        pq.insert("H");

        System.out.println(pq.delMax());
        System.out.println(pq.delMax());
        System.out.println(pq.delMax());
        System.out.println(pq.delMax());
        System.out.println(pq.delMax());
    }
}

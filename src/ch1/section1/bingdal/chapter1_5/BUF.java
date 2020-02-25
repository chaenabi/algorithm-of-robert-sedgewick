package ch1.section1.bingdal.chapter1_5;

abstract class BUF {
    protected int[] id;
    protected int count; // 컴포넌트 갯수

    abstract int find(int p);
    abstract void union(int p, int q);

    public BUF() {}

    public BUF(int n) {
        count = n;
        id = new int[n];
        for(int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public int getCount() {
        return count;
    }
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }
}
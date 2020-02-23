package ch1.section1.bingdal.chapter1_5;

public class BQuickUnion extends BUF {

    public BQuickUnion(int n) {
        super(n);
    }

    @Override
    int find(int p) {
        while(p != id[p]) p = id[p];
        return p;
    }

    @Override
    void union(int p, int q) {
        int i = find(p);
        int j = find(q);
        if(i == j) return;

        id[i] = j;

        count--;

    }
}
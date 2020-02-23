package ch1.section1.bingdal.chapter1_5;

public class BWeightedQuickUnion  extends BUF {
    protected int[] sz;

    public BWeightedQuickUnion(int n) {
        count = n;
        id = new int[n];
        for(int i = 0; i < n; i++) id[i] = i;
        sz = new int[n];
        for(int j = 0; j < n; j++) sz[j] = 1;
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
        if( i == j) return;

        if(sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        }
        else {
            id[j] = i;
            sz[i] += sz[j];
        }
        count--;
    }

    int getComponentSize(int p) {
        int i = find(p);
        return sz[i];
    }

}

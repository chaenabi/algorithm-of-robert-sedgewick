package ch1.section5.orca;

public class WeightedQuickUnionUF extends UF {
    private int[] sz; // 각 뿌리 노드가 속한 트리의 노드 개수(컴포넌트 크기, 사이트가 인덱스로 사용됨)

    public WeightedQuickUnionUF() {
        super();
    }

    public WeightedQuickUnionUF(int N) {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) id[i] = i;
        sz = new int[N];
        for (int i = 0; i < N; i++) sz[i] = 1;
    }

    @Override
    public int find(int p) {
        while (p != id[p]) p = id[p];
        return p;
    }

    @Override
    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);
        if (i == j) return;

        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
        count--;
    }

    public int getComponentSize(int p) {
        return sz[find(p)];
    }
}

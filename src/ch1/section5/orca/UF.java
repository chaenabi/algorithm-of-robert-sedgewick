package ch1.section5.orca;

public abstract class UF {
    protected int[] id;   // 컴포넌트 식별자를 저장(배열 인덱스는 사이트를 의미)
    protected int count;  // 컴포넌트의 개수

    public UF() {
    }

    public UF(int N) {
        this.count = N;  // 10  -> 컴포넌트 개수
        id = new int[N];
        for (int i = 0; i < id.length; i++) {
            id[i] = i; // 각 사이트마다 컴포넌트 할당
        }
    }

    public int count() { return count; }

    public abstract int find(int p);
    public abstract void union(int p, int q);

    public boolean connected(int p, int q) { return find(p) == find(q); }
}

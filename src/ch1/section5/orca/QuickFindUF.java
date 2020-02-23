package ch1.section5.orca;

public class QuickFindUF extends UF {

    public QuickFindUF(int N) {
        super(N);
    }

    @Override
    public int find(int p) {
        return id[p];
    }

    @Override
    public void union(int p, int q) { // p랑 q를 하나의 컴포넌트로 합쳐줌.
        int pID = find(p);  // p의 컴포넌트를 구함.
        int qID = find(q);  // q의 컴포넌트를 구함.

        if (pID == qID) return;  // 이미 같은 컴포넌트이므로 return

        for (int i = 0; i < id.length; i++) {
            if (id[i] == pID) id[i] = qID;
        }
        count--;
    }
}

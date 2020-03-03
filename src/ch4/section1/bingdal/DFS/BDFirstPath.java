package ch4.section1.bingdal.DFS;

import ch4.section1.bingdal.Graph;

import java.util.Stack;

class BDFirstPath {

    private boolean[] marked; // dfs()가 이 해당 정점에 호출된 것이 있는가?
    private int[] edgeTo;  // 해당 정점으로 가는 경로의 마지막 정점
    private final int s;    // 원점

    public BDFirstPath(Graph G, int s) {
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        this.s = s;
        dfs(G,s);
    }

    private void dfs(Graph G, int v) {
        marked[v] = true;
        for(int w : G.adj(v)){
            if(!marked[w]) {
                edgeTo[w] = v;
                dfs(G, w);
            }
        }
    }
    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public Iterable<Integer> pathTo(int v) {
        if(!hasPathTo(v)) return null;
        Stack<Integer> path = new Stack<>();
        for(int x = v; x != s; x = edgeTo[x]) {
            path.push(x);
        }
        path.push(s);
        return path;

    }


}

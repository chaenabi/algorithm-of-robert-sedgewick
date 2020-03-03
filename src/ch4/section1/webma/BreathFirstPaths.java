package ch4.section1.webma;


import ch1.section3.orca.Queue;
import edu.princeton.cs.algs4.Stack;

public class BreathFirstPaths {
    private boolean[] marked;
    private int[] edgeTo;
    private final int s;

    public BreathFirstPaths(Graph G, int s) {
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        this.s = s;
        bfs(G, s);
    }

    private void bfs(Graph G, int s) {
        Queue<Integer> queue = new Queue<>();
        marked[s] = true;
        queue.enqueue(s);
        while (!queue.isEmpty()) {
            int v = queue.dequeue();
            for (int w : G.adj(v)) {
                if (!marked[w]) {
                    edgeTo[w] = v;  // 최단 경로의 마지막 간선을 저장,
                    marked[w] = true; // 경로가 찾아 졌으므로 방문 표시,
                    queue.enqueue(w);  // 그리고 큐에 삽입
                }
            }
        }
    }

    public boolean hasPathTo(int v) { return marked[v]; }
    public Iterable<Integer> pathTo(int v) {
        if (!hasPathTo(v)) return null;
        Stack<Integer> path = new Stack<>();
        for(int x = v; x != s; x = edgeTo[x])
            path.push(x);
        path.push(s);
        return path;
    }
}

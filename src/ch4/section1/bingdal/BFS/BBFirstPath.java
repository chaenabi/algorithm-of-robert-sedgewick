package ch4.section1.bingdal.BFS;

import ch1.section3.orca.Queue;
import ch4.section1.bingdal.Graph;

import java.util.Stack;

class BBFirstPath {
    private boolean[] marked; //이 정점으로의 최단 경로가 찾아 졌는가?
    private int[] edgeTo; // 이정점으로의 경로에서 마지막 정점
    private final int s;  // 원점

    public BBFirstPath(Graph G, int s) {
        marked = new boolean[G.V()]; // V는 정점의 갯수
        edgeTo = new int[G.V()];
        this.s = s;
        bfs(G, s);
    }

    private void bfs(Graph G, int s) {
        Queue<Integer> queue = new Queue<>();
        marked[s] = true;   // 원점에 방문 표시하기
        queue.enqueue(s);   // 그리고 큐에 삽입
        while(!queue.isEmpty()) {
            int v = queue.dequeue(); //큐에서 다음 정점 꺼내기
            for(int w : G.adj(v))
                if(!marked[w]) {   // 방문 표시되지 않은 모든 인접 정점들에 대해,
                    edgeTo[w] = v;  //  최단 경로의 마지막 간선을 저장,
                    marked[w] = true; // 경로가 찾아졌으므로 방문 표시,
                    queue.enqueue(w); // 그리고 큐에 삽입
                }
        }
    }

    public  boolean hasPathTo(int v) {
        return  marked[v];
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

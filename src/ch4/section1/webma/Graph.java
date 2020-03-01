package ch4.section1.webma;

import edu.princeton.cs.algs4.In;

import java.util.LinkedList;

public class Graph {
    private final int V;  // 정점 개수
    private int E;  // 간선 개수
    private LinkedList<Integer>[] adj;  // 인접 리스트

    public Graph(int v) {
        this.V = v;
        this.E = 0;
        adj = (LinkedList<Integer>[]) new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public Graph(In in) {
        this(in.readInt());  // V를 읽어 들여 this에 그래프를 생성
        int E = in.readInt();  // E를 읽어 들임
        for (int i = 0; i < E; i++) {
            int v = in.readInt();  // 정점 읽기
            int w = in.readInt();  // 정점 읽기
            addEdge(v, w);  // 읽은 두 정점을 연결하는 간선 추가
        }
    }

    public int V() { return V; }
    public int E() { return E; }

    public void addEdge(int v, int w) {
        adj[v].addFirst(w);  // w를 v의 리스트에 추기
        adj[w].addFirst(v);  // v를 w의 리스트에 추가
        E++;
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }
}

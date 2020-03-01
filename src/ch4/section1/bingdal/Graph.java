package ch4.section1.bingdal;

import edu.princeton.cs.algs4.In;

import java.util.LinkedList;

public class Graph {

    private final int V; // 정점 개수
    private int E;       // 간선 개수
    private LinkedList<Integer>[] adj;

    public  Graph(int V) {
        this.V = V;
        this.E = 0;
        adj = (LinkedList<Integer>[]) new LinkedList[V];
        for(int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }

    }

    public Graph(In in) {

        this(in.readInt());
        int E = in.readInt();
        for(int i = 0; i < E; i++) {
            int v = in.readInt();
            int w = in.readInt();
            addFirst(v, w);
        }
    }

    public int V() { return V; }
    public int E() { return E; }

    public void addFirst(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }

    public Iterable<? extends Integer> adj(int v) {
        return  adj[v];
    }
}


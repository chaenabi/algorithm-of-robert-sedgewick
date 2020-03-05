package ch4.section1.bingdal.CC;

import ch4.section1.bingdal.Graph;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdOut;

public class CCMain {
    public static void main(String[] args) {
        Graph G = new Graph(new In("tinyG.txt"));
        ConnectedComponents cc = new ConnectedComponents(G);

        int M = cc.count();
        StdOut.println(M + " components");

        Queue<Integer>[] components;
        components = (Queue<Integer>[]) new Queue[M];
        for(int i = 0; i < M; i++) {
            components[i] = new Queue<Integer>();
        }
        for(int v = 0; v < G.V(); v++) {
            components[cc.id(v)].enqueue(v);
        }
        for(int i = 0; i < M; i++) {
            for(int v: components[i]) {
                StdOut.print(v + " ");
            }
            StdOut.println();
        }

    }
}

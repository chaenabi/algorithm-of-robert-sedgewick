package ch4.section1.webma;

import edu.princeton.cs.algs4.In;

public class TestSearch {
    public static void main(String[] args) {
        Graph G = new Graph(new In("tinyG.txt"));
        int s = Integer.parseInt("0");
//        BreathFirstPaths search = new BreathFirstPaths(G, s);
        DepthFirstSearch search = new DepthFirstSearch(G, s);

        for (int v = 0; v < G.V(); v++) {
            if (search.marked(v))
                System.out.print(v + " ");
        }
        System.out.println();

        if (search.count() != G.V())
        System.out.print("NOT ");
        System.out.println("connected");
    }
}

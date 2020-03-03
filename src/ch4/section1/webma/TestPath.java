package ch4.section1.webma;

import edu.princeton.cs.algs4.In;

public class TestPath {
    public static void main(String[] args) {
        Graph G = new Graph(new In("tinyG.txt"));
        int s = Integer.parseInt("0");
        DepthFirstPaths search = new DepthFirstPaths(G, s);
        for (int v = 0; v < G.V(); v++) {
            System.out.print(s + " to " + v + ": ");
            if (search.hasPathTo(v)) {
                for (int x : search.pathTo(v)) {
                    if (x == s) System.out.print(x);
                    else System.out.print("-" + x);
                }
            }
            System.out.println();
        }
    }
}

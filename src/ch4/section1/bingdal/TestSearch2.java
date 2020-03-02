package ch4.section1.bingdal;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;


public class TestSearch2 {
        public static void main(String[] args) {
            Graph G = new Graph(new In("tinyG.txt"));
            int s = 0;
            BDFPath search = new BDFPath(G, s);

            for (int v = 0; v < G.V(); v++) {
                System.out.print(s + " to " + v + ": ");


                if (search.hasPathTo(v))
                    for(int x : search.pathTo(v)) {
                        if (x == s) StdOut.print(x);
                        else StdOut.print("-" + x);
                    }
                System.out.println();
            }
        }

}

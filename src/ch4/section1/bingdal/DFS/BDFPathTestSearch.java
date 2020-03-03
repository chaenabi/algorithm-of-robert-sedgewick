package ch4.section1.bingdal.DFS;

import ch4.section1.bingdal.DFS.BDFPath;
import ch4.section1.bingdal.Graph;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;


public class BDFPathTestSearch {
        public static void main(String[] args) {
            Graph G = new Graph(new In("tinyG.txt"));
            int s = 0;
            BDFPath search = new BDFPath(G, s);

            for (int v = 0; v < G.V(); v++) {
                StdOut.print(s + " to " + v + ": ");
                if (search.hasPathTo(v))
                    for(int x : search.pathTo(v))
                        if (x == s) StdOut.print(x);
                        else StdOut.print("-" + x);

                StdOut.println();
            }
        }



}

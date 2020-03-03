package ch4.section1.bingdal.DFS;

import ch4.section1.bingdal.DFS.BDFS;
import ch4.section1.bingdal.Graph;
import edu.princeton.cs.algs4.In;


public class BDFSTestSearch {
        public static void main(String[] args) {
            Graph G = new Graph(new In("tinyG.txt"));
            int s = 0;
            BDFS search = new BDFS(G, s);

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

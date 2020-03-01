package ch4.section1.webma;

import edu.princeton.cs.algs4.DepthFirstSearch;
import edu.princeton.cs.algs4.In;

public class TestSearch {
    public static void main(String[] args) {
        Graph G = new Graph(new In("13 13 0 5 4 3 0 1 9 12 6 4 5 4 0 2 11 12 9 10 0 6 7 8 9 11 5 3"));
        int s = Integer.parseInt();
        Search saerch = new Search(G, s);

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

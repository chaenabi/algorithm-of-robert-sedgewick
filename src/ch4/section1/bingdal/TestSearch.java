package ch4.section1.bingdal;

import edu.princeton.cs.algs4.StdOut;

public class TestSearch {

    public static void main(String[] args) {
        int[] source = {0,0,1,2,3,4,5,6};

        Graph G = new Graph(source[0]);
       // int s = Integer.parseInt(source[1]); // ?
      //  Search search = new Search(G, s);


    for(int v = 0; v < G.V(); v++)
       // if(search.marked(v))
        StdOut.print(v + " ");
            StdOut.println();


    //    if(search.count() != G.V())
                StdOut.print("NOT ");
            StdOut.println("connected");

    }
}

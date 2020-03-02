package ch4.section1.bingdal;

import edu.princeton.cs.algs4.StdOut;

public class TestSearch {

    public static void main(String[] args) {
        int[] source = {0, 0, 1, 2, 3, 4, 5, 6};
        Graph graph = new Graph(source.length);
        BDFS bdfs = new BDFS(graph, 0);
        System.out.println(bdfs.count());

    }
}

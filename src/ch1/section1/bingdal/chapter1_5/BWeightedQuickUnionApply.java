package ch1.section1.bingdal.chapter1_5;

import java.util.Scanner;

public class BWeightedQuickUnionApply {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        BWeightedQuickUnion bWeightedQuickUnion = new BWeightedQuickUnion(N);
        while(scanner.hasNext()) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            if(bWeightedQuickUnion.connected(p, q)) continue;
            bWeightedQuickUnion.union(p, q);
            System.out.println(p + " "+q);
        }
        System.out.println(bWeightedQuickUnion.getCount() + " components");

    }



}

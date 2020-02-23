package ch1.section1.bingdal.chapter1_5;

import java.util.Scanner;

public class BQuickUnionApply {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        BQuickUnion bQuickUnion = new BQuickUnion(N);
        while(scanner.hasNext()) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            if(bQuickUnion.connected(p, q)) continue;
            bQuickUnion.union(p, q);
            System.out.println(p + " "+q);
        }
        System.out.println(bQuickUnion.getCount() + " components");

    }
}


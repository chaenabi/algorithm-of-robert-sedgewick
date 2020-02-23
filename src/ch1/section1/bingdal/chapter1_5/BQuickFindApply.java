package ch1.section1.bingdal.chapter1_5;

import java.util.Scanner;

// quick union-find
public class BQuickFindApply {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        BQuickFind bQuickFind = new BQuickFind(N);
        while(scanner.hasNext()) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            if(bQuickFind.connected(p, q)) continue;
            bQuickFind.union(p, q);
            System.out.println(p + " "+q);
        }
        System.out.println(bQuickFind.getCount() + " components");

    }
}

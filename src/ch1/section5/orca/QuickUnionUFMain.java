package ch1.section5.orca;

import java.util.Scanner;

public class QuickUnionUFMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuickUnionUF quickUnionUF = new QuickUnionUF(10);

        while (scanner.hasNext()) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();

            if (quickUnionUF.connected(p, q)) continue;
            quickUnionUF.union(p, q);
            System.out.println(p + " " + q);
        }
        System.out.println(quickUnionUF.count() + " components");
    }
}

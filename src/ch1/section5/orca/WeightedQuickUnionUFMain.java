package ch1.section5.orca;

import java.util.Scanner;

public class WeightedQuickUnionUFMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        WeightedQuickUnionUF weightedQuickUnionUF = new WeightedQuickUnionUF(N);

        while (scanner.hasNext()) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();

            if (weightedQuickUnionUF.connected(p, q)) continue;

            weightedQuickUnionUF.union(p, q);
            System.out.println(p + " " + q);
        }

        System.out.printf("%d번째 노드가 속한 컴포넌트의 노드 개수는: %d\n", 8, weightedQuickUnionUF.getComponentSize(8));
        System.out.printf("%d번째 노드가 속한 컴포넌트의 노드 개수는: %d\n", 4, weightedQuickUnionUF.getComponentSize(4));
        System.out.printf("%d번째 노드가 속한 컴포넌트의 노드 개수는: %d\n", 2, weightedQuickUnionUF.getComponentSize(2));
        System.out.printf("%d번째 노드가 속한 컴포넌트의 노드 개수는: %d\n", 6, weightedQuickUnionUF.getComponentSize(6));
        System.out.printf("%d번째 노드가 속한 컴포넌트의 노드 개수는: %d\n", 7, weightedQuickUnionUF.getComponentSize(7));
        System.out.printf("%d번째 노드가 속한 컴포넌트의 노드 개수는: %d\n", 1, weightedQuickUnionUF.getComponentSize(1));
        System.out.printf("%d번째 노드가 속한 컴포넌트의 노드 개수는: %d\n", 5, weightedQuickUnionUF.getComponentSize(5));
        System.out.println(weightedQuickUnionUF.count() + " components");

    }
}

package ch2.section1.bingdal;

import java.util.Arrays;
import java.util.Scanner;

public class BSelection extends BSortTemplate {

    @Override
    public void sort(Comparable[] a) {
        int size = a.length;
        for(int i = 0; i < size; i++) {
            int min = i;
            for(int j= i+1; j < size; j++) {
                if(less(a[j], a[min])) min = j;
                exch(a, i, min);
            }
        }
    }

    public static void main(String[] args) {
        BSelection selection = new BSelection();

      /*  Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        while(scanner.hasNext()) {
            String temp = scanner.nextLine();
            stringBuilder.append(temp);
        }
        String[] text = stringBuilder.toString().split(" ");
*/
        selection.sort(text);
        assert isSorted(text);
        show(text);

    }

}


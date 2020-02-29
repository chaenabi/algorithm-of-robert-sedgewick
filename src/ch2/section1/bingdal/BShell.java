package ch2.section1.bingdal;

public class BShell extends BSortTemplate {


    public void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3) h = 3 * h + 1; // 1, 4, 13까지  // 40, 121....
        while(h >= 1) {
            for(int i =h; i < N; i++) {
                for(int j = i; j >= h && less(a[j], a[j -h]); j-= h) {
                    exch(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        BShell shell = new BShell();

      /*  Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        while(scanner.hasNext()) {
            String temp = scanner.nextLine();
            stringBuilder.append(temp);
        }
        String[] text = stringBuilder.toString().split(" ");
*/
        shell.sort(text);
        assert isSorted(text);
        show(text);

    }
}

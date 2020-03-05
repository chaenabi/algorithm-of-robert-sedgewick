package DynamicProgramming.chapter1;

//Understanding Recursion calls
interface Factorial {
    public int getFactorialRecursion(int n);
    public int getFactorialNotRecursion(int n);
}

class Section1 implements Factorial {

    @Override
    public int getFactorialRecursion(int n) {
        if(n <= 0) return 0;
        if(n == 1) return n;
        else return n + getFactorialRecursion(n-1);
    }

    @Override
    public int getFactorialNotRecursion(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Factorial factorial = new Section1();
        System.out.println(factorial.getFactorialRecursion(3));
        System.out.println(factorial.getFactorialNotRecursion(3));
    }
}


class Practice {
    static int[] arr = new int[6];

    private static void acculRecursion(int[] arr, int i) {
        if(i == arr.length) return;

        if(i != 0) {
            arr[i] += arr[i-1];
        }
        acculRecursion(arr, i+1);
    }

    private static int[] acculNotRecursion(int[] arr) {

        for(int i = 1; i < arr.length; i++) {
            arr[i] += arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {

        for(int i=1; i <= arr.length; i++) {
            arr[i-1] = i;
        }
        System.out.print("base: ");
        for(int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
        int j = 0;
        acculRecursion(arr, j);
        System.out.print("recursion: ");
        for(int ar : arr) {
            System.out.print(ar + " ");
        }

        System.out.println();
        for(int i=1; i <= arr.length; i++) {
            arr[i-1] = i;
        }

        int[] result2 = acculNotRecursion(arr);
        System.out.print("Not recursion: ");
        for(int r : result2) {
            System.out.print(r + " ");
        }
    }

}
package baekjoon.MathematicsChapter1;

class GCD {

    /*
        공약수란, 어떤 숫자 두 개를 각각 이 숫자로 나누었을 떄
        두 숫자 모두를 0으로 만들수 있는 숫자들을 말한다.

        최대 공약수는 줄여서 GCD라고 쓴다.  greatest common divisor
        두 수 A와 B의 최대 공약수 G는 A와 B의 공통된 약수 중에서 가장 큰 정수이다.

        최대 공약수가 1인 두 수를 서로소라고 한다.
        예를들어 15 17은 서로소이다.
     */

    //O(N)
    private static int notgcd(int a, int b) {
        int g = 1;
        int range = Math.min(a, b);
        for (int i = 2; i <= range; i++) {
            if (a % i == 0 && b % i == 0) {
                g = i;
            }
        }
        return g;
    }

    //gcd, not by recursion
    private static int gcd(int a, int b) {
        while (b != 0) {
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }

    // gcd by recursion
    private static int gcdRecursion(int a, int b) {
        if (b == 0) return a;
        else return gcdRecursion(b, a % b);
    }

    //실행부
    public static void main(String[] args) {
        System.out.println(GCD.gcd(24, 27));

    }
}



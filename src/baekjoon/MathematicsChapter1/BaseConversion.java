package baekjoon.MathematicsChapter1;

//진법 변환
public class BaseConversion {

    /*
        10진법 수 N을 B진법으로 바꾸려면 N이 0이 될 때 까지
        나머지를 계속해서 구하면 된다.

        즉... 11을 3진법으로 바꾸는 방법:
        a = 11/3   // a의 몫은 3, a의 나머지는 2
        a = 3/3    // a의 몫은 1, a의 나머지는 0
        a = 1/3    // a의 몫은 0, a의 나머지는 1

        11은 3진법으로 102이다.
     */
    //10진법 수 N을 B진법으로 바꾸기
    private static String conversion(int n, int b) {
        StringBuilder answer = new StringBuilder();
        while(n > 0) {
            int r = n % b;
            if(r < 10) {
                answer.append(String.valueOf(r));
            } else {
                answer.append(r - 10);
            }
            n /= b;
        }
        return answer.reverse().toString();
    }

    public static void main(String[] args) {
        int n = 11;
        int b = 3;
        System.out.println(conversion(n, b));
    }

}

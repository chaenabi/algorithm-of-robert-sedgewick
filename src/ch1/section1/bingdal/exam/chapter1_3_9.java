package ch1.section1.bingdal.exam;

// 표준 입력으로부터 좌측 괄호가 빠진 수식을 입력받아, 이항 연산 단위로 괄호 쌍에 맞게
// 좌측 괄호가 추가된 동등한 수식을 출력하는 프로그램을 작성하세요.


import java.util.Stack;

// 예시
// 입력 :  1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )
// 출력 : ( ( 1 + 2 ) * ( ( 3 - 4 ) * 5 - 6 ) ) )
public class chapter1_3_9 {

    public static void main(String[] args) {
        String source = "1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )";
        String[] trimmedSource = source.split(" ");

        Stack<String> ops = new Stack<String>();
        Stack<String> vals = new Stack<String>();

        for (String s : trimmedSource) {

            switch (s) {
                case "+":
                case "-":
                case "/":
                case "*":
                    ops.push(s);
                    break;
                case ")":
                    String val1 ="", val2 ="", op="", temp = "";
                    if(!vals.isEmpty()) {
                        val1 = vals.pop();
                        val2 = vals.pop();
                    }
                    if(!ops.isEmpty()) {
                        op = ops.pop();
                    }
                    temp = "(" + val2 + op + val1 + s;
                    vals.push(temp);
                    break;

                default: vals.push(s);
            }

        }

        for(String result : vals) {
            System.out.print(result);
        }
    }

}

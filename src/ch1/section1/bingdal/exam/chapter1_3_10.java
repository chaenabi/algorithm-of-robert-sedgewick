package ch1.section1.bingdal.exam;

/*
    이항 연산자 방식의 산술 표현식을 입력받아 후치 연산자 방식으로
    변환하는 필터 프로그램 InfixToPostfix를 작성하세요.
 */
/* 예시
    입력 : 3 + 4 * 5 / 6
    출력 : 3 4 5 * 6 / +
*/
import java.util.Stack;

public class chapter1_3_10 {

    public static void main(String[] args) {
        String source = "3 + 4 * 5 / 6";
        String[] trimmedSource = source.split(" ");

        Stack<String> ops = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        boolean isPopped = false;
        for(String s:trimmedSource) {

            switch (s) {
                case "+":
                case "-":
                    ops.push(s);
                    break;
                case "*":
                case "/":
                    ops.push(s);
                    isPopped = true;
                    break;
                default:
                    stringBuilder.append(s + " ");
                    if(isPopped) { //
                        stringBuilder.append(ops.pop() +" ");
                        isPopped = false;
                    }

            }
        }
        while(!ops.isEmpty()) {
            stringBuilder.append(ops.pop() + " ");
        }
        System.out.println(stringBuilder.toString());

    }


}

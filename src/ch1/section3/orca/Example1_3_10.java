package ch1.section3.orca;

public class Example1_3_10 {
    public static void main(String[] args) {
        String str1 = "3 + 4 * 5 / 6";  // 3 4 5 * 6 / +
        String str2 = "2 + 3 * 4 - 5";
        String result = logic(str1.split(" "));
        System.out.println(result);
    }

    private static String logic(String[] s) {
        Stack<String> expr = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder("");
        boolean isPopped = false;
        for (int i = 0; i < s.length; i++) {
            switch(s[i]) {
                case "+":
                case "-":
                    expr.push(s[i]);
                    break;
                case "*":
                case "/":
                    expr.push(s[i]);
                    isPopped = true; // *, / 우선순위가 높으므로 다음 숫자 이후에 pop을 하기 위해 설정해줌.
                    break;
                default:
                    stringBuilder.append(s[i] + " ");
                    if (isPopped) {
                        stringBuilder.append(expr.pop() + " ");
                        isPopped = false;
                    }
            }
        }
        while (!expr.isEmpty()) {
            stringBuilder.append(expr.pop()+ " ");
        }

        return stringBuilder.toString();
    }
}

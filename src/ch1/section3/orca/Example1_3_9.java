package ch1.section3.orca;

public class Example1_3_9 {
    public static void main(String[] args) {

        String operation = "1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )";
        String result = logic(operation);
        System.out.println(result);
    }

    private static String logic(String operation) {
        Stack<String> ops = new Stack<>();
        Stack<String> vals = new Stack<>();

        String[] strArr = operation.split(" ");
        String val1, val2, op, temp;

        for (int i = 0; i < strArr.length; i++) {
            switch(strArr[i]) {
                case "+":
                case "-":
                case "*":
                case "/":
                    ops.push(strArr[i]);
                    break;
                case ")":
                    val2 = vals.pop(); val1 = vals.pop(); op = ops.pop();
                    temp = "( " + val1 + " " + op + " " + val2 + " )";
                    vals.push(temp);
                    break;
                default: // 숫자
                    vals.push(strArr[i]);
            }
        }

        return vals.pop();
    }
}

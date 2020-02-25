package ch1.section3.orca;

public class Example1_3_11 {
    public static void main(String[] args) {
        System.out.println(EvaluatePostfix("3 4 5 * 6 / +".split(" ")));
        System.out.println(EvaluatePostfix("1 2 3 4 * 6 / + -".split(" ")));
    }

    public static double EvaluatePostfix(String[] expr) {
        Stack<Double> stack = new Stack<>();
        double val1, val2;
        for (int i = 0; i < expr.length; i++) {
            switch(expr[i]) {
                case "+":
                    val2 = stack.pop(); val1 = stack.pop();
                    stack.push(val1 + val2);
                    break;
                case "-":
                    val2 = stack.pop(); val1 = stack.pop();
                    stack.push(val1 - val2);
                    break;
                case "*":
                    val2 = stack.pop(); val1 = stack.pop();
                    stack.push(val1 * val2);
                    break;
                case "/":
                    val2 = stack.pop(); val1 = stack.pop();
                    stack.push(val1 / val2);
                    break;
                default:  // Dobuel형으로 변환해서 스택에 집어 넣음.
                    stack.push(Double.parseDouble(expr[i]));
            }
        }

        return stack.pop();
    }
}

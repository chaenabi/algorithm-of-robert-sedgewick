package ch1.section1.orca;

import edu.princeton.cs.algs4.Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class EvaluateMain {

    public static void main(String[] args) {
        Deque<String> ops = new ArrayDeque<>();
        Deque<Double> vals = new ArrayDeque<>();
        String[] exprs = getExprs();
        System.out.println("계산된 결과는 " + Evaluate(ops, vals, exprs));
    }

    private static Double Evaluate(Deque<String> ops, Deque<Double> vals, String[] exprs) {
        String op;
        Double val1;
        for (int i = 0; i < exprs.length; i++) {
            switch(exprs[i]) {
                case "(":
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                case "sqrt":
                    ops.push(exprs[i]);
                    break;
                case ")": // 닫는 괄호인 경우, 두 개의 숫자를 빼서 연산을 진행하여 다시 피연산자 스택(vals)에 집어 넣음.
                    op = ops.pop();
                    val1 = vals.pop();
                    if (op.equals("+")) vals.push(vals.pop() + val1);
                    else if (op.equals("-")) vals.push(vals.pop() - val1);
                    else if (op.equals("*")) vals.push(vals.pop() * val1);
                    else if (op.equals("/")) vals.push(vals.pop() / val1);
                    else if (op.equals("sqrt")) vals.push(Math.sqrt(val1));
                    break;
                default: // 숫자인 경우 피연산자 스택(vals)에 집어 넣음.
                    vals.push(Double.parseDouble(exprs[i]));
            }
        }

        return vals.pop();
    }

    private static String[] getExprs() {
        Scanner scanner = new Scanner(System.in);
        String expr = scanner.nextLine();
        return expr.split(" ");
    }

}

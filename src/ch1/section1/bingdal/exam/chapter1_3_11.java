package ch1.section1.bingdal.exam;


import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Stack;

// EvaluatePostfix
public class chapter1_3_11 {

    public static void main(String[] args) {
        String source = "3 4 5 * 6 / +"; // 3 + 4 * 5 / 6;
        String[] trimmedSource = source.split(" ");

        FixedStack<String> ops = new FixedStack<>(10);
        String val1, val2;
        double result = 0.0;
        result = getResult(trimmedSource, ops, result);
        System.out.println(result);


    }

    private static double getResult(String[] trimmedSource, FixedStack<String> ops, double result) {
        String val1;
        String val2;
        for(String s : trimmedSource) {
            switch(s) {
                case "+":
                    if(!ops.isEmpty()) {
                        val1 = ops.pop();
                        val2 = ops.pop();
                        result = Double.parseDouble(val1) + Double.parseDouble(val2);
                       ops.push(String.valueOf(result));
                    }
                    break;
                case "-":
                    if(!ops.isEmpty()) {
                        val1 = ops.pop();
                        val2 = ops.pop();
                        result = Double.parseDouble(val1) - Double.parseDouble(val2);
                        ops.push(String.valueOf(result));
                    }
                    break;
                case "*":
                    if(!ops.isEmpty()) {
                        val1 = ops.pop();
                        val2 = ops.pop();
                        result = Double.parseDouble(val1) * Double.parseDouble(val2);
                        ops.push(String.valueOf(result));
                    }
                    break;
                case "/":
                    if(!ops.isEmpty()) {
                        val1 = ops.pop();
                        val2 = ops.pop();
                        result = Double.parseDouble(val1) / Double.parseDouble(val2);
                        ops.push(String.valueOf(result));
                    }
                    break;
                default:
                    ops.push(s);
            }
      }
        return result;
    }


}

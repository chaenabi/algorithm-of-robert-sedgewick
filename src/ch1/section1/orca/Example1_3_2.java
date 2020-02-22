package ch1.section1.orca;

public class Example1_3_2 {
    public static void main(String[] args) { // Example 1.3.2
        Stack<String> stack = new Stack<>();

        String str = "it was - the best - of times - - - it was - the - -";
        String[] strArr = str.split(" ");

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("-")) {
                System.out.println(stack.pop() + " ");
            } else {
                stack.push(strArr[i]);
            }
        }
        // expected: was best times of the was the it

    }
}

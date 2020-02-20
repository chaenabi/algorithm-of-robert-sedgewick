package ch1.section1.orca;

public class Example1_3_4 {
    public static void main(String[] args) {

        String str1 = "[()]{}{[()()]()}";
        String str2 = "[(])";

        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        printResult(charArr1);
        printResult(charArr2);

    }

    private static void printResult(char[] charArr) {
        if (isParentheses(charArr)) {
            System.out.println(String.valueOf(charArr) + " is parentheses.");
        } else {
            System.out.println(String.valueOf(charArr) + " is not parentheses.");
        }
    }

    private static boolean isParentheses(char[] charArr) {
        Stack<Character> stack = new Stack<Character>();
        boolean isParentheses = true;
        char item;
        for(int i = 0; i < charArr.length; i++) {
            switch(charArr[i]) {
                case '[':
                case '(':
                case '{':
                    stack.push(charArr[i]);
                    break;
                case ']':
                    item = stack.pop();
                    if (item != '[') return false;
                    break;
                case ')':
                    item = stack.pop();
                    if (item != '(') return false;
                    break;
                case '}':
                    item = stack.pop();
                    if (item != '{') return false;
                    break;
                default:
                    System.out.println("잘못된 문자입니다.");
                    return false;
            }
        }
        if (stack.isEmpty()) return true;
        else return false;
    }
}

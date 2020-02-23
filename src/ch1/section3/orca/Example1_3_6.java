package ch1.section3.orca;

public class Example1_3_6 {
    public static void main(String[] args) {
        System.out.println(Logic("A B C D E F G".split(" ")));  // expected: G F E D C B A


    }

    public static String Logic(String[] strArr) { // 아래 로직은 문자열을 reverse 시킴.
        Queue<String> q = new Queue<>();
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < strArr.length; i++) {
            q.enqueue(strArr[i]);
        }

        while (!q.isEmpty()) {
            stack.push(q.dequeue());
        }
        while (!stack.isEmpty()) {
            q.enqueue(stack.pop());
        }

        String result = "";

        while(!q.isEmpty()) {
            result += q.dequeue() + " ";
        }

        return result;
    }
}

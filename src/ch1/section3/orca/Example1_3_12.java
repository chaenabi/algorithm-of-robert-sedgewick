package ch1.section3.orca;

public class Example1_3_12 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("스택:");
        for (Integer num : stack) {
            System.out.println(num);
        }

        Stack<Integer> copiedStack = copy(stack);

        System.out.println("복사한 스택:");
        for (Integer num : copiedStack) {
            System.out.println(num);
        }
    }

    public static <E> Stack<E> copy(Stack<E> stack) {
        Stack<E> copiedStack = new Stack<E>();
        Stack<E> tempStack = new Stack<>();

        for (E item : stack) {
            tempStack.push(stack.pop());
        }

        for (E item : tempStack) {
            copiedStack.push(tempStack.pop());
        }

        return copiedStack;
    }
}

package ch1.section3.orca;

public class FixedCapacityGenericMain {
    public static void main(String[] args) {
        String text = "to be or not to - be - - that - - - is";
        String[] strArr = text.split(" ");

        FixedCapacityStack<String> stack = new FixedCapacityStack<>(1);

        for (int i = 0; i < strArr.length; i++) {
            switch(strArr[i]) {
                case "-":
                    if (!stack.isEmpty()) System.out.print(stack.pop() + " ");
                    break;
                default :
                    stack.push(strArr[i]);
                    break;
            }
        }
        System.out.println("(" + stack.size() + " left on stack)");

        for (String item : stack) {
            System.out.println(item);
        }
        System.out.println();
    }
}

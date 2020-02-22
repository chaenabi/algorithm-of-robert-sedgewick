package ch1.section1.orca;

public class FixedCapacityStackOfStringMain {
    public static void main(String[] args) {
        String text = "to be or not to - be - - that - - - is";
        String[] strArr = text.split(" ");

        FixedCapacityStackOfStrings stack = new FixedCapacityStackOfStrings(100);

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
        System.out.print("(" + stack.size() + " left on stack)");
        System.out.println();
    }
}

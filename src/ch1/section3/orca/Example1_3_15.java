package ch1.section3.orca;

import java.util.Scanner;

public class Example1_3_15 {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int nth = scanner.nextInt();
        scanner.nextLine();

        int enteredNum = nth + 3;
        for (int i = 0; i < enteredNum; i++) {
            System.out.printf("%d번째 문자열 입력: ", i + 1);
            queue.enqueue(scanner.nextLine());
        }

        for (int i = 0; i < enteredNum - nth; i++) {
            queue.dequeue();
        }

        System.out.printf("뒤에서 %d번째 문자열은: %s\n", nth, queue.dequeue());
    }
}

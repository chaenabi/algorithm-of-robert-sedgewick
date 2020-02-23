package ch1.section1.bingdal.exam;

import edu.princeton.cs.algs4.ResizingArrayQueue;

import java.util.Scanner;

public class QueueClient {

    public static void main(String[] args) {


        ResizingArrayQueue<String> arrayQueue = new ResizingArrayQueue<>();
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        scanner.nextLine();
        String source = scanner.nextLine();

        arrayQueue.enqueue(stringBuilder.append(source).reverse().toString());
        System.out.println(arrayQueue.dequeue().charAt(k));

    }


}

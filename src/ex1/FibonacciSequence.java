package ex1;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of Fibonacci numbers to generate: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;

        if (n <= 0) {
            System.out.println("The number of Fibonacci numbers must be positive.");
        } else if (n == 1) {
            System.out.println("Fibonacci sequence: ");
            System.out.println(a);
        } else {
            System.out.println("Fibonacci sequence: ");
            System.out.print(a + " " + b + " ");

            for (int i = 2; i < n; i++) {
                int next = a + b;
                System.out.print(next + " ");
                a = b;
                b = next;
            }
        }

        scanner.close();
    }
}

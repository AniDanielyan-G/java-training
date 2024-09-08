package ex1;

import java.util.Scanner;

public class NaturalLogarithmOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The number must be a positive integer.");
        } else {
            double result = 0.0;

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    result -= 1.0 / i;
                } else {
                    result += 1.0 / i;
                }
            }


            System.out.println("Approximation of ln(2) using " + n + " terms is: " + result);
        }

        scanner.close();
    }
}

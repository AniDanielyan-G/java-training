package ex1;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base number (n): ");
        int n = scanner.nextInt();

        System.out.println("Enter the exponent (k): ");
        int k = scanner.nextInt();

        long result = 1;
        for (int i = 0; i < k; i++) {
            result *= n;
        }

        System.out.println(n + " to the power of " + k + " is: " + result);

        scanner.close();
    }
}

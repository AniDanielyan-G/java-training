package ex1;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer representing half of the number of rows: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The number must be a positive integer.");
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = n - 1; i >= 1; i--) {
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}

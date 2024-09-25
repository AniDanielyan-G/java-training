package ex2;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.print("Enter the upper limit (n): ");
        int n = scanner.nextInt();
        int randomNumber = random.nextInt(n + 1);
        int userGuess = -1;

        System.out.println("Guess the number (between 0 and " + n + "):");

        while (userGuess != randomNumber) {
            userGuess = scanner.nextInt();
            if (userGuess > randomNumber) {
                System.out.println("Too high, try again.");
            } else if (userGuess < randomNumber) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number: " + randomNumber);
            }
        }


        System.out.println("Now, think of a number between 0 and " + n + " and I will try to guess it.");
        int low = 0;
        int high = n;
        String response = "";

        while (response.equals("") || !response.equals("c")) {
            int programGuess = random.nextInt(high - low + 1) + low;
            System.out.println("Is your number " + programGuess + "? (h/l/c)");
            response = scanner.next();

            if (response.equals("h")) {
                low = programGuess + 1;
            } else if (response.equals("l")) {
                high = programGuess - 1;
            } else if (response.equals("c")) {
                System.out.println("Yay! I've guessed your number: " + programGuess);
            } else {
                System.out.println("Invalid input. Please enter 'h' for higher, 'l' for lower, or 'c' for correct.");
            }
        }

        scanner.close();
    }
}

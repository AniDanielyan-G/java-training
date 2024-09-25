package ex3;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String input = scanner.nextLine();


        int characterCount = input.length();


        System.out.println("The string has " + characterCount + " characters.");

        scanner.close();
    }
}

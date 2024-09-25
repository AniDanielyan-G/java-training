package ex3;

import java.util.Scanner;

public class PrintCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String input = scanner.nextLine();


        for (char c : input.toCharArray()) {
            System.out.println(c);
        }

        scanner.close();
    }
}

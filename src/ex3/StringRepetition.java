package ex3;

import java.util.Scanner;

public class StringRepetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();


        System.out.print("Enter the number of times to repeat: ");
        int times = scanner.nextInt();


        String repeatedString = inputString.repeat(times);
        System.out.println(repeatedString);

        scanner.close();
    }
}

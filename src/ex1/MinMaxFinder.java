package ex1;

public class MinMaxFinder {
    public static void main(String[] args) {
        int[] inputNumbers = {5, 7, 6, 4, 1};
        int largest = inputNumbers[0];
        int smallest = inputNumbers[0];
        for (int i = 1; i < inputNumbers.length; i++) {
            if (inputNumbers[i] > largest) {
                largest = inputNumbers[i];
            }
            if (inputNumbers[i] < smallest) {
                smallest = inputNumbers[i];
            }
        }

        System.out.println("The largest number entered is: " + largest);
        System.out.println("The smallest number entered is: " + smallest);
    }
}

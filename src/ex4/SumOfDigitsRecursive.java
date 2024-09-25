package ex4;

public class SumOfDigitsRecursive {


    public static int sumOfDigits(int n) {
        // Base case: when n is 0
        if (n == 0) {
            return 0;
        }


        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int n = 12345;

        int sum = sumOfDigits(n);
        System.out.println("The sum of the digits of " + n + " is: " + sum);
    }
}

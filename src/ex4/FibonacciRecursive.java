package ex4;

public class FibonacciRecursive {

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("The " + n + "-th Fibonacci number is " + fib(n));
    }
}
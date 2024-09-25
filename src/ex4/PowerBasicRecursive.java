package ex4;

public class PowerBasicRecursive {

    public static int power(int n, int k) {
        if (k == 0) {
            return 1;
        }
        return n * power(n, k - 1);
    }

    public static void main(String[] args) {
        int n = 2;  // Base
        int k = 5;  // Exponent
        System.out.println(n + "^" + k + " = " + power(n, k));
    }
}

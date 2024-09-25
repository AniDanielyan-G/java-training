package ex2;

public class SumMethods {


    public static String sum(String a, String b) {
        return a + b;
    }


    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        String stringResult = sum("aa", "bb");
        int intResult = sum(1, 1);

        // Print the results
        System.out.println("Concatenation of strings: " + stringResult);
        System.out.println("Sum of integers: " + intResult);
    }
}

package ex1;

public class NumberOrder {
    public static void main(String[] args) {

        int num1 = 50;
        int num2 = 20;
        int num3 = 30;

        if (num1 < num2 && num2 < num3) {
            System.out.println("increasing");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("decreasing");
        } else {
            System.out.println("neither");
        }
    }

    }
package ex1;

public class Calculator {
    public static void main(String[] args) {
        char operator = '/';
        float num1 = 10;
        float num2 = 50;
        float result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + "*" + num2 + "=" + result);

                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Please use +, -, *, or /.");
        }

    }

}



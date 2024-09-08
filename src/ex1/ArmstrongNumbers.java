package ex1;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 500:");

        for (int num = 1; num <= 500; num++) {
            int originalNum = num;
            int sumOfCubes = 0;

            while (originalNum > 0) {
                int digit = originalNum % 10;
                sumOfCubes += digit * digit * digit;
                originalNum /= 10;
            }

            if (sumOfCubes == num) {
                System.out.println(num);
            }
        }
    }
}

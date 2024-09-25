package ex4;

public class ReverseArrayRecursive {

    public static void printReversed(int[] arr, int index) {

        if (index < 0) {
            return;
        }


        System.out.print(arr[index] + " ");


        printReversed(arr, index - 1);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6};
        System.out.print("Array in reversed order: ");
        printReversed(arr, arr.length - 1);
    }
}

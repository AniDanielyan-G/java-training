package ex1;

import java.util.Arrays;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        // Initial array
        int[] array = {1, 2, 3, 4};
        int elementToRemove = 2;


        System.out.println("Initial array: " + Arrays.toString(array));


        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != elementToRemove) {
                count++;
            }
        }

        int[] newArray = new int[count];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != elementToRemove) {
                newArray[index++] = array[i];
            }
        }

        System.out.println("Final array: " + Arrays.toString(newArray));
    }
}

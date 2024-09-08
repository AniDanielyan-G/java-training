package ex1;

import java.util.ArrayList;
import java.util.List;

public class FourElementCombinations {
    public static void main(String[] args) {
        int[] array = {1, 5, 1, 0, 6, 0, 10};
        int targetSum = 7;

        // Find and display all combinations of four elements whose sum equals the target sum
        findFourElementCombinations(array, targetSum);
    }

    public static void findFourElementCombinations(int[] array, int targetSum) {
        int n = array.length;
        List<String> result = new ArrayList<>();


        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                    for (int l = k + 1; l < n; l++) {

                        if (array[i] + array[j] + array[k] + array[l] == targetSum) {
                            result.add("(" + array[i] + ", " + array[j] + ", " + array[k] + ", " + array[l] + ")");
                        }
                    }
                }
            }
        }


        if (!result.isEmpty()) {
            System.out.println("Combinations of four elements whose sum is " + targetSum + ":");
            for (String combination : result) {
                System.out.println(combination);
            }
        } else {
            System.out.println("No combinations found with sum " + targetSum);
        }
    }
}

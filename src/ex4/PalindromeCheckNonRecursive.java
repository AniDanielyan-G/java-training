package ex4;

public class PalindromeCheckNonRecursive {

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "abba";
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome (Non-Recursive Check).");
        } else {
            System.out.println(str + " is not a palindrome (Non-Recursive Check).");
        }
    }
}

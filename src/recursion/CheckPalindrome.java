package recursion;

/*
    Check if a String is Palindrome Using Recursion

    Problem Statement: Given a string, check whether it is a palindrome using recursion.

    Example 1:
    Input: "NITIN"  ->  Output: Yes

    Example 2:
    Input: "HELLO"  ->  Output: No
*/

public class CheckPalindrome {

    public static void main(String[] args) {
        String str = "NITIN";
        boolean result = isPalindrome(str, 0, str.length() - 1);
        System.out.println("Palindrome: " + (result ? "Yes" : "No"));
    }

    private static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) return true;
        if (str.toLowerCase().charAt(start) != str.toLowerCase().charAt(end)) return false;
        return isPalindrome(str, start + 1, end - 1);
    }
}

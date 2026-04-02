package recursion;

/*
    Sum of First N Natural Numbers Using Recursion

    Problem Statement: Given a number N, find the sum of the first N natural numbers.

    Example 1:
    Input: N = 5  ->  Output: 15  (1+2+3+4+5)

    Example 2:
    Input: N = 6  ->  Output: 21  (1+2+3+4+5+6)
*/

public class SumOfNaturalNumbers {

    private static int sum(int n) {
        if (n == 1) return 1;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum: " + sum(n));
    }
}

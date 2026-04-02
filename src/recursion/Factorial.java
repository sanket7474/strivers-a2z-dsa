package recursion;

/*
    Factorial of a Number Using Recursion

    Problem Statement: Given a number X, find its factorial.
    X! = X * (X-1) * (X-2) ... 1
    Note: X is always a non-negative number. 0! = 1.

    Example:
    Input: X = 5  ->  Output: 120
*/

public class Factorial {

    private static int getFactorial(int x) {
        if (x == 0) return 1;
        return x * getFactorial(x - 1);
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println(getFactorial(x));
    }
}

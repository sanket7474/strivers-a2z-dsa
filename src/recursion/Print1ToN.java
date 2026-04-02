package recursion;

/*
    Print 1 to N Using Recursion

    Problem Statement: Print numbers from 1 to N using recursion.
*/

public class Print1ToN {

    public static void printNumbers(int n, int start) {
        if (start > n) return;
        System.out.print(start + " ");
        printNumbers(n, start + 1);
    }

    public static void main(String[] args) {
        printNumbers(10, 1);
    }
}

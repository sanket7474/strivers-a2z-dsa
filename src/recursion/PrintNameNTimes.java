package recursion;

/*
    Print Name N Times Using Recursion

    Problem Statement: Print your name N times using recursion.
*/

public class PrintNameNTimes {

    public static void printName(int n) {
        if (n <= 0) return;
        System.out.println("Sanket");
        printName(n - 1);
    }

    public static void main(String[] args) {
        printName(5);
    }
}

package recursion;

/*
    Reverse an Array Using Recursion

    Problem Statement: Given an array, reverse it using recursion.

    Example 1:
    Input: [5,4,3,2,1]  ->  Output: [1,2,3,4,5]

    Example 2:
    Input: [10,20,30,40]  ->  Output: [40,30,20,10]
*/

public class ReverseArray {

    public static void main(String[] args) {
        int arr[] = {2, 54, 1, 24, 88};
        reverseArr(arr, 0, arr.length - 1);

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    private static void reverseArr(int[] arr, int start, int end) {
        if (start >= end) return;
        swap(arr, start, end);
        reverseArr(arr, start + 1, end - 1);
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}

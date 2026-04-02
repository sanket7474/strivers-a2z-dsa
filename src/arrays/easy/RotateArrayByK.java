package arrays.easy;

/*
    189. Rotate Array
    https://leetcode.com/problems/rotate-array/

    Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

    Example 1:
    Input: nums = [1,2,3,4,5,6,7], k = 3  ->  Output: [5,6,7,1,2,3,4]

    Example 2:
    Input: nums = [-1,-100,3,99], k = 2  ->  Output: [3,99,-1,-100]
*/

public class RotateArrayByK {

    public static void main(String[] args) {

        int arr[] = {-1, -100, 3, 99};
        int k = 2;
        int count = 0;

        while (count < k) {
            rotateRight(arr, 1);
            count += 1;
        }

        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }

    private static void rotateRight(int[] arr, int k) {

        if (arr.length <= 1) return;

        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }
}

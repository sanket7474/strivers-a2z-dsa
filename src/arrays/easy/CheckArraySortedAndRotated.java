package arrays.easy;

/*
    1752. Check if Array Is Sorted and Rotated
    https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/

    Given an array nums, return true if the array was originally sorted in non-decreasing order,
    then rotated some number of positions (including zero). Otherwise, return false.
    There may be duplicates in the original array.

    Example 1:
    Input: nums = [3,4,5,1,2]  ->  Output: true

    Example 2:
    Input: nums = [2,1,3,4]  ->  Output: false

    Example 3:
    Input: nums = [1,2,3]  ->  Output: true
*/

public class CheckArraySortedAndRotated {

    public static void main(String[] args) {

        int arr[] = {2, 1, 3, 4};
        int drop = 0;
        int index = 0;
        boolean isSorted = false;

        while (index < arr.length - 1) {
            if (arr[index] > arr[index + 1]) {
                drop += 1;
            }
            if (drop >= 2) break;
            index += 1;
        }

        if (drop == 0) {
            isSorted = true;
        } else if (drop > 1) {
            isSorted = false;
        } else if (drop == 1 && arr[arr.length - 1] <= arr[0]) {
            isSorted = true;
        }

        System.out.println(isSorted);
    }
}

package arrays.easy;

/*
    283. Move Zeroes
    https://leetcode.com/problems/move-zeroes/description/

    Given an integer array nums, move all 0's to the end of it while maintaining
    the relative order of the non-zero elements.
    Note: Must be done in-place without making a copy of the array.

    Example 1:
    Input: nums = [0,1,0,3,12]  ->  Output: [1,3,12,0,0]

    Example 2:
    Input: nums = [0]  ->  Output: [0]
*/

public class MoveZeroes {

    public static void main(String[] args) {

        int arr[] = {0, 1, 0, 3, 12};

        moveZeroes(arr);

        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    private static void moveZeroes(int[] arr) {

        if (arr.length <= 1) return;

        int i = 0;
        int j = 0;
        int size = arr.length;

        while (i < size) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
            i++;
        }

        // fill remaining positions with zeroes
        while (j < size) {
            arr[j] = 0;
            j++;
        }
    }
}

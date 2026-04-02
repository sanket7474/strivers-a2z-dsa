package arrays.easy;

/*
    26. Remove Duplicates from Sorted Array
    https://leetcode.com/problems/remove-duplicates-from-sorted-array/

    Given an integer array sorted in non-decreasing order, remove the duplicates in-place
    such that each unique element appears only once. Return the number of unique elements.
*/

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {

        int currIndex = 0;
        int index = 0;

        while (index < nums.length) {
            if (nums[index] != nums[currIndex]) {
                currIndex += 1;
                nums[currIndex] = nums[index];
            }
            index += 1;
        }

        return currIndex + 1;
    }

    public static void main(String[] args) {

        int arr[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(removeDuplicates(arr));

        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }
}

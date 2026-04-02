package arrays.easy;

/*
    485. Max Consecutive Ones
    https://leetcode.com/problems/max-consecutive-ones/

    Given a binary array nums, return the maximum number of consecutive 1's in the array.

    Example 1:
    Input: nums = [1,1,0,1,1,1]  ->  Output: 3

    Example 2:
    Input: nums = [1,0,1,1,0,1]  ->  Output: 2
*/

public class MaxConsecutiveOnes {

    private static int findMaxConsecutiveOnes(int[] nums) {

        int maxCount = 0;
        int i = 0;

        while (i < nums.length) {
            int count = 0;
            while (i < nums.length && nums[i] == 1) {
                count += 1;
                i += 1;
            }
            if (maxCount < count) {
                maxCount = count;
            }
            i += 1;
        }

        return maxCount;
    }

    public static void main(String[] args) {

        int arr[] = {1, 0, 1, 1, 0, 1};

        System.out.println(findMaxConsecutiveOnes(arr));
    }
}

package arrays.medium;

/*
    53. Maximum Subarray (Brute Force - O(n³))
    https://leetcode.com/problems/maximum-subarray/description/

    Given an integer array nums, find the subarray with the largest sum and return that sum.

    Example 1:
    Input: nums = [2, 3, 5, -2, 7, -4]  ->  Output: 15

    Example 2:
    Input: nums = [-2, -3, -7, -2, -10, -4]  ->  Output: -2

    Note: See MaxSubarraySum_Kadane.java for the optimal O(n) solution.
*/

public class MaxSubarraySum_BruteForce {

    public static int maxSubArray(int[] nums) {

        int sum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += nums[k];
                }
                if (sum < currSum) {
                    sum = currSum;
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        int nums[] = {5, 4, -1, 7, 8};

        System.out.println(maxSubArray(nums));
    }
}

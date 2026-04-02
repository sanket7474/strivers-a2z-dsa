package arrays.medium;

/*
    53. Maximum Subarray (Kadane's Algorithm - O(n))
    https://leetcode.com/problems/maximum-subarray/description/

    Given an integer array nums, find the subarray with the largest sum and return that sum.

    Example 1:
    Input: nums = [2, 3, 5, -2, 7, -4]  ->  Output: 15

    Example 2:
    Input: nums = [-2, -3, -7, -2, -10, -4]  ->  Output: -2

    Note: See MaxSubarraySum_BruteForce.java for the O(n³) approach.
*/

public class MaxSubarraySum_Kadane {

    public static int maxSubArray(int[] nums) {

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum > maxSum) {
                maxSum = sum;
            }

            if (sum <= 0) {
                sum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int nums[] = {-5, -4, -1, -7, -8};

        System.out.println(maxSubArray(nums));
    }
}

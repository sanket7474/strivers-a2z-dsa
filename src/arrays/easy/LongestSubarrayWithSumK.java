package arrays.easy;

/*
    Longest Subarray with Sum K (Positive Numbers)

    Problem Statement: Given an array of positive integers and a number k,
    find the length of the longest subarray whose sum equals k.

    Example:
    Input: nums = [10, 5, 2, 7, 1, 9], k = 15  ->  Output: 4
*/

public class LongestSubarrayWithSumK {

    private static int longestSubarrayWithSumK(int[] nums, int k) {

        int left = 0;
        int right = 0;
        int maxLen = 0;
        int sum = nums[0];

        while (right < nums.length) {

            while (left <= right && sum > k) {
                sum -= nums[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right += 1;

            if (right < nums.length) {
                sum += nums[right];
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int nums[] = {10, 5, 2, 7, 1, 9};
        int k = 15;

        System.out.println(longestSubarrayWithSumK(nums, k));
    }
}

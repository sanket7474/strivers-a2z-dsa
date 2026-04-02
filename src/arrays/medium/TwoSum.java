package arrays.medium;

import java.util.HashMap;
import java.util.Map;

/*
    1. Two Sum
    https://leetcode.com/problems/two-sum/description/

    Given an array of integers nums and an integer target, return indices of the two numbers
    such that they add up to target.
    You may assume that each input would have exactly one solution,
    and you may not use the same element twice.

    Example:
    Input: nums = [2,7,11,15], target = 9  ->  Output: [0,1]
*/

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int output[] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int secondElem = target - nums[i];
            if (map.containsKey(secondElem) && map.get(secondElem) != i) {
                output[0] = map.get(secondElem);
                output[1] = i;
            }
        }

        return output;
    }

    public static void main(String[] args) {

        int nums[] = {2, 6, 5, 8, 11};
        int target = 14;

        int output[] = twoSum(nums, target);

        for (int elem : output) {
            System.out.print(elem + ", ");
        }
        System.out.println();
    }
}

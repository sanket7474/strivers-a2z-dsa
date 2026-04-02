package arrays.medium;

import java.util.HashMap;
import java.util.Map;

/*
    169. Majority Element
    https://leetcode.com/problems/majority-element/description/

    Given an array nums of size n, return the majority element.
    The majority element appears more than ⌊n / 2⌋ times.
    You may assume that the majority element always exists in the array.

    Example 1:
    Input: nums = [3,2,3]  ->  Output: 3

    Example 2:
    Input: nums = [2,2,1,1,1,2,2]  ->  Output: 2
*/

public class MajorityElement {

    public static int majorityElement(int[] nums) {

        int elem = nums[0];
        Map<Integer, Integer> map = new HashMap<>();

        if (nums.length == 1) return elem;

        for (int item : nums) {
            if (map.containsKey(item)) {
                int val = map.get(item) + 1;
                map.put(item, val);
                if (val >= nums.length / 2) {
                    return item;
                }
            } else {
                map.put(item, 1);
            }
        }

        return elem;
    }

    public static void main(String[] args) {

        int nums[] = {3, 3, 4};

        System.out.println(majorityElement(nums));
    }
}

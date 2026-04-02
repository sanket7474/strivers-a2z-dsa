package arrays.easy;

import java.util.HashMap;
import java.util.Map;

/*
    136. Single Number
    https://leetcode.com/problems/single-number/

    Given a non-empty array of integers nums, every element appears twice except for one.
    Find that single one.

    Example:
    Input: nums = [4,1,2,1,2]  ->  Output: 4
*/

public class SingleNumber {

    private static int singleNumber(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int elem : nums) {
            if (map.containsKey(elem)) {
                map.put(elem, map.get(elem) + 1);
            } else {
                map.put(elem, 1);
            }
        }

        for (int elem : map.keySet()) {
            if (map.get(elem) == 1) {
                return elem;
            }
        }

        return nums[0];
    }

    public static void main(String[] args) {

        int nums[] = {4, 1, 2, 1, 2};

        System.out.println(singleNumber(nums));
    }
}

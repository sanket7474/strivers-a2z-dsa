package arrays.medium;

/*
2149. Rearrange Array Elements by Sign
Solved
Medium
Topics
premium lock icon
Companies
Hint
You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should return the array of nums such that the array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

 

Example 1:

Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
Explanation:
The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions. 


https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
*/

public class RearrangeArrayElementsBySign {

    public static int[] rearrangeArray(int[] nums) {
        int ans[] = new int[nums.length];

        // maintaining two indexes one for pos no and another for neg

        // as ans arr will always start with pos no and then neg no
        // assigned values accordingly.
        int posIndex = 0;
        int negIndex = 1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < 0) {
                ans[negIndex] = nums[i];
                // next elem would be pos now hence adding 2
                negIndex += 2;
            } else {
                ans[posIndex] = nums[i];
                // next elem would be neg now hence adding 2
                posIndex += 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int nums[] = { 3, 1, -2, -5, 2, -4 };

        for (int elem : rearrangeArray(nums)) {
            System.out.print(elem + " ");
        }
    }
}

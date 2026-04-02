package arrays.easy;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/*
    Union of Two Sorted Arrays

    Problem Statement: Given two sorted arrays, find their union.
    The union contains all distinct elements from both arrays.

    Example:
    Input: arr1 = [1,2,3,4,5], arr2 = [2,3,4,4,5]
    Output: [1,2,3,4,5]
*/

public class UnionOfTwoSortedArrays {

    public static void main(String[] args) {

        Integer arr1[] = {1, 2, 3, 4, 5};
        Integer arr2[] = {2, 3, 4, 4, 5};

        Set<Integer> s = new LinkedHashSet<Integer>();

        s.addAll(Arrays.asList(arr1));
        s.addAll(Arrays.asList(arr2));

        System.out.println(s);
    }
}

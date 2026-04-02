package arrays.easy;

/*
    Find Second Smallest and Second Largest Element in an array

    Problem Statement: Given an array, find the second smallest and second largest element in the array.
    Print '-1' in the event that either of them doesn't exist.

    Example 1:
    Input:  [1, 2, 4, 7, 7, 5]
    Output: Second Smallest : 2 | Second Largest : 5

    Example 2:
    Input:  [1]
    Output: Second Smallest : -1 | Second Largest : -1
*/

public class SecondSmallestAndLargest {

    public static void main(String[] args) {

        int arr[] = {1, 2};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        if (arr.length <= 2) {
            secondMax = secondMin = -1;
        } else {
            for (int elem : arr) {
                if (max < elem) {
                    max = elem;
                } else if (secondMax < elem && elem != max) {
                    secondMax = elem;
                }

                if (min > elem) {
                    min = elem;
                } else if (secondMin > elem && elem != min) {
                    secondMin = elem;
                }
            }
        }

        System.out.println("Second Max: " + secondMax);
        System.out.println("Second Min: " + secondMin);
    }
}

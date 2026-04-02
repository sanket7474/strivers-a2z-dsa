package arrays.easy;

/*
    Check if an Array is Sorted

    Problem Statement: Given an array of size n, write a program to check if the given array
    is sorted in ascending (non-decreasing) order or not.
    Return True if sorted, else False.
*/

public class CheckArraySorted {

    public static void main(String[] args) {

        int arr[] = {5, 4, 6, 7, 8};
        int index = 0;
        boolean isSorted = true;

        while (index < arr.length - 1) {
            if (arr[index] > arr[index + 1]) {
                isSorted = false;
                break;
            }
            index += 1;
        }

        System.out.println(isSorted);
    }
}

package arrays.easy;

/*
    Left Rotate the Array by One

    Problem Statement: Given an integer array nums, rotate the array to the left by one.
    Note: Modify the given array in-place, no need to return anything.
*/

public class LeftRotateByOne {

    public static void main(String[] args) {

        int arr[] = {-1, 0, 3, 6};

        rotateArrayByOne(arr);

        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }

    private static void rotateArrayByOne(int[] arr) {

        if (arr.length <= 1) return;

        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
    }
}

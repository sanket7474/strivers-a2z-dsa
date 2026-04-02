package arrays.easy;

public class LargestElement {

    public static void main(String[] args) {

        int arr[] = {2, 5, 1, 3, 0};
        int max = arr[0];

        for (int elem : arr) {
            if (max < elem) {
                max = elem;
            }
        }

        System.out.println(max);
    }
}

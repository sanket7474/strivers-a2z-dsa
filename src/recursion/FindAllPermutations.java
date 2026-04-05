package recursion;

import java.util.ArrayList;
import java.util.List;

public class FindAllPermutations {

    public static void getAllPermutations(int nums[] , int index, List<String> permutationsList) {

        if(index == nums.length) {
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            boolean first = true;
            for(int item : nums) {

                if(first) {
                    sb.append(item);
                    first = false;
                } else {
                    sb.append(", " + item);
                }
                
            }
            sb.append("}");
            permutationsList.add(sb.toString());
            return;
        }

        for(int i = index ; i < nums.length ; i++) {
             // Swap the current index with the loop index to generate a new permutation
             // This step is crucial as it allows us to explore different arrangements of the elements
             // By swapping, we are effectively fixing one element at the current index and permuting the rest of the elements
             // For example, if we have an array [1, 2, 3] and we are at index 0, we will swap index 0 with index 0 (no change), then swap index 0 with index 1 (resulting in [2, 1, 3]), 
             // and then swap index 0 with index 2 (resulting in [3, 2, 1]). This way, we can generate all permutations of the array.
             swap(nums, i , index);
             // Recur with the next index to generate permutations for the remaining elements
             // This recursive call is where the actual generation of permutations happens. 
             // After swapping, we move to the next index and repeat the process until we reach the end of the array.
             getAllPermutations(nums, index + 1, permutationsList);
             // Swap back to restore the original array for the next iteration
             // This step is important to ensure that we can generate the next permutation correctly.
             // After we have generated all permutations for the current configuration, 
             // we need to swap back to restore the original order of the array before the next iteration of the loop.
             // WHY WE NEED TO SWAP BACK?
             // We need to swap back because we are modifying the original array in place to generate permutations.
             // If we do not swap back, the next iteration of the loop will be working with a modified array, 
             // which will lead to incorrect permutations being generated.
             swap(nums, i , index);
        }
    }

    private static void swap(int nums[], int a, int b) {

        int temp = nums[b];
        nums[b] = nums[a];
        nums[a] = temp;

    }
    public static void main(String[] args) {
        
        int nums[] = {1,2,3,4};
        List<String> permutationsList = new ArrayList<>();

        getAllPermutations(nums, 0, permutationsList);

        permutationsList.forEach(System.out::println);
    }
}

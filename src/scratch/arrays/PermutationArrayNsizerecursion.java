package scratch.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Time and space complexity: O(n * n!) time | O(n!) space
 * for a list of size n, There n! permutations.
 * There are N! permutations and it requires O(N) time to print a permutation. timecomplexity o(n*n!)
 * Space Complexity: O(N). Recursion stack.
 * Note: After making the recursive call, the swapped elements are reverted. This is to avoid using any extra space to serve a copy.
 * For each permutation,  permutations() method gets calls once so n!, and it requires o(n)
 * time to loop throuh all the elements of the array and each time its calling permutations() method.
   we use a for loop and we are calling permutations() inside for loop, so looping through all
 the items in array o(n), now until the  base case is hit the permutation() dosent terminate and
 there are n! base cases so total o(n*n!).  Therefore, there will be no more than (n * n!) function calls.
 */

public class PermutationArrayNsizerecursion {
    static int counter;
    static Set<List<Integer>> list;

public static void main(String[] args){
    int[] nums = new int[]{1,1,2};
    permute(nums);

}
    public static Set<List<Integer>> permute(int[] nums) {
        list = new HashSet<>();
        permutations(nums, 0);
        System.out.println(counter);
        System.out.println(list);

        return list;
    }

    private static void permutations(int[] nums, int i) {
        //if i reaches length just add nums to list and return
        counter++;
        if (i == nums.length) {
            List<Integer> list1 = new ArrayList<>();
            for (int item : nums) {
                list1.add(item);
            }
            System.out.println(list1);
            list.add(list1);
            return;
        }

        //iterate from i till length
        for (int j = i; j < nums.length; j++) {
            //swap i and j index
            swap(nums, i, j);
            //call permutation again with i+1 index
            permutations(nums, i + 1);
            //swap i and j index
            swap(nums, i, j);
        }
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
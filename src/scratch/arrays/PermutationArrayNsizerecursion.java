package scratch.arrays;

import java.util.ArrayList;
import java.util.List;

public class PermutationArrayNsizerecursion {
public static void main(String[] args){
    int[] nums = new int[]{1,2,3,4};
    permute(nums);

}
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        permutations(nums, 0);
        return list;
    }

    private static void permutations(int[] nums, int i) {
        //if i reaches length just add nums to list and return
        if (i == nums.length) {
            List<Integer> list1 = new ArrayList<>();
            for (int item : nums) {
                list1.add(item);
            }
            System.out.println(list1);
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
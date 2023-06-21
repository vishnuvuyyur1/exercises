package arrays;

import java.util.Arrays;

public class MinimumMoves {
    public static void main(String[] args) {
        int[] nums1 = { 5, 1, 3, 2 };
        int[] nums2 = { 4, 6, 3, 2, 1, 5, 0 };
        int[] nums3 = { 3, 2, 1, 0 };
        int[] nums4 = { 10, 100, 1, 1000 };
        int[] nums5 = { 10, 2, 6 };
        System.out.println(getMinMove(nums1));
        System.out.println(getMinMove(nums2));
        System.out.println(getMinMove(nums3));
        System.out.println(getMinMove(nums4));
        System.out.println(getMinMove(nums5));
    }

    /**
     * Copy and sort the array.
     * Find the number of elements (in the order/ sequentially) from the sorted array present in the original array.
     * Ans : Subtract above value from N
     * Step 2:
     * Ex: [5,1,3,2]
     * Sorted :[1,2,3,5]
     * Now start comparing you will find that only 1 and 2 is present in correct order in original array. Thus number of moves : 4 - 2 = 2
     */
    private static int getMinMove(int[] nums) {
        int[] sorted;
        int ans =  0;
        sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);
        int j=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]!=sorted[j]){
               ans++;
           }else{
               j++;
           }
        }
        return ans;
    }
}

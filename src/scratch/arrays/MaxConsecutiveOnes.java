package scratch.arrays;
//https://leetcode.com/problems/max-consecutive-ones/description/

import java.util.HashSet;
import java.util.Set;

/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 * The maximum number of consecutive 1s is 3.
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max=0;
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.clear();
                if(nums[i]!=0){
                    set.add(nums[i]);
                    count = 1;
                    max= Math.max(max, count);
                }
            }else{
                count++;
                max= Math.max(max,count);
            }

        }
        return max;
    }
}

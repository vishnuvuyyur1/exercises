package scratch.arrays;

import java.util.ArrayList;
import java.util.List;

public class PermutationsArraySize3 {
    private static final int[] FACT = { // 479001600 < 2147483647 < 6227020800
            1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600
    };
    public static void main(String[] args){
        int[] n = new int[]{1,2,3,4};
        permute(n).stream().forEach(list->System.out.println(list));
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<Integer> singlePermutation;
        int counter=0;
        int permutationsCounter=0;
        List<List<Integer>> allPermutations =  new ArrayList<>();
        int noOfPermutations =  FACT[nums.length];
        boolean counterReset= false;
        while(permutationsCounter < noOfPermutations) {
            singlePermutation = new ArrayList<>();
            for (int i = 0; i <= nums.length-1; i++) {
                singlePermutation.add(nums[i]);
            }
            allPermutations.add(singlePermutation);
            if(counterReset) {
                counter=0;
                counterReset=false;
            }
            if(counter< nums.length-1){
                int temp = nums[counter];
                nums[counter]=nums[counter+1];
                nums[counter+1]=temp;
            }
            if(counter == nums.length-1){
                if(nums.length==3) {
                    counterReset = true;
                    counter = 0;
                    int temp = nums[counter];
                    nums[counter] = nums[nums.length - 1];
                    nums[nums.length - 1] = temp;
                }else{
                    counter =1;
                    int temp = nums[counter];
                    nums[counter] = nums[nums.length - 1];
                    nums[nums.length - 1] = temp;
                }
            }
            counter++;
            permutationsCounter++;
        }
       return allPermutations;
    }
}


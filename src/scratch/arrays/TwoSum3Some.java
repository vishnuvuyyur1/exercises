package scratch.arrays;

import java.util.*;

public class TwoSum3Some {
    public static void main(String[] args) {
      twoSum();
      threeSum();
    }

    static void twoSum(){
        int[] nums = new int[]{2, 4, 11, 7, 15};
        int target = 9;
        int sum = 0;
        //2,4,11,7,15

        for (int i = 0; i < nums.length; i++) {
            for(int j=i+1; j<nums.length;j++) {
                if (nums[i]+nums[j] == target) {
                    int[] result = new int[]{i,j};
                    System.out.println(Arrays.toString(result));
                    break;
                }
            }
        }
    }

    static void threeSum(){
        int[] a= new int[]{-1,0,1,2,-1,-4};
        int target = 0;
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                for(int k=j+1;k<a.length;k++){
                    if(a[i]+a[j]+a[k]==target){
                        List<Integer> combination = new ArrayList<>(List.of(a[i], a[j], a[k]));
                        Collections.sort(combination);
                        result.add(combination);
                    }
                }
            }
        }
        result.stream().forEach(listItem->System.out.println(listItem));
    }
}

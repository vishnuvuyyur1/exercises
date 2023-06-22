package scratch.arrays;

import java.util.*;

public class TwoSum3Some {
    public static void main(String[] args) {
//      twoSum();
//      threeSum();
        twoSum2();
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

    public static int[] twoSum2() {
        int[] nums = new int[]{3,2,3,4,6};
        int target = 6;
        int counter = 0;
        int sum=nums[counter];
        int i=counter+1;
        while(i<nums.length){
            sum+= nums[i];
            if(sum==target){
                return new int[]{counter,i};
            }else{
                sum = sum-nums[i];
            }
            if(i==nums.length-1){
                counter++;
                i=counter+1;
                sum=nums[counter];
            }else{
                i++;
            }
        }
        return new int[0];
    }

    static void threeSum(){
        int[] a= {-1,1,2,0,-1,-4};
        //List<Integer> aList = Arrays.stream(a).boxed().toList();

        Arrays.sort(a);
        Collections.reverse(Arrays.asList(a));
        System.out.println(a);
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

package scratch.arrays;

import java.util.Arrays;

public class FindMissingNumberFromSortedArrayFor {
    public static void main(String[] args){
        int[] a = new int[] {1, 2, 4, 6, 3, 7, 8};
        Arrays.sort(a);
        int missing = 0;//3
        for(int i=0; i<a.length-1;i++){
            if(a[i]+1 != a[i+1]){
                missing = a[i]+1; 
            }
        }
        System.out.println(missing);
    }
    
}

package scratch.arrays;

import java.util.Arrays;
//Time Complexity for mergin two sorted arrays: O(N + M), space o(m+n), m, n are size of the input arrays
//space logic: i created a new array with m+n
public class MedianTwoSortedArrays {
    public static void main(String[] args){
        int[] a= new int[]{1,3,4,7};
        int[] b= new int[]{2,5,6,8};
        int[] c=new int[a.length+b.length];
        int bcounter = 0;
        int acounter = 0;
        int ccounter = 0;
        while(true){
            if(bcounter >= b.length){
                for(int i=acounter;i<a.length;i++){
                    c[ccounter] = a[i];
                    ccounter++;
                }
                break;
            }
            if(acounter >= a.length){
                for(int i=bcounter;i<b.length;i++){
                    c[ccounter] = b[i];
                    ccounter++;
                }
                break;
            }
            if(a[acounter]<b[bcounter]){
                c[ccounter]=a[acounter];
                acounter++;
            }else{
                c[ccounter]=b[bcounter];
                bcounter++;
            }
            ccounter++;
        }
        System.out.println(Arrays.toString(c));
        median(c);
    }

    static void median(int[] a){
        float median;
            if(a.length % 2 == 0){
                 median = (float)(a[a.length/2]+a[(a.length/2)-1])/2;
            }else{
                median = a[a.length/2];
            }
            System.out.println(median);
    }
}

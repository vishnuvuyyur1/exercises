package scratch.arrays;

import java.util.Arrays;

public class ArrayMergeAndSort {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 6, 8};
        int[] b = new int[]{2, 3, 7, 9};
        mergeTwoSortedArrays();
        for (int i : combineTwoArrays(a, b)) {
            System.out.println(i);
        }
        int[] nums1 = { 2, 1, 0, 3 };
        int[] nums2 = { 4, 6, 3, 2, 1, 5, 0 };
        int[] nums3 = { 3, 2, 1, 0 };
        int[] nums4 = { 10, 100, 1, 1000 };
        int[] nums5 = { 10, 2, 6 };
        doSort(nums1);
        doSort(nums2);
        doSort(nums3);
        doSort(nums4);
        doSort(nums5);
    }

    static int[] combineTwoArrays(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        return doSort(c);
    }

    static int[] doSort(int[] arr) {
        int moves=0;
        for(int a=0;a<arr.length-1; a++){
            for (int i = 0; i < arr.length-a- 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                ++moves;
            }
        }
        }
        System.out.println(moves);
        return arr;
    }

    static void mergeTwoSortedArrays(){
        int[] a = new int[]{1, 2, 6, 8};
        int[] b = new int[]{2, 3, 7, 9};
        int[] c= new int[a.length+b.length];
        int aCounter=0;
        int bCounter=0;
        int cCounter=0;
        while(true){
            if(aCounter>=a.length){
                for(int i=bCounter;i<b.length;i++){
                    c[cCounter]=b[i];
                    cCounter++;
                }
                break;
            }
            if(bCounter>=b.length){
                for(int i=aCounter;i<a.length;i++){
                    c[cCounter]=a[i];
                    cCounter++;
                }
                break;
            }
            //1<2
            //
            if(a[aCounter]<b[bCounter]){
                c[cCounter]=a[aCounter];
                aCounter++;
            }else{
                c[cCounter]=b[bCounter];
                bCounter++;
            }
            cCounter++;
        }
        System.out.println(Arrays.toString(c));
    }
}

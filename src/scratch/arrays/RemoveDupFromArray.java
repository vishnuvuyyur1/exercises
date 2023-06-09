package scratch.arrays;

import java.util.*;

public class RemoveDupFromArray {

    public static void main(String[] args){
        int[] a = new int[]{1,5,7,3,4,5,3};
         sort(a);
        System.out.println(Arrays.toString(rempoveDuplicates(a)));

        removeDuplicates3();
    }
    static int[] sort(int[] a){
        for(int e=0;e<a.length-1;e++) {
            for (int i = 0; i < a.length - 1-e; i++) {
                //2<1
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
        return a;
    }

    static int[] rempoveDuplicates(int[] a){
        int i=0; // count of unique elements after removing duplicates
        for(int j=1;j<a.length;j++){
            if(a[i]!=a[j]){ // comparing two adjacent numbers a[0],a[1],a[2] ->1,1,2
                ++i;        // increasing the unique count 1
                a[i]=a[j];  // a[1]=a[2]
            }
        }
        int[] b=new int[i+1];
        for(int j =0;j<b.length;j++){
            b[j]=a[j];
        }
        return b;
    }

    static int[] rempoveDuplicates2(){
        int[] a = new int[]{1,5,7,3,4,5,3};
        Set<Integer> s = new HashSet<>();
      for(int i =0; i<a.length-1;i++){
            s.add(a[i]);
      }
       int b[] = s.stream().mapToInt(i->i).toArray();
      return b;
    }

    static void removeDuplicates3(){
        int[] a = new int[]{1,5,7,3,4,5,3};
        List b = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length;j++){
                if(a[i]!=a[j] && !b.contains(a[i])){
                    b.add(a[i]);
                }
            }
        }
        System.out.println(b);
    }
}

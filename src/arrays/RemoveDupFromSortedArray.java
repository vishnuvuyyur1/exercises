package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class RemoveDupFromSortedArray {

    public static void main(String[] args){
        int[] a = new int[]{1,5,7,3,4,5,3};
        for(int j:solution(a)){
            System.out.println(j);
        }
        System.out.println();
        for(int j:rempoveDuplicates(solution(a))){
            System.out.println(j);
        }
        rempoveDuplicates2();
    }
    static int[] solution(int[] a){
        for(int e=0;e<a.length-1;e++) {
            for (int i = 0; i < a.length - 1-e; i++) {
                //2>1
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
        System.out.println(Arrays.toString(a));
        int[] b=new int[i+1];
        for(int j =0;j<b.length;j++){
            b[j]=a[j];
        }
        return b;
    }

    static int[] rempoveDuplicates2(){
        int[] a = new int[]{1,5,7,3,4,5,3};
        int[] b = new int[a.length];
        String s = new String();
      Map<Integer,Integer> countMap = new HashMap<>();
      for(int i =0; i<a.length-1;i++){
          if(!countMap.containsKey(a[i])){
              b[i]=a[i];
              s+=a[i];
              countMap.put(a[i],1);
          }
      }
      System.out.println(Arrays.toString(b));
        System.out.println(s);
      return b;
    }
}

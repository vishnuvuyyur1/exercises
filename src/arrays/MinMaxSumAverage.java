package arrays;

import java.util.Comparator;
import java.util.List;

public class MinMaxSumAverage {
   public static void main(String[] args){
       maxList();
       maxArray();
       sumList();

   }
    static void maxList() {
        List<Integer> list = List.of(1,4,5,2,7,4,9,7);
        int max = list.stream().max(Comparator.comparing(Integer::intValue)).get();
        System.out.println(max);
    }
    static void maxArray(){
        int[] a = new int[]{1,5,3,7,4,9};
        int max = Integer.MIN_VALUE;
        for(int i: a){
            if(i>max){
                max = i;
            }
        }
        System.out.println(max);
    }

    static void sumList(){
        List<Integer> list = List.of(1,4,5,2,7,4,9,7);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}

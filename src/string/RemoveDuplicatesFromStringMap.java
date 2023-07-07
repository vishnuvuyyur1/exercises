package string;

import java.util.*;

public class RemoveDuplicatesFromStringMap {
public static void main(String[] args){
    String s = "geeksforgeeks";
    int[] a={1,3,2,3,4,5,1};
    char[] c={'a','b'};
    int[] b = Arrays.stream(a).distinct().toArray();
    String out = "";
    for(Object o : s.chars().distinct().mapToObj(val ->(char)val).toArray()){
        out+=o;
    }
    rempoveDuplicates(s);
    rempoveDuplicates2(s);
}
    static String rempoveDuplicates(String str){
        String s = "";
        Map<Character,Integer> countMap = new HashMap<>();
        char[] a=str.toCharArray();
        for(int i =0; i<a.length-1;i++){
            if(!countMap.containsKey(a[i])){
                s+=a[i];
                countMap.put(a[i],1);
            }
        }
        System.out.println(s);
        return s;
    }

    static String rempoveDuplicates2(String str){
    Set set = new HashSet<>();
    String result="";
    for(char c: str.toCharArray()){
             if(!set.contains(c)){
                 result+= c;
                 set.add(c);
             }
           }
    System.out.println(result);
        return result;
    }

}

package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicatesFromStringMap {
public static void main(String[] args){
    String s = "geeksforgeeks";
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

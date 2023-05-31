package string;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromStringMap {
public static void main(String[] args){
    String s = "geeksforgeeks";
    rempoveDuplicates(s);
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
}

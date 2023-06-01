package string;

import java.util.*;

public class FirstNonRepeatingCharMap {
    public static void main(String[] args){
        String str = "walhalla";
        firstNonRepeatingChar(str);
        solution();
    }

    static Map<Character, Integer> letterCount(String str){
        Map<Character, Integer> countMap = new HashMap<>();
        for(char c: str.toCharArray()){
            if(countMap.containsKey(c)){
                int counter = countMap.get(c);
                countMap.put(c, ++counter);
            }else{
                countMap.put(c,1);
            }
        }
        return countMap;
    }

    static void firstNonRepeatingChar(String str){
        Map<Character, Integer> countMap = letterCount(str);
       for(char c: countMap.keySet()){
           if(countMap.get(c)==1){
               System.out.println(c);
               break;
           }
       }
    }

    static void solution(){
        String str = "walhalla";
        List s = new ArrayList<>();
        List d = new ArrayList<>();
        for(char c: str.toCharArray()){
            if(!s.contains(c)){
                s.add(c);
            }else{
                d.add(c);
            }
        }
        s.removeAll(d);
        System.out.println(s.get(0));
    }
}


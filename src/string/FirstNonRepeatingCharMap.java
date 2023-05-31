package string;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharMap {
    public static void main(String[] args){
        String str = "walhalla";
        firstNonRepeatingChar(str);
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
}


package string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringDuplicateLettersMap {
    public static void main(String[] args){
        String str = "walhalla";
        duplcateLetters(str);
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

    static void duplcateLetters(String str){
        Map<Character, Integer> countMap = letterCount(str);
        List<Character> duplicatesInString = countMap.keySet().stream().filter(letter -> countMap.get(letter)>1).toList();
        System.out.println(duplicatesInString);
    }
}

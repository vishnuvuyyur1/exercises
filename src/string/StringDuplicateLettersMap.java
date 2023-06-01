package string;

import java.util.*;

public class StringDuplicateLettersMap {
    public static void main(String[] args){
        String str = "walhalla";
        duplcateLetters(str);
        solution2();
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
        for(Map.Entry e:countMap.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }
        List<Character> duplicatesInString = countMap.keySet().stream().filter(letter -> countMap.get(letter)>1).toList();
        System.out.println(duplicatesInString);
    }
    static void solution2() {
        String str = "walhalla";
        List nonDupes = new ArrayList<>();
        Set dupes = new HashSet<>();
        for(char c: str.toCharArray()){
            if(nonDupes.contains(c)){
                dupes.add(c);
            }else{
                nonDupes.add(c);
            }
        }
        System.out.println(dupes);
    }
}

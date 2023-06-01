package string;

import java.util.*;

public class LenghtLongestSubstringWithoutRepeatingChars {
    public static void main(String[] args) {
        String s = "pwwkewkqwertket";
        Set set = new HashSet<>();
        List<Integer> length = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                if(i==s.length()-1){
                    length.add(set.size());
                }
            }else{
                length.add(set.size());
                set.clear();
                set.add(s.charAt(i));
            }
        }
        int max = length.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);
    }
}

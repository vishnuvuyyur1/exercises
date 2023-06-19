package string;

import java.util.*;

public class LenghtLongestSubstringWithoutRepeatingChars {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
       // partialWorkingSolution();
        System.out.println(lengthOfLongestSubstring2("dvdf"));
    }

    private static void partialWorkingSolution() {
        String s = "dvdf";
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
//sliding window solution

    /**
     Use sliding window with hashset,
     use left and right pointers to move the window .
     If the set doesn't contains character then first add into the set and calculate the maxLength hand-in-hand...
     if character already present in the set that means you have to move your sliding window by 1(start pointer) , before that you have to remove all the characters that are infront of the character that is present already in window before.
     Now add the new character into the set.
     THAT'S ALL........EASY APPROACH USING SIMPLE HASHSET+SLIDING WINDOW
     Space complexity: O(k), where k is the number of distinctive characters prsent in the hashset.
     Time complexity: O(n) or o(n2) since there is a while loop
     */
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> subStringHolder = new HashSet<>();
        int longestLength=0;
        int startPointer = 0;
        //abcbcaxm
        for(int i=0;i<s.length();i++){
            if(!subStringHolder.contains(s.charAt(i))){
                subStringHolder.add(s.charAt(i));
                longestLength = Math.max(longestLength, subStringHolder.size());
            }else{
                while(subStringHolder.contains(s.charAt(i))){
                    subStringHolder.remove(s.charAt(startPointer));
                    startPointer++;
                }
                subStringHolder.add(s.charAt(i));
            }

        }
        return longestLength;
    }

    public static int lengthOfLongestSubstring2(String s) {
        int length= 0;
        int index=0;
        List<Character> set = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                length = Math.max(length, set.size());
            }else{
                length = Math.max(length, set.size());
                index = set.indexOf(s.charAt(i));
                while(index>=0){
                    set.remove(index);
                    index--;
                }
                set.add(s.charAt(i));
            }
        }
        return length;

    }
}

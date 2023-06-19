package string;

import java.util.*;

public class LongestPalindrome {

    public static void main(String[] args){
        System.out.println(longestPalindrome("babad"));
    }
    public static String longestPalindrome(String s) {
        s= s.toLowerCase().replaceAll("[^a-z0-9]","");
        if(s.length()==1) return s;
        if(s.length()==2){
            return s.charAt(0) == s.charAt(1) ? s : String.valueOf(s.charAt(0));
        }
        //aab
        if(isPalindrome(s)) {
            return s;
        }else {
            Map<Integer, String> map=  new HashMap<Integer,String>();
        int index = 0;
            while(index < s.length()-2){
            String s1 = getPalindromeSubString(s.substring(index,s.length()));
            index++;
            if(s1!=null)
            map.put(s1.length(),s1);
        }
           return map.size()>=1?map.get(map.keySet().stream().max(Comparator.comparing(Integer::intValue)).get()):"";
        }
    }

    private static String getPalindromeSubString(String s) {
        for (int i = 0; i < s.length()-1; i++) {
            if(isPalindrome(s.substring(i+1))){
                s = s.substring(i+1);
                return s;
            }
            String substring = s.substring(0, s.length() - 1 - i);
            if(isPalindrome(substring)){
                return substring;
            }
        }
        return null;
    }

    static boolean isPalindrome(String s){
       // System.out.println(s);
        if(s.length()==1){
            return false;
        }
        if(s.length()==2){
            return s.charAt(0) == s.charAt(1);
        }

        int endIndex = s.length()-1;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(endIndex-i)){
                return false;
            }
        }
        return true;
    }
}

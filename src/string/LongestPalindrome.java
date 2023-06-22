package string;

import java.util.*;

public class LongestPalindrome {

    public static void main(String[] args){
        System.out.println(longestPalindrome("babad"));
    }
    public static String longestPalindrome(String s) {
        s= s.toLowerCase().replaceAll("[^a-z0-9]","");
        if(s.length()==1){
            return s;
        }
        if(s.length()==2){
            return isPalindrome(s)?s:String.valueOf(s.charAt(0));
        }
        if(isPalindrome(s)){
            return s;
        }else{
            String out="";
            for(int i=0;i<s.length();i++){
                String sub="";
                sub+=s.charAt(i);
                for(int j=i+1;j<s.length();j++){
                    sub+=s.charAt(j);
                    if(isPalindrome(sub)){
                        out = sub.length()>out.length()?sub:out;
                    }
                }
            }
            return out;
        }

    }

    static boolean isPalindrome(String s){
        int endIndex = s.length()-1;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(endIndex-i)){
                return false;
            }
        }
        return true;
    }
}

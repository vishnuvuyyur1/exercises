package scratch;

public class Palindrome {
    public boolean isPalindrome(String s) {
        s= s.toLowerCase().replaceAll("[^a-z0-9]","");
        int endIndex = s.length()-1;
        //abba
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!= s.charAt(endIndex-i)){
                return false;
            }
        }
        return true;
    }
}

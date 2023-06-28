package scratch;

/**
 * Input: s = "abbaca"
 * Output: "ca"
 * Explanation:
 * For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal,
 * and this is the only possible move.  The result of this move is that the string is "aaca",
 * of which only "aa" is possible, so the final string is "ca".
 */
public class RemoveAllAdjacentDuplicates {
    public static void main(String[] args){
        //"azxxzy" ay
        //aaaaaaaa a
        //aaaaaaaaa ""
        //abbaca ca
        //aababaab ba
        //abbbabaaa "ababa"
        System.out.println(removeDuplicates("abbbabaaa"));
    }
    public static String removeDuplicates(String s) {
        String sub="";
        for(int i=0;i<s.length();i++){
            if(sub.contains(String.valueOf(s.charAt(i)))){
                if(i>0 && sub.charAt(sub.length()-1)==s.charAt(i)){
                    if(sub.length()==1){
                        sub="";
                    }else {
                        sub = sub.substring(0, sub.length() - 1);
                    }
                }else{
                    sub+= s.charAt(i);
                }
            }else {
                sub+= s.charAt(i);
            }
        }
        return sub;
    }
}

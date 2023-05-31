package string;

import java.util.HashSet;
import java.util.Set;

public class PanagramCheckSet {
    public static void main(String[] args) {
        String s = "pack my box with five dozn liquor jugs";
        String str = s.replaceAll("\\s+", "");
        System.out.println(str);
        Set<Character> a = new HashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            a.add(str.charAt(i));
        }
        if(a.size()==26){
            System.out.println("Panagram");
        }
    }
}

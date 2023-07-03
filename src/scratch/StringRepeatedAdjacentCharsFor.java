package scratch;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
// input aabbcbbbdeeee - 2a2b1c3b1d4e
public class StringRepeatedAdjacentCharsFor {
    public static void main(String[] args){
        String str = "aabbcbbbdee";
        //output = a2bc3bd2e
        StringBuilder sb = new StringBuilder();
        int count=1;
        boolean seqBroke = false;
        for(int i=0; i < str.length()-1; i++){
            if(seqBroke && i>=1 && count>1){
                sb.append(count);
                sb.append(str.charAt(i-1));
                count = 1;
            }else if(seqBroke && i>=1){
                sb.append(str.charAt(i-1));
            }
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
                seqBroke = false;
            }else{
                seqBroke = true;
            }
        }
        //System.out.println(sb);
        solution2();
        solution3();
    }

    static void solution(){
            String str = "aabbcbbbdeeee";
            //output = 2a2bc3bd2e
        Set s = new HashSet<>();
        int count=0;
        String output ="";
        char[] c = str.toCharArray();
        for(int i=0;i<c.length;i++){
            if(!s.contains(c[i])){
                if(count>1){
                    output+=count;
                    output+=c[i-1];
                    s.remove(c[i-1]);
                    count = 1;
                }else{
                    if(s.size()>=1){
                        output+=c[i-1];
                        s.remove(c[i-1]);
                    }
                    count=1;
                }
                s.add(c[i]);
            }else{
                count++;
            }
            if(i==c.length-1){
                if(count>1){
                    output+=count;
                    output+=c[i];
                }else{
                    output+=c[i];
                }

            }
        }
        String st = output.substring(1);
        System.out.println(st);
    }

    static void solution2(){
        String s="aabbcbbbdeeee";
        int max=1;
        int count=1;
        String sub="";
        sub+=s.charAt(0);
        String out="";
        if(s.length()==1){
            out+=s.charAt(0);
        }
        for(int i=1;i<s.length();i++){
            if(!sub.contains(String.valueOf(s.charAt(i)))){
                    sub="";
                    sub+=s.charAt(i);
                    out+=count;
                    out+=s.charAt(i-1);
                    if(i==s.length()-1){
                        out+=1;
                        out+=s.charAt(i);
                    }
                count =1;
            }else{
                count++;
                max= Math.max(max,count);
                if(i==s.length()-1){
                    out+=count;
                    out+=s.charAt(i-1);
                }
            }
        }
        System.out.println(out);
        System.out.println(max);
    }

    //For e.g. “aaaabbbbaaaaaaacd”, should result in a: 7, b: 3, c: 1, d: 1
    // NOTE: “a” occurs twice consecutively, but the second instance has the maximum occurre
    static void solution3(){
        String s="aaaabbbbaaaaaaacd";
        int count=1;
        String sub="";
        sub+=s.charAt(0);
        String out="";
        Map<Character,Integer> map = new HashMap<>();
        if(s.length()==1){
            out+=s.charAt(0);
        }
        for(int i=1;i<s.length();i++) {
            if(!sub.contains(String.valueOf(s.charAt(i)))){
               sub="";
               sub+=s.charAt(i);
                extracted(s, count, map, i);
                count =1;
                if(i==s.length()-1){
                    extracted(s, count, map, i+1);
                }
            }else{
                count++;
                if(i==s.length()-1){
                    extracted(s, count, map, i);
                }
            }
        }
        System.out.println(map);
    }

    private static void extracted(String s, int count, Map<Character, Integer> map, int i) {
        if(map.containsKey(s.charAt(i -1))){
            int c = map.get(s.charAt(i -1));
            if(count >c){
                 map.put(s.charAt(i -1), count);
            }
        }else{
            map.put(s.charAt(i -1), count);
        }
    }

}

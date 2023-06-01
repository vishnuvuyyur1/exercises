package scratch;

import java.util.HashSet;
import java.util.Set;

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
        System.out.println(sb);
        solution();
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
}

public class StringRepeatedChars {
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
    }
}

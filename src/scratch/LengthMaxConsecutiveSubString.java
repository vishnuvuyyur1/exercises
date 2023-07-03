package scratch;

public class LengthMaxConsecutiveSubString {
    public static void main(String[] args){
        String str="abbcccdddddcbaeeeee";
        int count = 1;
        int breakcount = 1;
        for(int i=0;i<str.length()-1;i++){
            //c==c b b==b
            if(str.charAt(i)==str.charAt(i+1)){
                ++count;
            }else{
                if(breakcount < count){
                    breakcount = count;
                }
                count =1;
            }
        }
        System.out.println(breakcount);
    }
    public int maxPower(String s) {
        int max=1;
        int count=1;
        String sub="";
        sub+=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(!sub.contains(String.valueOf(s.charAt(i)))){
                sub="";
                sub+=s.charAt(i);
                count =1;
            }else{
                count++;
                max= Math.max(max,count);
            }
        }
        return max;
    }
}

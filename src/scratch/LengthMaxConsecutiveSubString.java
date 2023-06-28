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
        String sub="";
        int count=1;
        boolean repeated = false;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(i>0){
                if(!sub.contains(String.valueOf(s.charAt(i)))){
                    sub="";
                    sub+=s.charAt(i);
                    count=1;
                    max= Math.max(max,count);
                }else{
                    count++;
                    max= Math.max(max,count);
                }
            }else{
                sub+=s.charAt(i);
                max= Math.max(max,count);
            }
        }
        return max;
    }
}

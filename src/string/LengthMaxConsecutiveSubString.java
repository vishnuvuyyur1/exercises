package string;

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
}

package scratch;

public class ReverseInteger {
    public static void main(String[] args){
        int x=-123;
        String xs = String.valueOf(x);
        System.out.println(xs);
        System.out.println(Integer.parseInt("-123"));
        char[] c = xs.substring(1).toCharArray();
        int iterator = c.length/2;
        for(int i=0;i<iterator;i++){
                char temp = c[i];
                c[i]=c[c.length-1-i];
                c[c.length-1-i]=temp;
        }
        String output="";
        for(char p:c){
            output+=p;
        }
        System.out.println(output);
        System.out.println(Integer.parseInt("-"+output));
    }
}

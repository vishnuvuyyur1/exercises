package string;

import java.util.Arrays;

//An anagram contains are of the same length and contains the same character,
// but in a different order, for example, "Army" and "Mary" is the anagram.
//
//Read more: https://www.java67.com/2018/04/21-string-programming-and-coding-interview-questions-answers.html#ixzz836AszIue
public class AnagramCheck {
    public static void main(String[] args){
        String a="Army";
        String b="Mary";
        solution(a,b);
    }

    static void solution(String a, String b){
        char[] a1= sortChars(a.toLowerCase().toCharArray());
        char[] b1=sortChars(b.toLowerCase().toCharArray());
        boolean anagram = true;
      for(int i=0;i<a1.length;i++){
          if(a1[i]!=b1[i]){
              anagram=false;
              break;
          }

      }
      System.out.println(anagram);
    }

    static char[] sortChars(char[] a){
        for(int e=0;e<a.length-1;e++) {

            for (int i = 0; i < a.length - 1-e; i++) {
                if (a[i] < a[i + 1]) {
                    char temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        return a;
    }


}

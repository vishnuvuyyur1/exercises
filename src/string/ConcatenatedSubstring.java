package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *https://leetcode.com/problems/substring-with-concatenation-of-all-words/description/
 * Input: s = "barfoothefoobarman", words = ["foo","bar"]
 * Output: [0,9]
 * Explanation: Since words.length == 2 and words[i].length == 3, the concatenated substring has to be of length 6.
 * The substring starting at 0 is "barfoo". It is the concatenation of ["bar","foo"] which is a permutation of words.
 * The substring starting at 9 is "foobar". It is the concatenation of ["foo","bar"] which is a permutation of words.
 * The output order does not matter. Returning [9,0] is fine too
 */
public class ConcatenatedSubstring {
    private static final int[] FACT = { // 479001600 < 2147483647 < 6227020800
            1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600
    };
    public static void main(String[] args){
      String  s = "barfoofoobarthefoobarman";
      String[] words = {"bar","foo","the","amg"};
      String combination="";
      int counter=0;
      int permutationsCounter=0;
      List<String> combinations =  new ArrayList<>();
       int noOfPermutations =  FACT[words.length];
        boolean counterReset= false;
          while(permutationsCounter < noOfPermutations) {
              for (int i = 0; i <= words.length-1; i++) {
                  combination += words[i];
              }
              combinations.add(combination);
              combination = "";
              if(counterReset) {
                  counter=0;
                  counterReset=false;
              }
              if(counter< words.length-1){
                  String temp = words[counter];
                  words[counter]=words[counter+1];
                  words[counter+1]=temp;
              }
              if(counter == words.length-1){
                  counterReset = true;
                  counter = 0;
                  String temp = words[counter];
                  words[counter]=words[words.length-1];
                  words[words.length-1]=temp;
              }
              counter++;
              permutationsCounter++;
          }
          System.out.println(combinations.size());
        combinations.stream().forEach(com->System.out.println(com));

    }
}

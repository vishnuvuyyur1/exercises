package string;

import java.util.*;

/**
 *https://leetcode.com/problems/substring-with-concatenation-of-all-words/description/
 * Input: s = "barfoothefoobarman", words = ["foo","bar"]
 * Output: [0,9]
 * Explanation: Since words.length == 2 and words[i].length == 3, the concatenated substring has to be of length 6.
 * The substring starting at 0 is "barfoo". It is the concatenation of ["bar","foo"] which is a permutation of words.
 * The substring starting at 9 is "foobar". It is the concatenation of ["foo","bar"] which is a permutation of words.
 * The output order does not matter. Returning [9,0] is fine too
 */
public class PermutationsConcatenatedSubstring {

    public static void main(String[] args){
      String  s = "foobarfoobar";
      String[] words = {"foo","bar"};
      System.out.println(s.indexOf('f'));
        Set<String> set = new HashSet<>();
        List<Integer> output = new ArrayList<>();
        permute(words,0, set);
        for(String combi: set){
            if(s.contains(combi)){
                int beginIndex= s.indexOf(combi);
                while(beginIndex!=-1){
                    output.add(beginIndex);
                    beginIndex = s.indexOf(combi,beginIndex+1);
                }
            }
        }
        System.out.println(output);
    }

    static Set<String> permute(String[] words, int i, Set<String> set){

      if(i==words.length){
          String combination="";
          for(String word: words)
              combination+=word;
          set.add(combination);
      }
      for(int j=i; j<words.length;j++){
          swap(words,i,j);
          permute(words,i+1, set);
          swap(words,i,j);
      }
        return set;
    }
    static void swap(String[] words,int i,int j){
        String temp = words[i];
        words[i]=words[j];
        words[j]=temp;
    }
}

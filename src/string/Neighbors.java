package string;

import java.util.*;

/**
 * Given a list of strings/words, return a list/table of all the letters found in multiple strings where it’s occurring most with other letter or letters.
 *
 * Example:
 *
 * Input: ["abef", "bcd", "bde", "cadf"]
 *
 * Output:
 * [
 *  a: {f} // f occurs 2 times with a
 *  b: {d,e} // d and e occur 2 times with b
 *  c: {d} // d occurs 2 times with c
 *  d: {b,c} // b and c occur 2 times with d
 *  e: {b} // b occurs 2 times with e
 *  f: {a} // a occurs 1 time with f
 * ]
 *
 * Given an input list of strings, for each letter appearing anywhere
 * in the list, find the other letter(s) that appear in the most
 * number of words with that letter.
 *
 * Example:
 * ['abc', 'bcd', 'cde'] =>
 *   {
 * 	a: [b, c],	# b appears in 1 word with a, c appears in 1 word with a
 * 	b: [c], 	# c appears in 2 words with b, a and d each appear in only 1 word with b
 * 	c: [b, d], 	# b appears in 2 words with c, d appears in 2 words with c. But a and e each
 * 					  appear in only 1 word with c.
 * 	d: [c],		# c appears in 2 words with d. But b and e each appear in only 1 word with d
 * 	e: [c, d], 	# c appears in 1 word with e, d appears in 1 word with e
 *
 *   }
 *
 */

public class Neighbors {
    public static void main(String[] args){
        //"abef", "bcd", "bde", "cadf" ans) {a=[f], b=[d, e], c=[d], d=[b, c], e=[b], f=[a]}
        //"abc", "bcd", "cde" ans) {a=[b, c], b=[c], c=[b, d], d=[c], e=[c, d]}
        String[] array = {"abc", "bcd", "cde"};
       // getMaxNeighbor(array);
        wordFrequency(array);
        main();
    }
    private static Map<Character, Set<Character>> wordFrequency(String[] strs) {
        Set<Character> all = new HashSet<>();
        Map<String, Integer> counts = new HashMap<>();

        for(String str : strs) {
            char[] chars = str.toCharArray();

            for (int i = 0; i < chars.length; i ++) {
                for(int j = 0; j < chars.length; j ++) {

                    if(i == j) continue;
                    StringBuilder charBuilder = new StringBuilder();
                    charBuilder.append(chars[i]);
                    charBuilder.append(chars[j]);
                    counts.put(charBuilder.toString(), counts.getOrDefault(charBuilder.toString(), 0) + 1);
                }
                all.add(chars[i]);
            }
        }

        Map<Character, Set<Character>> result = new HashMap<>();
        for(char first: all) {
            int max = 1;
            Set<Character> uniques = new HashSet<>();
            for(char second: all) {
                if(first == second) continue;
                StringBuilder charBuilder = new StringBuilder();
                charBuilder.append(first);
                charBuilder.append(second);

                int count = counts.getOrDefault(charBuilder.toString(), -1);
                if(count == max) {
                    uniques.add(second);
                    //max = count;
                }
                else if(count>max){
                    uniques.clear();
                    uniques.add(second);
                    max=count;
                }
            }
            result.put(first, uniques);
        }
        System.out.println(result);
        return result;
    }

    public static void main() {
        String[] arry={"abef", "bcd", "bde", "cadf"};
        Map<String,Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        Arrays.stream(arry).forEach(word ->{
            for(int i=0;i<word.length();i++){

                for(int j=0;j<word.length();j++){
                    if(i==j) continue;
                    String comb="";
                    comb+=word.charAt(i);
                    comb+=word.charAt(j);
                    map.put(comb, map.getOrDefault(comb,0)+1);
                }
                set.add(word.charAt(i));
            }
        });
        Character[] chars = set.toArray(Character[]::new);
        Map<Character,Set<Character>> output = new HashMap<>();
        for(int x=0;x<chars.length;x++){
            int initial=1;
            output.put(chars[x],new HashSet<>());
            for(int y=0;y<chars.length;y++){
                if(x==y) continue;
                String combi="";
                combi+=chars[x];
                combi+=chars[y];


                //ab-1 ac-2
                int count = map.getOrDefault(combi,0);
                if(count==initial){
                    output.get(chars[x]).add(chars[y]);
                }else if(count>initial){
                    initial =count;
                    output.get(chars[x]).clear();
                    output.get(chars[x]).add(chars[y]);
                }
            }
        }
        System.out.println(output);
    }
}

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
 */
public class Neighbors {
    public static void main(String[] args){
        //"abef", "bcd", "bde", "cadf" ans) {a=[f], b=[d, e], c=[d], d=[b, c], e=[b], f=[a]}
        //"abc", "bcd", "cde" ans) {a=[b, c], b=[c], c=[b, d], d=[c], e=[c, d]}
        String[] array = {"abc", "bcd", "cde"};
       // getMaxNeighbor(array);
        wordFrequency(array);
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
}

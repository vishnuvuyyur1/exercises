package string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a String of characters and a List of words. Return the max times the string can write one of the word.
 * S="BILLOBILLOLLOBBI" List = ["BILL", "BOB"]
 * max = 3, Bill can be printed 3 times, Bob can be print twice.
 * S="CAT", L = ["ILOVEDOG", "CATS"]
 * max = 0
 */
public class WordAppears {
    public static void main(String[] args) {
        //"ILOVEDOG", "CATS" S="CAT" {CATS=0, ILOVEDOG=0}
        //["BILL","BOB"] "BILLOBILLOLLOBBI" ans){BOB=1, BILL=3}
        Map<String,Integer> map =  new HashMap<>();
        String str="BILLOBILLOLLOBBI";
        List<String> list= List.of("BILL", "BOB");
        for(String word:list){
            boolean wordPresent = true;
            int countAppeared = 0;
            String temp = str;
            while(wordPresent){
                for(char c:word.toCharArray()){
                    if(!temp.contains(String.valueOf(c))){
                        wordPresent = false;
                    }
                }
                if(wordPresent){
                    countAppeared++;
                    for(char c:word.toCharArray()){
                        temp = temp.replaceFirst(String.valueOf(c),"");
                    }
                }
            }
            map.put(word,countAppeared);
        };
        System.out.println(map);
    }
}

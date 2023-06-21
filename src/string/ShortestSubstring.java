package string;
//Given an input list of names, for each name, find the shortest substring that only appears in that name.

import java.util.*;

public class ShortestSubstring {

    public static void main(String[] args){
        shortestUniqueSubstr();
    }

    private static void shortestUniqueSubstr() {
        List<String> list = List.of("cheapair", "cheapoair", "peloton", "pelican");
        Map<String, String> output = new HashMap<>();
        List<String> out = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            char[] array = list.get(i).toCharArray();
            out.add(list.get(i));
            output.put(list.get(i),list.get(i));
            for(int j=0;j<array.length;j++){
                String subString = "";
                subString+=array[j];
                for(int k=j+1;k<array.length;k++){
                    subString+=array[k];
                    for(int x =0;x<list.size();x++){
                           if(list.get(x)!=list.get(i)){
                               if(!list.get(x).contains(subString)){
                                   if(subString.length() < out.get(i).length()){
                                       out.set(i,subString);
                                   }
                                   if(output.get(list.get(i)).length()>subString.length())
                                          output.put(list.get(i),subString);
                               }else{
                                   if(output.get(list.get(i))==subString){
                                       output.put(list.get(i), list.get(i));
                                   }
                                   if(out.contains(subString)) {
                                       out.set(i, list.get(i));
                                   }
                                   break;
                               }
                           }
                    };
                }

            }
        }
        System.out.println(output);
        System.out.println(out);
    }
}

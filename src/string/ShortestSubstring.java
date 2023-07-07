package string;
//Given an input list of names, for each name, find the shortest substring that only appears in that name.

import java.util.*;

public class ShortestSubstring {
    /**
     * Input: ["cheapair", "cheapoair", "peloton", "pelican"]
     * Output:
     * "cheapair": "pa"  // every other 1-2 length substring overlaps with cheapoair
     * "cheapoair": "po" // "oa" would also be acceptable
     * "pelican": "ca"   // "li", "ic", or "an" would also be acceptable
     * "peloton": "t"    // this single letter doesn't occur in any other string
     *
     */
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

    public static void main() {
        System.out.println("Hello World!");
        String[] arry = {"cheapair", "heapoair", "cheloton", "pelican"};
        Map<String,String> map = new HashMap<>();
        for(int a=0;a<arry.length;a++){
            char[] chars = arry[a].toCharArray();
            String output = arry[a];

            for(int i=0;i<chars.length;i++){
                String sub="";
                sub+=chars[i];
                for(int j=i+1;j<chars.length;j++){
                    sub+=chars[j];
                    for(int b=0;b<arry.length;b++){
                        if(a==b) continue;
                        if(arry[b].contains(sub)){
                            if(output.equals(sub)) output=arry[a];
                            break;
                        }else{
                            output = output.length()>sub.length()? sub:output;
                        }

                    }

                }
            }
            map.put(arry[a],output);
        };
        System.out.println(map);
    }
}

package arrays;

import java.util.*;
// System.out.println(Arrays.stream(arr).mapToObj(Integer::toString).collect(Collectors.joining(",")));

public class ArrayMergeWithNoDuplicatesMap {
    public static void main(String[] args){
        int[] a = new int[]{1,2,5,7,9,1};
        int[] b = new int[]{1,3,4,7};
        solution(a,b);
        solution2(a,b);
        solution3();
    }
    static void solution(int[] a, int[] b){
        int[] c = new int[a.length+b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int i:c){
            if(countMap.containsKey(i)){
                int counter = countMap.get(i);
                countMap.put(i,++counter);
            }else{
                countMap.put(i,1);
            }
        }
        int[] result = countMap.keySet().stream().filter(i -> countMap.get(i)==1).mapToInt(i->i).toArray();
            for(int o: result){
                System.out.println(o);
            }
    }

    static void solution2(int[] a, int[] b){
        int[] c = new int[a.length+b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        System.out.println(Arrays.toString(c));
        Set all = new TreeSet<>();
        Set dupes = new HashSet<>();
        for(int i=0;i<c.length;i++){
            if(all.contains(c[i])){
                dupes.add(c[i]);
            }else{
                all.add(c[i]);
            }
        }
        all.removeAll(dupes);
        System.out.println(all);
    }

    static void solution3(){
        int[] a = new int[]{1,2,5,7,9,1};
        int[] b = new int[]{1,3,4,7};

        List<Integer> A= Arrays.stream(a).boxed().toList();
        List<Integer> B=Arrays.stream(b).boxed().toList();
        List<Integer> ItemsInANotInB= A.stream().filter(itemA->!B.contains(itemA)).toList();
        List<Integer> ItemsInBNotInA= B.stream().filter(itemA->!A.contains(itemA)).toList();
        List output = new ArrayList<>();
        output.addAll(ItemsInANotInB);
        output.addAll(ItemsInBNotInA);
        output.stream().mapToInt(k-> (int) k).toArray();
        System.out.println(output);
    }
}


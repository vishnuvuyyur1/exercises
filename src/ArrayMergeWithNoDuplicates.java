import java.util.HashMap;
import java.util.Map;

public class ArrayMergeWithNoDuplicates {
    public static void main(String[] args){
        int[] a = new int[]{1,2,5,7,9};
        int[] b = new int[]{1,3,4,7};
        solution(a,b);
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
}


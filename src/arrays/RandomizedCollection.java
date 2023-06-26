package arrays;

import java.util.*;


// TC: O(1) - O(1) - O(1)
// SC: O(n)

public class RandomizedCollection {
    List<Integer> list;
    Map<Integer,HashSet<Integer>> map;
    Random rd;
    public RandomizedCollection() {
        list = new ArrayList<>();
        map=  new HashMap<>();
        rd = new Random();
    }

    public boolean insert(int val) {
        if(map.get(val)==null|| map.get(val).isEmpty()) {
            map.put(val, new HashSet<>());
        }
            map.get(val).add(list.size());
            list.add(val);
        return map.get(val).size()==1;
    }

    public boolean remove(int val) {
        if(map.get(val)==null || map.get(val).isEmpty()) return false;
        int index = map.get(val).iterator().next();
        map.get(val).remove(index);
        int lastValue = list.get(list.size()-1);
        list.set(index,lastValue);
        map.get(lastValue).add(index);
        map.get(lastValue).remove(list.size()-1);
        list.remove(list.size()-1);
        return true;
    }

    public int getRandom() {
        return list.get(rd.nextInt(list.size()));
    }


    public static void main(String[] args){
        RandomizedCollection randomizedCollection = new RandomizedCollection();
        randomizedCollection.insert(9);
        randomizedCollection.insert(9);
        randomizedCollection.insert(1);
        randomizedCollection.insert(1);
        randomizedCollection.insert(2);
        randomizedCollection.insert(1);
        randomizedCollection.remove(2);
        randomizedCollection.remove(1);
        randomizedCollection.remove(1);
        randomizedCollection.insert(1);
        randomizedCollection.remove(9);

    }
}

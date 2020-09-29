package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
// №1
public class N1 {
    public static void main(String[] args) {
        getLetterMap("аабабаббабадддцафщовшыайапвщаиав");
    }

    public static void getLetterMap(String text){
        text = text.toLowerCase();

        HashMap<Character, Integer> lettersMap = new HashMap<>();
        for(int i=0; i < text.length(); i++){
            char ch = text.charAt(i);
            lettersMap.compute(ch, (k,v)->v==null?1:v+1);
        }
        ArrayList<Map.Entry<Character, Integer>> listToSort = new ArrayList<>(lettersMap.entrySet());
        listToSort.sort((o1, o2) -> Character.compare(o1.getKey(), o2.getKey()));
        for(Map.Entry<Character, Integer> entri: listToSort){
            System.out.println(entri.getKey() + " " + entri.getValue());
        }
    }
    
    // №2
    public static <K, V> Map<V, HashSet<K>> revertedMap(HashMap<? extends K, ? extends V> mapToRevert){
        HashMap<V, HashSet<K>> mapFinal = new HashMap<>();
        Set<K> keys = (Set<K>) mapToRevert.keySet();

        for (K key: keys){
            V value = mapToRevert.get(key);
            mapFinal.compute(value, (v,k) ->{
                if(k == null)
                    k = new HashSet<>();
                k.add(key);
                return k;
            });
        }
        return mapFinal;
    }
}

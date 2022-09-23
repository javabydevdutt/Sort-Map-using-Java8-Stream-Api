package com.map.sort;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Sort_Map_Key_Using_Stream_ASC {

    //This method is for sort the map based on the key in Ascending order
    private static LinkedHashMap<String, Integer> sortMapKeyByAsc(Map<String, Integer> unSortMap) {
        LinkedHashMap<String, Integer> sortMapKeyAsc = unSortMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        return sortMapKeyAsc;
    }

    public static void main(String[] args) {
        Map<String, Integer> unSortMap = new HashMap<String, Integer>();
        unSortMap.put("fish", 10);
        unSortMap.put("hen", 30);
        unSortMap.put("ice", 20);
        unSortMap.put("egg", 40);
        unSortMap.put("girl", 70);
        unSortMap.put("dog", 50);
        unSortMap.put("ball", 90);
        unSortMap.put("cat", 80);
        unSortMap.put("apple", 60);

        //call the method
        LinkedHashMap<String, Integer> sortMapAsc = sortMapKeyByAsc(unSortMap);

        //print the sorted Map
        System.out.println(sortMapAsc);
    }//main
}//class

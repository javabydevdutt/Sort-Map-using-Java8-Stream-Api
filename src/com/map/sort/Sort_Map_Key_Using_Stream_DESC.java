package com.map.sort;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Sort_Map_Key_Using_Stream_DESC {
    
    //This method is for sort the map based on the key in descending order
    private static LinkedHashMap<String, Integer> sortMapKeyByDesc(Map<String, Integer> unSortMap) {
        LinkedHashMap<String, Integer> sortMapDesc = unSortMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByKey().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        return sortMapDesc;
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
        LinkedHashMap<String, Integer> sortMapDesc = sortMapKeyByDesc(unSortMap);

        //print the sorted Map
        System.out.println(sortMapDesc);
    }//main
}

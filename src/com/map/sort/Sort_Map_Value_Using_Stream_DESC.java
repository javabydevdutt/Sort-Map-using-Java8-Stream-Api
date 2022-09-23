package com.map.sort;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Sort_Map_Value_Using_Stream_DESC {
    
    //This method is for sort the map based on the value in Descending order
    private static LinkedHashMap<String, Integer> sortMapValueByDesc(Map<String, Integer> unSortMap) {
        LinkedHashMap<String, Integer> sortMapValueDesc = unSortMap.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        return sortMapValueDesc;
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
        LinkedHashMap<String, Integer> sortMapValueDesc = sortMapValueByDesc(unSortMap);

        //print the sorted Map
        System.out.println(sortMapValueDesc);
    }//main
}

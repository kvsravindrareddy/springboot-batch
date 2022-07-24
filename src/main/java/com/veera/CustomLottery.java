package com.veera;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CustomLottery {
    public Map<String, Integer> parkingSlotResults(int availSlots) {
        Integer[] arr = new Integer[22];
        List<String> flats = Arrays.asList("G1", "G2", "G3", "G4",
                "101", "102", "103", "104",
                "201", "202", "203", "204",
                "301", "302", "303", "304",
                "401", "402", "403", "404",
                "501", "502");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        Collections.shuffle(Arrays.asList(arr));
        List<Integer> shuffleList = Arrays.asList(arr);
        for(int i=0;i<shuffleList.size();i++) {
            map.put(flats.get(i),shuffleList.get(i));
        }
        return map;
    }
}
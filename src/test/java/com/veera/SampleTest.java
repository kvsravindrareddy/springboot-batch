package com.veera;

import java.util.HashMap;
import java.util.Map;

public class SampleTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.entrySet().forEach(val-> System.out.println(val.getKey()));
    }
}
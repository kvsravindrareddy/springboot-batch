package com.veera.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        String[] strArr = {"Java","C","Python"};

        //List<String> list = Arrays.asList(strArr);
        List<String> list = new ArrayList<>(Arrays.asList(strArr));
        System.out.println(list);
        list.add("Angular");
        System.out.println(list);

        List<String> arrList = new ArrayList<>();
        for(int i=0;i<strArr.length;i++) {
            arrList.add(strArr[i]);
        }
        System.out.println(arrList);
    }
}